
public class Atividade1 {
	static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = new int[10];
		for (int cont=0; cont<b.length; cont++) {
			b[cont] = a[cont] * cont;
		System.out.println("Vertor A: "+a[cont]);
		System.out.println("Vertor B: "+b[cont]);
			
		}
	}
}
