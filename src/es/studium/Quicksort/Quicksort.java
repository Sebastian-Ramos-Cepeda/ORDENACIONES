package es.studium.Quicksort;

import java.util.Scanner;

public class Quicksort 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[]=new int [100];
		int i;
		for(i=0;i<100;i++) 
		{
			System.out.println("Dame un n�mero entero:");
			tabla[i] = teclado.nextInt();
		}
		
		ordenar(tabla, 0, 99);
		
		System.out.println("La tabla ordenada queda as�:");
		for(i=0;i<TAM-1;i++)
		{
			System.out.println(tabla[i]);
		}
	}
}
