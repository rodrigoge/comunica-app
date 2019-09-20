package br.fepi.tcc.converters;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import br.fepi.tcc.model.Usuario;
import br.fepi.tcc.repositorio.Usuarios;
import br.fepi.tcc.util.DataSource;

@FacesConverter(forClass = Usuario.class)
public class UsuarioConverter implements Converter {

	@SuppressWarnings("deprecation")
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) 
	{
		Usuario retorno = null;
		EntityManager em = DataSource.getEntityManager();
		
		try 
		{
			if(arg2 != null && !"".equals(arg2))
			{
				retorno = new Usuarios(em).usuarioId(new Long(arg2));
			}
			
			return retorno;
		}

		finally 
		{
			em.close();
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) 
	{
		if(arg2 != null)
		{
			Usuario usuario = ((Usuario) arg2);
			return usuario.getId() == null ? null : usuario.getId().toString();
			
		}
		return null;
	}

}
