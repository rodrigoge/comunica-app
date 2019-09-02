package br.fepi.tcc.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.negocio.CadastroUsuarios;
import br.fepi.tcc.repositorio.Usuarios;
import br.fepi.tcc.util.DataSource;


@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario = new Usuario();
	EntityManager em = DataSource.getEntityManager();
	private Usuarios usuarios = new Usuarios(em);
	
			
	public void prepararCadastro()
	{
		if(this.usuario == null)
		{
			this.usuario = new Usuario();
		}
	}
	public String entrar()
	{
		usuario = usuarios.getUsuario(usuario.getUsuario(), usuario.getSenha());
		if(usuario == null)
		{
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage( 
					null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"User not found!", " Login Error!"));

			return null;
		}
		else
		{
			return "Prancha.xhtml";
		}
	}
	
	
/*
    public String logar()

    {
        if(usuario.getUsuario().equals("admin") && usuario.getSenha().equals("admin"))
        {
            return "Prancha.xhtml";
        }
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário inválido", "Usuário inválido");
        ctx.addMessage(null, msg);
        return "";              
    }
*/
	

	public Usuario getUsuario() {
		return usuario;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
