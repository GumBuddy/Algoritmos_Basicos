package Algoritmos_Ordenamiento;

import java.util.Arrays;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class Merge_Sort {
	public static int[] MergeSort(int[] in) {

		int[] der, izq, out;
		int n = in.length;
		if (n <= 1) {
			return in;
		}
		izq = new int[n / 2];
		der = new int[n - (n / 2)];
		izq = hacerVectorIzquierdo(in, n);
		der = hacerVectorDerecho(in, n);
		izq = MergeSort(izq);
		der = MergeSort(der);
		if (izq[izq.length - 1] <= der[0]) {
			out = new int[izq.length + der.length];
			System.arraycopy(izq, 0, out, 0, izq.length);
			System.arraycopy(der, 0, out, izq.length, der.length);
			return out;
		}
		out = Merge(in, izq, der);
		return out;
	}

	public static void NaturalMergeSort(int[] in) {
		int izquierda = 0, izq = 0, derecha = in.length - 1, der = derecha;
		boolean ordenado = false;
		do {
			ordenado = true;
			izquierda = 0;
			while (izquierda < derecha) {
				izq = izquierda;
				while (izq < derecha && in[izq] <= in[izq + 1]) {
					izq++;
				}
				der = izq + 1;
				while (der == derecha - 1 || der < derecha && in[der] <= in[der + 1]) {
					der++;
				}
				if (der <= derecha) {
					MergeSort(in);
					ordenado = false;
				}
				izquierda = izq;
			}
		} while (!ordenado);
	}

	public static int[] Merge(int[] in, int[] izq, int[] der) {
		int i = 0, j = 0, k = 0, N = izq.length, M = der.length;
		while (N != j && M != k) {
			if (izq[j] < der[k]) {
				in[i] = izq[j];
				i++;
				j++;
			} else {
				in[i] = der[k];
				i++;
				k++;
			}
		}

		while (N != j) {
			in[i] = izq[j];
			i++;
			j++;
		}
		while (M != k) {
			in[i] = der[k];
			i++;
			k++;
		}
		return in;
	}

	private static int[] hacerVectorIzquierdo(int[] in, int n) {
		int[] izq = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			izq[i] = in[i];
		}
		return izq;
	}

	private static int[] hacerVectorDerecho(int[] in, int n) {
		int[] der;
		der = new int[n - (n / 2)];
		for (int i = n / 2; i < n; i++) {
			der[i - (n / 2)] = in[i];
		}
		return der;
	}

	public static void MergeSortM() {
		JOptionPane.showMessageDialog(null, "Programa de Ordenacion por Mezcla");
		int Vector[] = Ingreso.vector();
		MergeSort(Vector);
		JOptionPane.showMessageDialog(null, "Vector Final ---->" + Arrays.toString(Vector));
	}

}
