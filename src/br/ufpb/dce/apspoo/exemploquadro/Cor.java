package br.ufpb.dce.apspoo.exemploquadro;

public class Cor {
	
	private int r,g,b;
	
	public Cor(){
		this(0,0,0);
	}
	
	public Cor(int r, int g, int b){
		this.setR(r);
		this.setG(g);
		this.setB(b);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

}
