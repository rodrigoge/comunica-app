package br.fepi.tcc.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.fepi.tcc.model.Imagem;

@ManagedBean
@RequestScoped
public class ImagensBean {
	
	private List<Imagem> imagens = new ArrayList<>();
	 
	public List<Imagem> listarImagens()
	{
		imagens.add(new Imagem(0, "feliz.png", "Carinha Feliz"));
		imagens.add(new Imagem(1, "triste.png","Carinha Triste"));
		imagens.add(new Imagem(2, "bravo.png","Carinha Bravo"));
		imagens.add(new Imagem(3, "brinquedos.png","Brincar"));
		imagens.add(new Imagem(4, "escovar.png","Escovar os dentes"));
		imagens.add(new Imagem(5, "estudar.png","Estudar"));
		imagens.add(new Imagem(6, "comer.png","Comer"));
	
		return imagens;
	}

	public List<Imagem> getImagens() {
		return imagens;
	}

}
