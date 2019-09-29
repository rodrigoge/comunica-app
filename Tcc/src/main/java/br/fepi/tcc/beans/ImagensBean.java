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

	private Imagem imagem;
	private List<Imagem> imagens = new ArrayList<>();
	private List<Imagem> droppedImagens;
	private List<Imagem> droppedImagens2;
	private List<Imagem> droppedImagens3;
	private List<Imagem> droppedImagens4;
	private List<Imagem> droppedImagens5;
	private List<Imagem> droppedImagens6;
	private List<Imagem> droppedImagens7;
	private List<Imagem> droppedImagens8;
	private List<Imagem> droppedImagens9;

	public List<Imagem> listarImagens() {
		imagens.add(new Imagem(0, "feliz.png", "Carinha Feliz"));
		imagens.add(new Imagem(1, "triste.png", "Carinha Triste"));
		imagens.add(new Imagem(2, "bravo.png", "Carinha Bravo"));
		imagens.add(new Imagem(3, "brinquedos.png", "Brincar"));
		imagens.add(new Imagem(4, "feliz.png", "Carinha Feliz"));
		imagens.add(new Imagem(5, "triste.png", "Carinha Triste"));
		imagens.add(new Imagem(6, "bravo.png", "Carinha Bravo"));
		imagens.add(new Imagem(7, "brinquedos.png", "Brincar"));
		imagens.add(new Imagem(8, "feliz.png", "Carinha Feliz"));
		imagens.add(new Imagem(9, "triste.png", "Carinha Triste"));
		imagens.add(new Imagem(10, "bravo.png", "Carinha Bravo"));
		imagens.add(new Imagem(11, "brinquedos.png", "Brincar"));
		imagens.add(new Imagem(12, "feliz.png", "Carinha Feliz"));
		imagens.add(new Imagem(13, "triste.png", "Carinha Triste"));
		imagens.add(new Imagem(14, "bravo.png", "Carinha Bravo"));
		imagens.add(new Imagem(15, "brinquedos.png", "Brincar"));
		imagens.add(new Imagem(16, "feliz.png", "Carinha Feliz"));
		imagens.add(new Imagem(17, "triste.png", "Carinha Triste"));

		droppedImagens = new ArrayList<Imagem>();
		droppedImagens2 = new ArrayList<Imagem>();
		droppedImagens3 = new ArrayList<Imagem>();
		droppedImagens4 = new ArrayList<Imagem>();
		droppedImagens5 = new ArrayList<Imagem>();
		droppedImagens6 = new ArrayList<Imagem>();
		droppedImagens7 = new ArrayList<Imagem>();
		droppedImagens8 = new ArrayList<Imagem>();
		droppedImagens9 = new ArrayList<Imagem>();
	
		return imagens;
	}

	public void onImagemDrop(DragDropEvent ddEvent) {
		Imagem imagem = ((Imagem) ddEvent.getData());

		droppedImagens.add(imagem);
		imagens.remove(imagem);
	}
	
	public void onImagemDrop2(DragDropEvent ddEvent) {
		Imagem imagem2 = ((Imagem) ddEvent.getData());

		droppedImagens2.add(imagem2);
		imagens.remove(imagem2);
	}
	
	public void onImagemDrop3(DragDropEvent ddEvent) {
		Imagem imagem3 = ((Imagem) ddEvent.getData());

		droppedImagens3.add(imagem3);
		imagens.remove(imagem3);
	}
	
	public void onImagemDrop4(DragDropEvent ddEvent) {
		Imagem imagem4 = ((Imagem) ddEvent.getData());

		droppedImagens4.add(imagem4);
		imagens.remove(imagem4);
	}
	
	public void onImagemDrop5(DragDropEvent ddEvent) {
		Imagem imagem5 = ((Imagem) ddEvent.getData());

		droppedImagens5.add(imagem5);
		imagens.remove(imagem5);
	}
	
	public void onImagemDrop6(DragDropEvent ddEvent) {
		Imagem imagem6 = ((Imagem) ddEvent.getData());

		droppedImagens6.add(imagem6);
		imagens.remove(imagem6);
	}
	
	public void onImagemDrop7(DragDropEvent ddEvent) {
		Imagem imagem7 = ((Imagem) ddEvent.getData());

		droppedImagens7.add(imagem7);
		imagens.remove(imagem7);
	}
	
	public void onImagemDrop8(DragDropEvent ddEvent) {
		Imagem imagem8 = ((Imagem) ddEvent.getData());

		droppedImagens8.add(imagem8);
		imagens.remove(imagem8);
	}
	
	public void onImagemDrop9(DragDropEvent ddEvent) {
		Imagem imagem9 = ((Imagem) ddEvent.getData());

		droppedImagens9.add(imagem9);
		imagens.remove(imagem9);
	}

	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	public List<Imagem> getDroppedImagens() {
		return droppedImagens;
	}

	public void setDroppedImagens(List<Imagem> droppedImagens) {
		this.droppedImagens = droppedImagens;
	}

	public List<Imagem> getDroppedImagens2() {
		return droppedImagens2;
	}

	public void setDroppedImagens2(List<Imagem> droppedImagens2) {
		this.droppedImagens2 = droppedImagens2;
	}

	public List<Imagem> getDroppedImagens3() {
		return droppedImagens3;
	}

	public void setDroppedImagens3(List<Imagem> droppedImagens3) {
		this.droppedImagens3 = droppedImagens3;
	}

	public List<Imagem> getDroppedImagens4() {
		return droppedImagens4;
	}

	public void setDroppedImagens4(List<Imagem> droppedImagens4) {
		this.droppedImagens4 = droppedImagens4;
	}

	public List<Imagem> getDroppedImagens5() {
		return droppedImagens5;
	}

	public void setDroppedImagens5(List<Imagem> droppedImagens5) {
		this.droppedImagens5 = droppedImagens5;
	}

	public List<Imagem> getDroppedImagens6() {
		return droppedImagens6;
	}

	public void setDroppedImagens6(List<Imagem> droppedImagens6) {
		this.droppedImagens6 = droppedImagens6;
	}

	public List<Imagem> getDroppedImagens7() {
		return droppedImagens7;
	}

	public void setDroppedImagens7(List<Imagem> droppedImagens7) {
		this.droppedImagens7 = droppedImagens7;
	}

	public List<Imagem> getDroppedImagens8() {
		return droppedImagens8;
	}

	public void setDroppedImagens8(List<Imagem> droppedImagens8) {
		this.droppedImagens8 = droppedImagens8;
	}

	public List<Imagem> getDroppedImagens9() {
		return droppedImagens9;
	}

	public void setDroppedImagens9(List<Imagem> droppedImagens9) {
		this.droppedImagens9 = droppedImagens9;
	}
}
