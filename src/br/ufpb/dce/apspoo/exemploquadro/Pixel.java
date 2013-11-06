package br.ufpb.dce.apspoo.exemploquadro;

public class Pixel {
	
	private Cor cor;
	private int espessura;
	
	
	
	public Pixel(Cor cor, int espessura){
		this(cor);
		this.espessura = espessura;
	}
	
	public Pixel(Cor cor){
		this.cor = cor;
		this.espessura = 1;
		
	}
	
	public Pixel(){
		this(new Cor(),1);
	}


	public Cor getCor() {
		return cor;
	}


	public void setCor(Cor cor) {
		this.cor = cor;
	}


	public int getEspessura() {
		return espessura;
	}


	public void setEspessura(int espessura) {
		this.espessura = espessura;
	}
	
	

}
