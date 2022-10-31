
import java.util.Scanner;
public class Atividade10 {
	
	public static void main(String[] args) {
		int mat[][] = new int[3][3];
		Scanner ler = new Scanner(System.in);
		int par=0;
		int impar=0;
			
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print("Digite um numero: ");
				mat[i][j] = ler.nextInt();
					
				 if(mat[i][j]%2 == 0) {
					 par++;
				 }else {
					 impar++;
				 }
					 
			}
		}
		for (int i = 0; i < mat.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" / ");
			}
		}
		System.out.println("\n O numero de numeros  pares é "+par+" e o numero de numeros impares é "+impar);

	}
}
