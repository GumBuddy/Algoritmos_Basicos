package Algoritmos_Ordenamiento;

import java.util.Arrays;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class Burbuja {

	public static void Bubble_Sort() {
		System.out.println("Programa de ordenamiento por burbuja");
		int Vector[] = Ingreso.vector();
		int tama�o = Vector.length;
		for (int comienzo = 0; comienzo < (tama�o - 1); comienzo++) {
			for (int j = comienzo + 1; j < tama�o; j++) {
				if (Vector[comienzo] > Vector[j]) {
					int Aux_var = Vector[comienzo];
					Vector[comienzo] = Vector[j];
					Vector[j] = Aux_var;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Vector Final ---->" + Arrays.toString(Vector));

	}
}
