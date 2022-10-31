
import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {
				
		
		Scanner ler = new Scanner(System.in);
		int[] vet = new int[10];
		for (int i = 0; i <10; i++) {
			System.out.println("Digite um valor: ");
			vet[i] = ler.nextInt();
		}
		
		
		Vetor testando = new Vetor();
		testando.setVetorA(vet);		
		testando.percentualPar();
		testando.percentualImpar();
	}

}
