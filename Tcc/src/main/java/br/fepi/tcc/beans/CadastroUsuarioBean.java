package br.fepi.tcc.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.model.tipoConta;
import br.fepi.tcc.negocio.CadastroUsuarios;
import br.fepi.tcc.negocio.exception.NegocioException;
import br.fepi.tcc.repositorio.Usuarios;
import br.fepi.tcc.util.DataSource;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	private List<Usuario> todosUsuarios = new ArrayList<>();
	
	private Usuarios usuariosLogados;

	public void prepararCadastro()
	{
		if(this.usuario == null)
		{
			this.usuario = new Usuario();
		}
	}
	
	public void logar() throws IOException
	{
		EntityManager em = DataSource.getEntityManager();
		EntityTransaction et = em.getTransaction();
		FacesContext faces = FacesContext.getCurrentInstance();
		
		if(usuario == usuariosLogados.logados(usuario.getUsuario(), usuario.getSenha()))
		{
			FacesContext.getCurrentInstance().getExternalContext().redirect("Prancha.xhtml"); 
			et.commit();
		}
		else
		{
			faces.addMessage(null, 
					new FacesMessage("Usuário não existe!"));
		}
	}
	
	public void salvar() throws IOException
	{
		EntityManager em = DataSource.getEntityManager();
		EntityTransaction et = em.getTransaction();
		FacesContext faces = FacesContext.getCurrentInstance();
		
		try 
		{
			et.begin();
			CadastroUsuarios cadastro = new CadastroUsuarios(new Usuarios(em));
			cadastro.salvar(usuario);
			this.usuario = new Usuario();
			faces.addMessage(null, new FacesMessage("Salvo com sucesso."));
			FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml"); 
			et.commit();
			
		} 
		catch (NegocioException e) 
		{
			et.rollback();
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			faces.addMessage(null, mensagem);
		}
		finally 
		{
			em.close();
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getTodosUsuarios() {
		return todosUsuarios;
	}

	public void setTodosUsuarios(List<Usuario> todosUsuarios) {
		this.todosUsuarios = todosUsuarios;
	}
	
	public Usuarios getUsuariosLogados() {
		return usuariosLogados;
	}

	public void setUsuariosLogados(Usuarios usuariosLogados) {
		this.usuariosLogados = usuariosLogados;
	}

	public tipoConta[] gettipoConta()
	{
		return tipoConta.values();
	}
	
}
