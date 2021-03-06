package br.fepi.tcc.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpSession;

import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.model.TipoConta;
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
	String senha;
	String nomeUsuario;

	public void prepararCadastro() {
		if (this.usuario == null) {
			this.usuario = new Usuario();
		}
	}

	public String entrar() {

		lista_usuarios = usuarios.buscarUsuario(usuario.getNomeUsuario(), 
				usuario.getSenha(), usuario.getTipoConta());

		if (lista_usuarios.isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Usuário, senha ou tipo estão incorretos!", "Erro ao logar!"));

			return null;
		} else {
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext()
					.getSession(false);
			if (session != null) {
				session.setAttribute("usuario", lista_usuarios);
			}

			return "/Menu.faces?faces-redirect=true";
		}
	}

	public String sair() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return"/Login?faces-redirect=true";
	}

	public boolean isResponsavel() {
		if (this.usuario.getTipoConta().equals("RESPONSAVEL")) {
			return true;
		} else
			return false;
	}

	public String cancelar() {
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

	public TipoConta[] gettipoConta() {
		return TipoConta.values();
	}
}