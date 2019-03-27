package Ingreso_Vector;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ingreso {

	public static int[] vector() {
		try {
			int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Cuantos datos vas ingresar?"));
			if (tamaño > 0) {
				int[] vector = new int[tamaño];
				for (int i = 0; i < vector.length; i++) {
					int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor" + (i + 1)));
					vector[i] = dato;
				}
				JOptionPane.showMessageDialog(null, "Estado Inicial del Vector --> " + Arrays.toString(vector));
				return vector;
			} else
				JOptionPane.showMessageDialog(null, "Ingresa un tamaño valido");
			return vector();
		} catch (InputMismatchException exp) {
			JOptionPane.showMessageDialog(null, "Ingresa un valor numerico, el programa se cerrara");
			System.exit(0);
		}
		return vector();
	}
}
