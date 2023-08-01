import java.util.Scanner;
import controller.PaisController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		while (opcao != 0) {
			 System.out.println("==== Menu ====");
	            System.out.println("1. Adicionar país");
	            System.out.println("2. Exibir lista de países");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            
	            	
	            	switch(opcao) {
	            	case 1:
	            		System.out.println("Digite o Nome do pais: ");
	            		scanner.nextLine();
	            		String nome = scanner.nextLine();
	            		
	            		System.out.println("Digite a capital do pais: " + nome + ":");
	            		String capital = scanner.nextLine();
	            		
	            	paisController.adicionarPais(nome, capital);
	            	break;
	            	case 2:
	                    paisController.exibirListaDePaises();
	                    break;
	            	case 0:
	            		System.out.println("Saindo...");
	            		break;
	            	default:
	            		System.out.println("Opção invalida");
	            		break;
	            	}
			
		}
		scanner.close();
	}

}
