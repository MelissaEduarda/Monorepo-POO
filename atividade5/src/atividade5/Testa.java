package atividade5;
import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {
		//5. Criar um programa que seja possível ler as duas notas bimestrais para um
		//conjunto de 10 alunos. (Os valores devem ser solicitados ao usuário do sistema)
		//Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real.
		//Escreva um programa que calcule a média aritmética simples das notas informadas
		//armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao
		//mostrar os resultados exibir a situação de cada aluno. Se a média calculada for
		//superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno
		//será “reprovado”. (3 pontos)
		
		float[] nota1 = new float[10];
		float[] nota2 = new float[10];
		
		float[] result = new float [10];
		
		Scanner ler = new Scanner(System.in);
		 
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite a nota 1 do aluno " + (i+1) + ": ");
			nota1[i] = ler.nextFloat();
			System.out.println("Digite a nota 2 do aluno " + (i+1) + ": ");
			nota2[i] = ler.nextFloat();
			System.out.println();
			
			result[i] = (nota1[i] + nota2[i])/2;
			System.out.println("Aluno " + (i+1) + ": Resultado => " + result[i]);
			
			if (result[i] >= 7) {
				System.out.println("Aprovado, parabens!");
			}else {
				System.out.println("Reprovado, se fudeu!");
			}
			
			System.out.println();
			
		}
		

	}

}
