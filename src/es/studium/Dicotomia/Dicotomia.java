package es.studium.Dicotomia;

import java.util.Random;
import java.util.Scanner;

public class Dicotomia 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int [100];
		int i;
		Random aleatorio = new Random();
		int elemento_buscado = 0;
		int inferior, superior, central, encontrado;
		
		for(i=0;i<100;i++) 
		{
			tabla[i] = aleatorio.nextInt(100)+1;
		}
		
		encontrado=-1;
		inferior=0;
		superior=10-1;
		
		while(inferior<=superior) 
		{
			central=(inferior + superior)/2;
			if(tabla[central]==elemento_buscado) 
			{
				encontrado = central;
				inferior = superior + 1;
			}
			else
			{
				if(elemento_buscado<tabla[central])
				{
					superior=central-1;
				}
				else
				{
					inferior=central+1;
				}
			}
		}
		if(encontrado!=-1) 
		{
			System.out.println("El elemento se encontró en la posición " + encontrado);
		}
		else
		{
			System.out.println("El elemento NO se ha encontrado");
		}
		teclado.close();
	}

}
