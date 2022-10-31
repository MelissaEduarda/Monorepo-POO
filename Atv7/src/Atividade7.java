import java.util.Arrays;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		int vet[] = new int[10];
		Scanner ler = new Scanner(System.in);
			
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite 10 numeros: ");
			vet[i] = ler.nextInt();
		}
		Arrays.sort(vet);
		for (int j = 0; j < vet.length; j++) {
			System.out.println(vet[j]);
		}			
	}

}