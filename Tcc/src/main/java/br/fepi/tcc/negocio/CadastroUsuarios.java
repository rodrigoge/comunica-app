package br.fepi.tcc.negocio;

import java.io.Serializable;

import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.negocio.exception.NegocioException;
import br.fepi.tcc.repositorio.Usuarios;

public class CadastroUsuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	private Usuarios usuarios;
	
	public CadastroUsuarios(Usuarios usuarios) 
	{
		this.usuarios = usuarios;
	}
	
	public void salvar(Usuario usuario) throws NegocioException
	{
		this.usuarios.guardar(usuario);
	}
	
	public void excluir(Usuario usuario) throws NegocioException
	{
		usuario = this.usuarios.usuarioId(usuario.getId());
		this.usuarios.remover(usuario);
	}
	

	
}
