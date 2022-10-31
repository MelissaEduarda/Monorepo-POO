package atv2;

public class Atividade2 {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = new int[10];
		int[] c = new int[10];
		for (int cont=0; cont<b.length; cont++) {
			b[cont] = a[cont] * cont;
		System.out.println("Vertor A: "+a[cont]);
		System.out.println("Vertor B: "+b[cont]);
		}
		for (int cont=0; cont<c.length; cont++) {
	         c[cont] = a[cont] + b[cont];
	         System.out.println("Vertor C: "+c[cont]);
	         
	     }
	}
}
