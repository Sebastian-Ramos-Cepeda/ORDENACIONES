package es.studium.OrdenarSelecci�n;

import java.util.Scanner;

public class OrdenarSelecci�n 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[10];
		int i, j, indice_menor, aux;
		
		for(i=0;i<10;i++) 
		{
			System.out.println("Dame un n�mero entero:");
			tabla[i] = teclado.nextInt();
		}
		for(i=0;i<10-1;i++) 
		{
			indice_menor=i;
			for(j=i+1;j<10;j++)
			{
				//Usando < � > podrremos ordenar de mayor a menos y viceversa.
				if(tabla[j]<tabla[indice_menor])
				{
					indice_menor=j;
				}
			}
			aux=tabla[i];
			tabla[i]=tabla[indice_menor];
			tabla[indice_menor]=aux;
		}
		System.out.println("La tabla ordenada queda as�:");
		for(i=0;i<10;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
