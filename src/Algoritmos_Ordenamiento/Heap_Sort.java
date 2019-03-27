package Algoritmos_Ordenamiento;

import java.util.Arrays;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class Heap_Sort
{
    public void Arbol(int Vector[])
    {
        int Tamaño = Vector.length;
 
       /*Construccion*/
        for (int i = Tamaño / 2 - 1; i >= 0; i--)
            Heap(Vector, Tamaño, i);
 
       /*Extraer elemento por elemento del monticulo*/
        for (int i=Tamaño-1; i>=0; i--)
        {
            /*Mover raiz al final*/
            int temp = Vector[0];
            Vector[0] = Vector[i];
            Vector[i] = temp;
 
            /*llamar*/
            Heap(Vector, i,0);
        }
    }
 
   void Heap(int arr[], int n, int i) 
   { 
       int largest = i; 
       int l = 2*i + 1;
       int r = 2*i + 2; 
 
       if (l < n && arr[l] > arr[largest]) 
           largest = l; 
 
       if (r < n && arr[r] > arr[largest]) 
           largest = r; 
 
 
       if (largest != i) 
       { 
           int swap = arr[i]; 
           arr[i] = arr[largest]; 
           arr[largest] = swap; 
 
           Heap(arr, n, largest); 
       } 
   } 

 public static void Heap()
    {
    	JOptionPane.showMessageDialog(null,"Programa de Ordenacion por Monticulos");
		int Vector[]=Ingreso.vector();
		Heap_Sort Heap=new Heap_Sort();
		Heap.Arbol(Vector);
		JOptionPane.showMessageDialog(null,"Vector Final ---->"+Arrays.toString(Vector));
	}
}
