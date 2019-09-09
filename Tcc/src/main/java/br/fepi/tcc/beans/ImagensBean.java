package br.fepi.tcc.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.DragDropEvent;

import br.fepi.tcc.model.Imagem;

@ManagedBean
@ViewScoped
public class ImagensBean {
	
	private List<Imagem> imagens = new ArrayList<>();
	private List<Imagem> imagensDrop;
	private Imagem imagemSelecionada;
	private Imagem imagem;
	 
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
	
	public void onImagemDrop(DragDropEvent ddEvent) {
        Imagem imagem = ((Imagem) ddEvent.getData());
  
        imagensDrop.add(imagem);
        imagens.remove(imagem);
    }

	public List<Imagem> getImagens() {
		return imagens;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	public List<Imagem> getImagensDrop() {
		return imagensDrop;
	}

	public void setImagensDrop(List<Imagem> imagensDrop) {
		this.imagensDrop = imagensDrop;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public Imagem getImagemSelecionada() {
		return imagemSelecionada;
	}

	public void setImagemSelecionada(Imagem imagemSelecionada) {
		this.imagemSelecionada = imagemSelecionada;
	}
	
	
	
	

}
