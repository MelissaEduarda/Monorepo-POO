

public class Vetor {
	
	private int[] vetorA = new int[10];
	private int par = 0 ;
	private int impar = 0;
	private int percentual;
	
	public int[] getVetorA() {
		return this.vetorA;
	}

	public void setVetorA(int[] vetorA) {
		this.vetorA = vetorA;
	}

	public void percentualPar(){
		for(int i=0; i < 10; i++ ) {
			if(this.vetorA[i] % 2 == 0){
				par++;				
			}else {
				impar++;
			}
		}
		percentual = (par * 100)/10;
		
		System.out.println(percentual + "% de numeros pares");
	}
	
	public void percentualImpar(){
		percentual = (impar * 100)/10;
		System.out.println(percentual + "% de numeros impares");
	}
}

