package Algoritmos_Busqueda;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Algoritmos_Ordenamiento.QuickSort;
import Ingreso_Vector.Ingreso;
public class Busqueda_Asimetrica {
	static int BA(int [] array,int dato) {
		int t=array.length-1;
		int i=0; int s=t-1;
		int DI=(int) dato-i;
		int DS=(int) s-dato;
		int p=((DI*s)+(DS*i))/(DI+DS);
		if (array[i]==dato) {
			JOptionPane.showMessageDialog(null, "Dato--> "+array[i] +" En posicion--> "+(i+1));
			return i;
		}if (array[s]==dato) {
			JOptionPane.showMessageDialog(null, "Dato--> "+array[s] +" En posicion--> "+(s+1));
			return s;
		}if (array[p]==dato) {
			JOptionPane.showMessageDialog(null, "Dato--> "+array[p] +" En posicion--> "+(p+1));
			return p;
		}while(p!=i) {		if (array[p]>dato) {s=p;
			}	else {i=p;
			}p=((DI*s)+(DS*i))/(DI+DS);
			if((p<i)||(p>s)) {
				p=(int)(i+s)/2;
			}if (array[p]==dato) {
				JOptionPane.showMessageDialog(null, "Dato--> "+array[p] +" En posicion--> "+(p+1));
				return p;
			}}
		JOptionPane.showMessageDialog(null, "Finalizando Busqueda");
		if(array[i+1]==dato) {return i+1;
		}else {return -1;}}
	public static void Busqueda_AsimetricaM() {

		Scanner ns=new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Programa de Busqueda Asimetrica");
		int Vector[]=Ingreso.vector();
		int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor que deseas buscar"));
		QuickSort.quicksort(Vector,0,Vector.length-1);
		JOptionPane.showMessageDialog(null, "Buscando");
		//JOptionPane.showMessageDialog(null, "Resultado"+ BA(Vector,dato));
		BA(Vector,dato);
		ns.close();
	}
}