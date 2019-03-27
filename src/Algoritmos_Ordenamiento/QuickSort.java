package Algoritmos_Ordenamiento;
import java.util.Arrays;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class QuickSort {
	public static void quicksort(int[] array, int primero, int ultimo) {
		int i, j, pivote, auxiliar;
		i = primero;
		j = ultimo;
		pivote = array[(primero + ultimo) / 2];
		do {
			while (array[i] < pivote) {
				i++;
			}
			while (array[j] > pivote) {
				j--;
			}
			if (i <= j) {
				auxiliar = array[i];
				array[i] = array[j];
				array[j] = auxiliar;
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j) {
			quicksort(array, primero, j);
		}
		if (i < ultimo) {
			quicksort(array, i, ultimo);
		}

	}

	public static void Quicksort() {

		JOptionPane.showMessageDialog(null,"Programa de Ordenacion por QuickSort");
		int Vector[] = Ingreso.vector();
		int tamaño = Vector.length - 1;
		quicksort(Vector, 0, tamaño);
		JOptionPane.showMessageDialog(null,"Vector Final ---->" + Arrays.toString(Vector));
	}
}
