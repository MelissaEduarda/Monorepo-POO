import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] A = new int[6];
		int[] B = new int[6];
						
		for (int i = 0; i < B.length; i++) {
			System.out.println("Insira um valor: ");
			A[i] = ler.nextInt();		
		}
		for (int i = 0; i < B.length; i++) {
			if(A[i]%2 == 0) {
				B[i] = 1;
			}else {
				B[i] = 0;
			}
		}
		System.out.println("\nVetor A: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(A[i]+"-");
		}
		System.out.println("\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+"-");
		}
	}

}
