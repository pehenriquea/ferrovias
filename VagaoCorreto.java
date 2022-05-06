import java.util.Random;

public class Vagao {
  public int vagoes[];
	private int tipoVagao;
	private int milho;
	private int soja;
	private int arroz;
	private int cafe;
	private int ferro;
	private int calcario;
	private int cimento;
	private int eucalipto;
  private int n;
	
	public Vagao(){ {
    vagoes = new int[100];
		Random gerador = new Random();
		
		for(int i=0; i < vagoes.length; i++) {
			
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
	
	public void removeMilho(int qtd) {
    int i = 0, pos = 0;
    
    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
		break;
	}

    
		for(i = 0; vagoes[i] == 0; i++);
    for(pos = i; vagoes[i] != 0; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getMilho() {
		return milho;
	}
	
	public void setSoja(int vagoes[]){
		
	}
	
	public void removeSoja(int  qtd) {
		int i = 0, pos = 0;
		
		if(qtd > soja) {
			System.out.println("Quantidade inválida! Digite uma quantidade de soja que já esteja no trem.");
			break;
		}
    
    
		for(i = 0; vagoes[i] == 1; i++);
    for(pos = i; vagoes[i] != 1; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getSoja() {
		return soja;
	}
	
	public void setArroz(){
		
	}
	
	public void removeArroz(int qtd) {
		int i = 0, pos = 0;
		
		if(qtd > arroz) {
			System.out.println("Quantidade inválida! Digite uma quantidade de arroz que já esteja no trem.");
			break;
		}
    
    
		for(i = 0; vagoes[i] == 2; i++);
    for(pos = i; vagoes[i] != 2; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getArroz() {
		return arroz;
	}
	
	public void setCafe(){
		
	}
	
	public void removeCafe(int qtd) {
		int i = 0, pos = 0;
		
		if(qtd > cafe) {
			System.out.println("Quantidade inválida! Digite uma quantidade de café que já esteja no trem.");
			break;
		}
    
    
		for(i = 0; vagoes[i] == 3; i++);
    for(pos = i; vagoes[i] != 3; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getCafe() {
		return cafe;
	}
	
	public void setFerro(){
		
	}
	
	public void removeFerro(int qtd) {
		int i = 0, pos = 0;
		
		if(qtd > ferro) {
			System.out.println("Quantidade inválida! Digite uma quantidade de ferro que já esteja no trem.");
			break;
		}
    
    
		for(i = 0; vagoes[i] == 4; i++);
    for(pos = i; vagoes[i] != 4; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getFerro() {
		return ferro;
	}
	
	public void setCalcario(){
		
	}
	
	public void removeCalcario(int qtd) {
		int i = 0, pos = 0;
    
		if(qtd > calcario) {
			System.out.println("Quantidade inválida! Digite uma quantidade de calcário que já esteja no trem.");
			break;
		}
    
		for(i = 0; vagoes[i] == 5; i++);
    for(pos = i; vagoes[i] != 5; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getCalcario() {
		return calcario;
	}
	
	public void setCimento(){
		
	}
	
	public void removeCimento(int qtd) {
		int i = 0, pos = 0;
		
		if(qtd > cimento) {
			System.out.println("Quantidade inválida! Digite uma quantidade de cimento que já esteja no trem.");
			break;
		}
    
    
		for(i = 0; vagoes[i] == 6; i++);
    for(pos = i; vagoes[i] != 6; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getCimento() {
		return cimento;
	}
	
	public void setEucalipto(){
		
	}
	
	public void removeEucalipto(int qtd) {
		int i = 0, pos = 0;
		
		if(qtd > eucalipto) {
			System.out.println("Quantidade inválida! Digite uma quantidade de eucaliptos que já esteja no trem.");
			break;
		}
    
		for(i = 0; vagoes[i] == 7; i++);
    for(pos = i; vagoes[i] != 7; pos++);

    try{
      for(int j = 0; j < qtd; j++){
        remover(pos+j, vagoes);  
      }
    }catch(Exception erro){
      System.err.println(erro.getMessage());
    }
	}
	
	public int getEucalipto() {
		return eucalipto;
	}

  public void remover(int pos, int vagoes[]) throws Exception {
    if (n == 0 || pos < 0 || pos >= n){
      throw new Exception("Erro! Trem está vazio.");
    }

    if (pos < 0 || pos >= n){
      throw new Exception("Erro! Posição inválida");
    }
    
    n--;
    
    for (int i = pos; i < n; i++){
      vagoes[i] = vagoes[i+1];
    } 
  }                          
}
