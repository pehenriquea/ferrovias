import java.util.Random;

public class Trem {
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

	public Trem(){
    vagoes = new int[100];
		Random gerador = new Random();

		for(int i=0; i < vagoes.length; i++) {

			tipoVagao = gerador.nextInt(7);
			vagoes[i] = tipoVagao;

			switch (tipoVagao) {
			case 0: milho++; n++;
			break;

			case 1: soja++; n++;
			break;

			case 2: arroz++; n++;
			break;

			case 3: cafe++; n++;
			break;

			case 4: ferro++; n++;
			break;

			case 5: calcario++; n++;
			break;

			case 6: cimento++; n++;
			break;

			case 7: eucalipto++; n++;
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

	public void setMilho(int quantia){

	}

	public void removeMilho(int qtd) {
    int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 0; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getMilho() {
		return milho;
	}

	public void setSoja(int quantia){

	}

	public void removeSoja(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 1; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getSoja() {
		return soja;
	}

	public void setArroz(int quantia){

	}

	public void removeArroz(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 2; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getArroz() {
		return arroz;
	}

	public void setCafe(int quantia){

	}

	public void removeCafe(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 3; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getCafe() {
		return cafe;
	}

	public void setFerro(int quantia){

	}

	public void removeFerro(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 4; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getFerro() {
		return ferro;
	}

	public void setCalcario(int quantia){

	}

	public void removeCalcario(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 5; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getCalcario() {
		return calcario;
	}

	public void setCimento(int quantia){

	}

	public void removeCimento(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 6; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
    }
	}

	public int getCimento() {
		return cimento;
	}

	public void setEucalipto(int quantia){

	}

	public void removeEucalipto(int qtd) {
		int pos = 0;

    if(qtd > milho) {
		System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.");
	  }else{
      for(pos = 0; vagoes[pos] != 7; pos++);
      try{
			  for(int j = 0; j < qtd; j++){
			    remover(pos, vagoes);  
			  }
        n--;
			}catch(Exception erro){
			  System.err.println(erro.getMessage());
			}
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