import java.util.Random;

public class Vagao {
	
	private int tipoVagao;
	private int milho;
	private int soja;
	private int arroz;
	private int cafe;
	private int ferro;
	private int calcario;
	private int cimento;
	private int eucalipto;
	
	public Vagao(int vagoes[]) {
		
		Random gerador = new Random();
		
		for(int i=0; i<vagoes.length; i++) {
			
			tipoVagao = gerador.nextInt(7);
			vagoes[i] = tipoVagao;
			
			switch (tipoVagao) {
			case 0: milho++;
			break;
			
			case 1: soja++;
			break;
			
			case 2: arroz++;
			break;
			
			case 3: cafe++;
			break;
			
			case 4: ferro++;
			break;
			
			case 5: calcario++;
			break;
			
			case 6: cimento++;
			break;
			
			case 7: eucalipto++;
			break;
			}
		}
		
		quicksort(0, vagoes.length-1, vagoes);
		
	}
	
	public static void quicksort (int esq, int dir, int array[]) {

		int i = esq, j = dir, pivo = array[(esq+dir)/2], auxTroca;
		while (i <= j) {
			while (array[i]<pivo) {
				i++;
			}
			while (array[j]>pivo) {
				j--;
			}
			if (i <= j) {
				auxTroca = array[i];
				array[i] = array[j];
				array[j] = auxTroca;
				i++;
				j--;
			}
		}
		
		if (esq < j) {
		quicksort(esq, j, array);
		}
		if (i < dir) {
		quicksort(i, dir, array);
		}
		
	}
	
	public void setMilho(){
		
	}
	
	public void removeMilho() {
		
	}
	
	public int getMilho() {
		return milho;
	}
	
	public void setSoja(){
		
	}
	
	public void removeSoja() {
		
	}
	
	public int getSoja() {
		return soja;
	}
	
	public void setArroz(){
		
	}
	
	public void removeArroz() {
		
	}
	
	public int getArroz() {
		return arroz;
	}
	
	public void setCafe(){
		
	}
	
	public void removeCafe() {
		
	}
	
	public int getCafe() {
		return cafe;
	}
	
	public void setFerro(){
		
	}
	
	public void removeFerro() {
		
	}
	
	public int getFerro() {
		return ferro;
	}
	
	public void setCalcario(){
		
	}
	
	public void removeCalcario() {
		
	}
	
	public int getCalcario() {
		return calcario;
	}
	
	public void setCimento(){
		
	}
	
	public void removeCimento() {
		
	}
	
	public int getCimento() {
		return cimento;
	}
	
	public void setEucalipto(){
		
	}
	
	public void removeEucalipto() {
		
	}
	
	public int getEucalipto() {
		return eucalipto;
	}

}
