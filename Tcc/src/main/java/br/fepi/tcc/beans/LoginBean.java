package br.fepi.tcc.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.repositorio.Usuarios;
import br.fepi.tcc.util.DataSource;


@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario = new Usuario();
	private List<Usuario> lista_usuarios;
	
	EntityManager em = DataSource.getEntityManager();
	private Usuarios usuarios = new Usuarios(em);

	public void prepararCadastro()
	{
		if(this.usuario == null)
		{
			this.usuario = new Usuario();
		}
	}
	
	public String entrar() throws IOException
	{
		
		lista_usuarios = usuarios.buscarUsuario(usuario.getNomeUsuario(), usuario.getSenha());
		if(lista_usuarios.isEmpty())
		{
			FacesContext.getCurrentInstance().addMessage( 
					null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"Usuário ou senha estão incorretos!", "Erro ao logar!"));

			return null;
		}
		else
		{
			return "/Menu.faces?faces-redirect=true";
		}
	}
	
	public String sair() 
	{
		return "/Login.faces?faces-redirect=true";
    }
	
	public String cancelar() 
	{
		return "/Menu.faces?faces-redirect=true";
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getLista_usuarios() {
		return lista_usuarios;
	}

	public void setLista_usuarios(List<Usuario> lista_usuarios) {
		this.lista_usuarios = lista_usuarios;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
