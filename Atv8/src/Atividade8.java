import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {
			
		int maxLinha = 3;
		int maxColuna = 5;
			
		double[][] mat = new double[maxLinha][maxColuna];
			
		Scanner ler = new Scanner(System.in);
			
		for (int i = 0; i < maxLinha; i++) {
			for (int j = 0; j < maxColuna; j++) {
				System.out.print("Digita ai os "+(maxLinha*maxColuna)+" numeros: ");
				mat[i][j] = ler.nextDouble();
			}
		}
		//Impressão
		for (int i = 0; i < maxLinha; i++) {
			System.out.print("\n");
			for (int j = 0; j < maxColuna; j++) {
				System.out.print(mat[i][j]+" | ");
			}
		}

	}
}
