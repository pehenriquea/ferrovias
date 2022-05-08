import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Trem trem = new Trem ();
		int resp1, qtd, vagao;
	
		mostrarTrem(trem.vagoes);
		
		System.out.println("|Qual operação você deseja realizar?|");
		System.out.println("1-Inserir\n2-Remover\n3-Mostrar");
		resp1 = sc.nextInt();
		
		if(resp1==1) {
			System.out.println("Quanto você deseja inserir: ");
			qtd = sc.nextInt();
			vagao = selecionaVagao();
			
			switch (vagao) {
			
			case 1: trem.setMilho(qtd);
			break;
			case 2: trem.setSoja(qtd);
			break;
			case 3: trem.setArroz(qtd);
			break;
			case 4: trem.setCafe(qtd);
			break;
			case 5: trem.setFerro(qtd);
			break;
			case 6: trem.setCalcario(qtd);
			break;
			case 7: trem.setCimento(qtd);
			break;
			case 8: trem.setEucalipto(qtd);
			break;
			}
	
		}else if (resp1==2) {
			System.out.println("Quanto você deseja remover: ");
			qtd = sc.nextInt();
			vagao = selecionaVagao();
			
			switch (vagao) {
			case 1: trem.removeMilho(qtd);
			break;
			case 2: trem.removeSoja(qtd);
			break;
			case 3: trem.removeArroz(qtd);
			break;
			case 4: trem.removeCafe(qtd);
			break;
			case 5: trem.removeFerro(qtd);
			break;
			case 6: trem.removeCalcario(qtd);
			break;
			case 7: trem.removeCimento(qtd);
			break;
			case 8: trem.removeEucalipto(qtd);
			break;
			default: System.out.println("Digite um número válido!");
			break;
			}
		}
		
		mostrarTrem(trem.vagoes);
		
		sc.close();
	}
	
	public static int selecionaVagao() {
		Scanner sc2 = new Scanner(System.in);
		int resp1;
		
		System.out.println("Qual tipo de vagão você deseja selecionar? ");
		System.out.println("1-Milho\n2-Soja\n3-Arroz\n4-Café\n5-Minério de Ferro\n6-Calcário\n7-Cimento\n8-Eucalipto");
		resp1 = sc2.nextInt();

    sc2.close();
		return resp1;
		}
	
	public static void mostrarTrem(int vagoes[]) {
	  System.out.println();
		for (int i = 0; i < vagoes.length; i++) {
			
			switch (vagoes[i]) {
			case 0: System.out.println("Milho");
			break;
			
			case 1: System.out.println("Soja");
			break;
			
			case 2: System.out.println("Arroz");
			break;
			
			case 3: System.out.println("Café");
			break;
			
			case 4: System.out.println("Minério de Ferro");
			break;
			
			case 5: System.out.println("Calcário");
			break;
			
			case 6: System.out.println("Cimento");
			break;
			
			case 7: System.out.println("Eucalipto");
			break;
			}
    }
	}
}