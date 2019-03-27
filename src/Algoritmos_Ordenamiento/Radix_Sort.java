package Algoritmos_Ordenamiento;
import Ingreso_Vector.Ingreso;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class Radix_Sort
{
public static void radix_sort(int[]arreglo)
	{
		int x,i,j;
		//for (x=Integer.SIZE-1; x>=0 ;x--)
		for (x=Integer.SIZE-1; x>=0 ;x--)
		{
			/*Declaracion de variables*/
					int tamaño=arreglo.length;
					int auxiliar[]=new int[tamaño];
					j=0;
					/*Recorrido*/
					for(i=0;i<arreglo.length;i++) 
						{
							boolean mover=arreglo[i]<< x >=0;
							if(x==0 ? !mover:mover)
							{
								auxiliar[j]=arreglo[i];
								j++;
							}
							else {
							arreglo[i-j]=arreglo[i];
							}
						}
					for(i=j;i<tamaño;i++)
						{
						auxiliar[i]=arreglo[i-j];
						}
					/*Igualar vector original a vector auxiliar*/
					arreglo=auxiliar;
		}
		/*Mostrar Vector Resultante*/
		JOptionPane.showMessageDialog(null,"Vector Final ---->"+Arrays.toString(arreglo));
	}
public static void Radix() 
{
	JOptionPane.showMessageDialog(null,"Programa de Ordenamiento Radix");
	int Vector[]=Ingreso.vector();
	radix_sort(Vector);
}


}
