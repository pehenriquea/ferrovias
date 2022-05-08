import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Trem trem = new Trem ();
		int x=1;
	
		mostrarTrem(trem.vagoes);
		
		while(x==1){
		menu(trem);
		
		System.out.print("Deseja continuar?\n(1)Sim\n(2)Não: ");
		x = sc.nextInt();
		}
		
		mostrarTrem(trem.vagoes);
		
		sc.close();
	}
	
	public static void menu(Trem trem2) {
		int resp1, qtd, vagao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("|Qual operação você deseja realizar?|");
		System.out.println("1-Inserir\n2-Remover\n3-Mostrar");
		resp1 = sc.nextInt();
		
		if(resp1==1) {
			System.out.println("Quanto você deseja inserir: ");
			qtd = sc.nextInt();
			vagao = selecionaVagao();
			
			switch (vagao) {
			
			case 1: trem2.setMilho(qtd);
			break;
			case 2: trem2.setSoja(qtd);
			break;
			case 3: trem2.setArroz(qtd);
			break;
			case 4: trem2.setCafe(qtd);
			break;
			case 5: trem2.setFerro(qtd);
			break;
			case 6: trem2.setCalcario(qtd);
			break;
			case 7: trem2.setCimento(qtd);
			break;
			case 8: trem2.setEucalipto(qtd);
			break;
			}
	
		}else if (resp1==2) {
			System.out.println("Quanto você deseja remover: ");
			qtd = sc.nextInt();
			vagao = selecionaVagao();
			
			switch (vagao) {
			case 1: trem2.removeMilho(qtd);
			break;
			case 2: trem2.removeSoja(qtd);
			break;
			case 3: trem2.removeArroz(qtd);
			break;
			case 4: trem2.removeCafe(qtd);
			break;
			case 5: trem2.removeFerro(qtd);
			break;
			case 6: trem2.removeCalcario(qtd);
			break;
			case 7: trem2.removeCimento(qtd);
			break;
			case 8: trem2.removeEucalipto(qtd);
			break;
			default: System.out.println("Digite um número válido!");
			break;
			}
		} else if (resp1==3) {
			mostrarTrem(trem2.vagoes);
			
		} else {
			System.out.println("Digite uma resposta Válida!");
			
		}
	}
	
	public static int selecionaVagao() {
		Scanner sc = new Scanner(System.in);
		int resp1;
		
		System.out.println("Qual tipo de vagão você deseja selecionar? ");
		System.out.println("1-Milho\n2-Soja\n3-Arroz\n4-Café\n5-Minério de Ferro\n6-Calcário\n7-Cimento\n8-Eucalipto");
		resp1 = sc.nextInt();
		
		return resp1;
		
	}
	
	public static void mostrarTrem(int vagoes[]) {
	
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
