import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vagao trem = new Vagao ();
		
		mostrarTrem(trem.vagoes);
		
		sc.close();
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