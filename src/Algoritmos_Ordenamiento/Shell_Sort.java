package Algoritmos_Ordenamiento;

import java.util.Arrays;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class Shell_Sort {
	public static void Shell(int vector[]) {
		int N = vector.length, cont;
		int P = N / 2;
		while (P >= 1) {
			cont = 1;
			while (cont > 0) {
				cont = 0;
				for (int i = 0; i < N - P; i++) {
					if (vector[i] > vector[i + P]) {
						int aux = vector[i];
						vector[i] = vector[i + P];
						vector[i + P] = aux;
						cont++;
					}
				}
			}
			P = P / 2;
		}
	}

	public static void Shell_sort() {
		JOptionPane.showMessageDialog(null,"Programa de Ordenamiento Shell");
		int Vector[] = Ingreso.vector();
		Shell_Sort.Shell(Vector);
		JOptionPane.showMessageDialog(null,"Vector Final ---->" + Arrays.toString(Vector));

	}
}
