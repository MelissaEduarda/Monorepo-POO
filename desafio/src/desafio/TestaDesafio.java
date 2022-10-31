package desafio;

import java.util.Scanner;

public class TestaDesafio {

	public static void main(String[] args) {
		//Faça um programa para jogar o jogo da velha. O programa deve permitir que dois
		//jogadores façam uma partida do jogo da velha, usando o computador para ver o
		//tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja
		//colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
		//determinar automaticamente quando o jogo terminou e quem foi o vencedor
		//(jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação
		//do tabuleiro na tela.
		
		char peca1='X', peca2='O';
		char a1='1', a2='2', a3='3';
		char b1='4', b2='5', b3='6';
		char c1='7', c2='8', c3='9';
		
		int repete = 1;
		
		int posicao;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("JOGO DA VELHA");
			System.out.println();
			System.out.println("  "+a1+"| "+a2+"| "+a3);
			System.out.println("---|--|--");
			System.out.println("  "+b1+"| "+b2+"| "+b3);
			System.out.println("---|--|--");
			System.out.println("  "+c1+"| "+c2+"| "+c3);
			System.out.println();
			System.out.println("Jogador 1 escolha X ou O: ");
			peca1 = ler.next().charAt(0);
			if (peca1 == 'X' || peca1 == 'x') {
				peca2 = 'O';
				repete = 2;
			}else if(peca1 == 'O' || peca1 == 'o') {
				peca2 = 'X';
				repete = 2;
			}else {
				System.out.println("opcao invalida");
				repete = 1;
			}
			System.out.println("Jogador 2 fica com " + peca2);
		
		}while(repete == 1);
		
		System.out.println("Jogador 1 escolha a posicao onde quer jogar(de acordo com a demonstracao - de 1 a 9)");
		posicao = ler.nextInt();
		
		switch(posicao) {
		case 1:
			a1 = peca1;
			
		case 2:
			a2 = peca1;
			break;
		case 3:
			a3 = peca1;
			break;
		case 4:
			b1 = peca1;
			break;
		case 5:
			b2 = peca1;
			break;
		case 6:
			b3 = peca1;
			break;
		case 7:
			c1 = peca1;
			break;
		case 8:
			c2 = peca1;
			break;
		case 9:
			c3 = peca1;
			break;
		}
		System.out.println();
		System.out.println("  "+a1+"| "+a2+"| "+a3);
		System.out.println("---|--|--");
		System.out.println("  "+b1+"| "+b2+"| "+b3);
		System.out.println("---|--|--");
		System.out.println("  "+c1+"| "+c2+"| "+c3);
		System.out.println();
		
		
		
	}

}
