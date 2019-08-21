package br.fepi.tcc.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.negocio.CadastroUsuarios;
import br.fepi.tcc.negocio.exception.NegocioException;
import br.fepi.tcc.repositorio.Usuarios;
import br.fepi.tcc.util.DataSource;

@ManagedBean
@ViewScoped
public class UsuariosBeans implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;
	private Usuario usuarioSelecionado;
	
	public void consultar()
	{
		EntityManager em = DataSource.getEntityManager();
		Usuarios usuarios = new Usuarios(em);
		this.usuarios = usuarios.todos();
		em.close();
	}
	
	public void excluir()
	{
		FacesContext context = FacesContext.getCurrentInstance();
		EntityManager em = DataSource.getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		CadastroUsuarios cadastro = new CadastroUsuarios(new Usuarios(em));
		
		try 
		{
			et.begin();
			cadastro.excluir(this.usuarioSelecionado);
			context.addMessage(null, 
					new FacesMessage("Usuário excluído com sucesso."));
			et.commit();
			this.consultar();
		} 
		catch (NegocioException e) 
		{
			et.rollback();
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
		finally 
		{
			em.close();
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
	
	

}
