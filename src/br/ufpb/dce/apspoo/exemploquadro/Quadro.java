package br.ufpb.dce.apspoo.exemploquadro;

public class Quadro {
	
	
	private Pixel[][] quadro;
	
	public Quadro(int l, int a, Cor cor){
		
		this.quadro = new Pixel[l][a];
		this.preencherQuadro(cor);
	}
	
	private void preencherQuadro(Cor cor){
		for(int i = 0; i < quadro.length; i++){
			for(int j = 0; j<quadro[0].length; j++){
				quadro[i][j] = new Pixel(cor);
			}
		}
	}
	
	public int getLargura(){
		return quadro.length;
	}
	
	public int getAltura(){
		return quadro[0].length;
	}
	
	public void riscar(Riscador r, int x, int y){
		this.quadro[x][y] = new Pixel(r.getCor(),r.getEspessura());
	}

}
