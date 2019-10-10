package br.fepi.tcc.repositorio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.fepi.tcc.model.TipoConta;
import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.util.DataSource;


public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private EntityManager em = DataSource.getEntityManager();
	
	public List<Usuario> buscarUsuario(String nomeUsuario, String senha)
	{
		TypedQuery<Usuario> query = em.createQuery(
		"SELECT u FROM Usuario u WHERE "
		+ "u.nomeUsuario = :nomeUsuario and u.senha = :senha", Usuario.class)
		.setParameter("nomeUsuario", nomeUsuario)
		.setParameter("senha", senha);
		return query.getResultList();
	}
	
	public List<Usuario> userLogado(String nomeUsuario)
	{
		TypedQuery<Usuario> query = em.createQuery(
		"SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario", Usuario.class)
		.setParameter("nomeUsuario", nomeUsuario);
		return query.getResultList();
	}
	
	public List<Usuario> userTipo(TipoConta tipoConta)
	{
		TypedQuery<Usuario> query = em.createQuery(
		"SELECT u FROM Usuario u WHERE u.tipoConta = :tipoConta", Usuario.class)
		.setParameter("tipoConta", tipoConta);
		return query.getResultList();
	}

	public Usuarios (EntityManager em)
	{
		this.em = em;
	}
	
	public Usuario usuarioId(Long id)
	{
		return em.find(Usuario.class, id);
	}
	
	public List<Usuario> todos()
	{
		TypedQuery<Usuario> query = em.createQuery("from Usuario u order by u.id", Usuario.class);
		return query.getResultList();
	}

	public void adicionar(Usuario usuario)
	{
		this.em.persist(usuario);
	}
	
	public void guardar(Usuario usuario)
	{
		this.em.merge(usuario);
	}
	
	public void remover(Usuario usuario)
	{
		this.em.remove(usuario);
	}
}
