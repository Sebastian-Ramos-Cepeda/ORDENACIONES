package es.studium.OrdenarIntercambio;

import java.util.Scanner;

public class OrdenarIntercambio 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[10];
		int i, j, aux;
		for(i=0;i<10;i++) 
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		for(i=0;i<10-1;i++) 
		{
			for(j=i+1;j<10;j++)
			{
				//Usando < ó > podrremos ordenar de mayor a menos y viceversa.
				if(tabla[i]<tabla[j])
				{
					aux=tabla[i];
					tabla[i]=tabla[j];
					tabla[j]=aux;
				}
			}
		}
		System.out.println("La tabla ordenada queda así:");
		for(i=0;i<10;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
