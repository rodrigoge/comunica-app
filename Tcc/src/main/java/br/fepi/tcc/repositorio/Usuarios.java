package br.fepi.tcc.repositorio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.fepi.tcc.model.Usuario;


public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuarios");
	private EntityManager em = factory.createEntityManager();
	
	public Usuario getUsuario(String nomeUser, String senha)
	{
		try
		{
			Usuario usuario = (Usuario) em.createQuery(
					"SELECT u from usuario u where u.nomeUser = :usuario and u.senha = :senha")
					.setParameter("usuario", nomeUser)
					.setParameter("senha", senha).getResultList();
			return usuario;
		}
		catch(NoResultException e)
		{
			return null;
		}
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
