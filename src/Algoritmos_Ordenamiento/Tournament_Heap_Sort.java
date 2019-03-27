package Algoritmos_Ordenamiento;

import java.util.Arrays;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class Tournament_Heap_Sort {
	

	public static int[] TournamentHeap(int[] in) {
		construirTorneoHeap(in);
		for (int i = in.length - 1; i >= 0; i--) {
			int temp = in[0];
			in[0] = in[i];
			in[i] = temp;
			heapSize = heapSize - 1;
			maxMonticulo(in, 0);
		}
		return in;
	}

	public static int heapSize;

	public static int izq(int i) {
		return 2 * i + 1;
	}

	public static int der(int i) {
		return 2 * i + 2;
	}

	public static void construirTorneoHeap(int[] in) {
		heapSize = in.length;
		for (int i = heapSize / 2; i >= 0; i--) {
			maxMonticulo(in, i);
		}
	}

	public static void maxMonticulo(int[] in, int i) {
		int l = izq(i), r = der(i);
		int largestElementIndex = -1;
		if (l < heapSize && in[l] > in[i]) {
			largestElementIndex = l;
		} else {
			largestElementIndex = i;
		}
		if (r < heapSize && in[r] > in[largestElementIndex]) {
			largestElementIndex = r;
		}
		if (largestElementIndex != i) {
			int temp = in[i];
			in[i] = in[largestElementIndex];
			in[largestElementIndex] = temp;
			maxMonticulo(in, largestElementIndex);
		}
	}

	public static void Torneo_Heap()
    {
    	
		JOptionPane.showMessageDialog(null,"Programa de Ordenacion por Torneo de Monticulos");
		int Vector[]=Ingreso.vector();
		TournamentHeap(Vector);		
		JOptionPane.showMessageDialog(null,"Vector Final ---->"+Arrays.toString(Vector));
	}
}
