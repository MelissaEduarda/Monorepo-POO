
import java.util.Random;
public class Atividade9 {
	
	public static void main(String[] args) {
		int coluna = 4;
		int linha = 4;
		int[][] mat = new int[coluna][linha];
		int mnumero = -1;
		int mcoluna = 0;
		int mlinha = 0;
			
		Random random = new Random();
	
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = random.nextInt(10);
					
				if(mat[i][j] > mnumero) {
					mnumero = mat[i][j];
					mcoluna = i;
					mlinha = j;	
				}
				System.out.print(" "+mat[i][j]);
			}			
		}
		System.out.println("\n o maior numero é "+mnumero+" e ele esta na coluna "+(mcoluna+1)+" e na linha "+(mlinha+1));
	}

}
