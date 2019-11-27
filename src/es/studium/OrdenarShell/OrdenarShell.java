package es.studium.OrdenarShell;

import java.util.Scanner;

public class OrdenarShell 
{
	static final int TAM=10;
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[]= new int[TAM];
		int salto, aux, i;
		boolean cambios=false;
		
		for(i=0;i<=TAM-1;i++) 
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		for(salto=TAM/2;salto0;salto/2++)
		{
			cambios=true;
			while(cambios=true) 
			{
				cambios=false;
				for(i=salto;i<TAM;i++)
				{
					if(tabla[i-salto]>tabla[i])
					{
						aux=tabla[i];
						tabla[i]=tabla[i-salto];
						tabla[i-salto]=aux;
						cambios=true;
					}
				}
			}
		}
		System.out.println("La tabla ordenada queda así:");
		for(i=0;i<=TAM-1;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
