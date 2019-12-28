import java.util.Scanner;

public class Estacionamento {
	public static Scanner leitor = new Scanner(System.in);
	public static String carros[] = new String[100];
	public static String data[] = new String[100];
	public static double valor[] = new double[100];
	public static String pesmarca;

	
	
	// 1 
	public static void insereCarro() {

		for (int i = 0; i < carros.length; i++) {
			if(carros[i] == "limpo") {
				
				System.out.println("marca do carro");
				carros[i] = leitor.next().toUpperCase();
				
				System.out.println("data");
				data[i] = leitor.next();
				
				System.out.println("valor da locação");
				valor[i] = leitor.nextDouble();
				break;
			}
		}

	}

	// 2
	public static double totalParcial(double[] vetor) {
		double total=0;
		for (int i = 0; i < vetor.length; i++) {
			total = vetor[i]+ total;

			if(vetor[i] == 0) {
				break;
			}
		}

		return total;
	}

	
	// 3
	public static double totalMarca(double[] vetor,String[] carros) {
		double total=0;
		System.out.println("digite a marca a ser pesquisada");
		pesmarca = leitor.next().toUpperCase();
		
		
		for (int i = 0; i < vetor.length; i++) {
			if(carros[i].equals(pesmarca)) {
				total = vetor[i] + total;	
			}
			if(carros[i]=="limpo") {
				break;
			}
		}
		return total;
	}
	
	// 4
	public static double mediaTotal(double[] vetor) {
		double total=0;
		int i;
		for (i = 0; i < vetor.length; i++) {
			total = vetor[i]+ total;
			
			if(carros[i]=="limpo") {
				break;
			}
		}
		total = total/i;
		return total;
	}

	// 5
	public static double mediaMarca(double[] vetor) {
		double total=0;
		int i = 0;
		System.out.println("digite a marca a ser pesquisada");
		pesmarca = leitor.next().toUpperCase();
		for (i = 0; i < vetor.length; i++) {
			if(carros[i].equals(pesmarca)) {
				total = vetor[i] + total;
			}
			if(carros[i]=="limpo") {
				break;
			}
		}
		total = total/i;
		return total;
	}

	// 6
	public static int pesquisaMarca(String marca) {
		int total=0;
		
		System.out.println("digite a marca a ser pesquisada");
		pesmarca = leitor.next().toUpperCase();

		for (int i = 0; i < carros.length; i++) {
			if(carros[i].equals(pesmarca)) {
				total++;
			}

			if(carros[i]=="limpo") {
				break;
			}
		}
		return total;
	}
	
	public static void limpaVetores() {
		for (int i = 0; i < carros.length; i++) {
			 carros[i] = "limpo";
			 data[i] = "limpo";
			 valor[i] = 0;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		limpaVetores();
		
		int opcao = 0;
		
		while(opcao!=7) {
			System.out.println("ESTACIONAMENTO");
			System.out.println("Escolha sua opção: ");
			System.out.println("1 - Insere Locação");
			System.out.println("2 - Total parcial");
			System.out.println("3 - Total Marca");
			System.out.println("4 - Media Geral");
			System.out.println("5 - Media Marca");
			System.out.println("6 - Total de carros de uma Marca");
			System.out.println("7 - Sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				insereCarro();
				break;
			case 2:
				System.out.println("o total do valor das locaçoes é "+totalParcial(valor));
				break;
			case 3:
				System.out.println("numero de carros da marca é "+totalMarca(valor,carros));				
				break;
			case 4:
				System.out.println("A media total é "+mediaTotal(valor));
				break;
			case 5:
				System.out.println("a media da marca "+pesmarca+" é "+mediaMarca(valor));
				break;
			case 6:
				System.out.println("numero de carros da marca "+pesmarca+" = "+pesquisaMarca(pesmarca));
				break;
			case 7:
				System.out.println("Saindo...");
				break;
			}
		}

	}

}
