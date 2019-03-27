package Algoritmos_Ordenamiento;

import java.util.Arrays;
import Ingreso_Vector.Ingreso;

public class Gnome_Sort
{

	public static void Gnome__Sort()
	{
		System.out.println("Programa de Ordenamiento Gnome");
		int Vector[]=Ingreso.vector();
		Gnome(Vector);
		System.out.println("Vector Final ---->"+Arrays.toString(Vector));
	}
	static void Gnome(int [] Vector)
	{
		int tam=Vector.length,i=1;
			while (i < tam)
			 {
				if(Vector[i-1]<=Vector[i])
				{
					i++;
				}
				else
				{
					int  aux=Vector[i-1];
				 	Vector[i-1]=Vector[i];
				 	Vector[i]=aux;
				 	i--;
			 	if (i==0)
			 			i=1;
				}	
			 }
		 }
	}
