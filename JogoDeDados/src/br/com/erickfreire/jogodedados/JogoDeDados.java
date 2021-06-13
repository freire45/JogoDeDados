package br.com.erickfreire.jogodedados;

import java.security.SecureRandom;

/**
 * Programa em Java que simula um jogo de dados onde dois dados são jogados é feito a soma dos dois lados esse jogo é rolado por 36000000 de vezes
 * @author Erick Freire
 * @version 1 - Criado em 13-06-2021 as 15:21
 */

public class JogoDeDados {

	public static void main(String[] args) {
		
		SecureRandom numeroAleatorio = new SecureRandom();
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;
		int cont7 = 0;
		int cont8 = 0;
		int cont9 = 0;
		int cont10 = 0;
		int cont11 = 0;
		int cont12 = 0;
		int[] vetor = new int[36000000];
		
		
		for(int i = 0; i < vetor.length; i++) {
			
			numero1 = 1 + numeroAleatorio.nextInt(6);
			numero2 = 1 + numeroAleatorio.nextInt(6);
			resultado = numero1 + numero2;
			
			vetor[i] = resultado;
		}
		
		for(int j : vetor) {
			
			if(j == 2)
				cont2 += 1;
			if(j == 3)
				cont3 += 1;
			if(j == 4)
				cont4 += 1;
			if(j == 5)
				cont5 += 1;
			if(j == 6)
				cont6 += 1;
			if(j == 7)
				cont7 += 1;
			if(j == 8)
				cont8 += 1;
			if(j == 9)
				cont9 += 1;
			if(j == 10)
				cont10 += 1;
			if(j == 11)
				cont11 += 1;
			if(j == 12)
				cont12 += 1;			
			
		}
		
		System.out.println("2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
		
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9,
				          cont10, cont11, cont12);
		

	}

}
