package Algoritmos_Busqueda;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Ingreso_Vector.Ingreso;

public class Busqueda {
	static void buscar(int[] array, int data) {
		int value = array.length;
		boolean b = true;
		int i = 0;
		if (value == 1) {
			JOptionPane.showMessageDialog(null,"No es necesario realizar busqueda, tu dato es: " + array[i]);
		} else {
			JOptionPane.showMessageDialog(null,"El dato a buscar es " + data);
			while (b != false && i < value) {
				if (array[i] == data) {
					int temp = i + 1;
					JOptionPane.showMessageDialog(null,"Dato encontrado en busqueda " + temp + " de " + value);
					JOptionPane.showMessageDialog(null,"Exito en Busqueda!!");
					b = true;
					i = value + 1;
				} else {
					int temp = i + 1;
					JOptionPane.showMessageDialog(null,"Busqueda " + temp + " de " + value);
					i++;
				}
				if (i == value && b == true) {
					JOptionPane.showMessageDialog(null,"Sorry , Busqueda sin Exito  :,(  ");
					b = false;
				}
			}
		}
	}

	static void contar(int[] array, int data) {
		int value = array.length, rep = 0;
		for (int i = 0; i < value; i++) {
			if (array[i] == data) {
				rep++;
			}
		}
		JOptionPane.showMessageDialog(null,"El valor " + data + " se repite " + rep + " veces");
	}

	static int centinel(int[] array, int data) {
		int value = array.length;
		int[] Centinel = new int[value];
		for (int i = 0; i < value; i++) {
			Centinel[i] = array[i];
		}
		Centinel[value - 1] = data;
		int i = 0;
		while (Centinel[i] != data && i <= value) {
			i++;
		}
		JOptionPane.showMessageDialog(null,"Centinel--> " + i);
		return i;
	}

	static int contar_posicion(int[] array, int data) {
		int k = 0, value = array.length;
		ArrayList<String> New = new ArrayList<String>();
		New.clear();
		for (int i = 0; i < value; i++) {
			if (array[i] == data) {
				k++;
				String pos = "";
				pos = Integer.toString(i);
				New.add(pos);
			}
		}
		JOptionPane.showMessageDialog(null,"Posicion en lista --> " + k);
		return k;
	}

	public static void Busqueda() {
		Scanner ns = new Scanner(System.in);
		JOptionPane.showMessageDialog(null,"Programa de Busqueda y Conteo Secuencial");
		int Vector[] = Ingreso.vector();
		int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor que deseas buscar"));
		boolean check =Boolean.parseBoolean(JOptionPane.showInputDialog("Si deseas realizar un conteo de datos repetidos escribe \n (true si no escribir false)"));
		if (check == true) {
			contar(Vector, dato);
		} else {
			JOptionPane.showMessageDialog(null,"Se procedera con la busqueda");
			buscar(Vector, dato);
		}
		centinel(Vector, dato);
		contar_posicion(Vector, dato);

		ns.close();
	}

}
