package Algoritmos_Busqueda;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Hashing 
{	
	String []arreglo;
	int lenght,contador;
	/*Constructor*/
	public Hashing(int T) 
	{
		lenght=T;
		arreglo=new String[T];
		Arrays.fill(arreglo,"-1");
	}
	/*Funciones de hasheo*/
	public void HasheoModular(String[] cadenaArreglo,String [] arreglo,int tamaño) 
	{
	for(int i=0;i<cadenaArreglo.length;i++) 
	{
		String elemento=cadenaArreglo[i];
		int indiceArreglo=Integer.parseInt(elemento)%(tamaño-1);
		JOptionPane.showMessageDialog(null,"El indice es "+ indiceArreglo+ " para el valor "+ elemento);
	/*Tratando colisiones*/
	while(arreglo[indiceArreglo] != "-1")
	{
		indiceArreglo++;
		JOptionPane.showMessageDialog(null,"Ocurrio una colision en el indice "+(indiceArreglo-1)+" cambiar al indice  "+ indiceArreglo);
		indiceArreglo%=lenght;
	}
	arreglo[indiceArreglo]=elemento;
	}
	}
	public void HasheoCuadrado(String[] cadenaArreglo,String [] arreglo,int tamaño) {
		for(int i=0;i<cadenaArreglo.length;i++) 
		{
			String elemento=cadenaArreglo[i];
			int indiceArreglo=(int) Math.sqrt(((Integer.parseInt(elemento)^2)+2)/2);
			JOptionPane.showMessageDialog(null,"El indice es "+ indiceArreglo+ " para el valor "+ elemento);
		/*Tratando colisiones*/
		while(arreglo[indiceArreglo] != "-1")
		{
			indiceArreglo++;
			JOptionPane.showMessageDialog(null,"Ocurrio una colision en el indice "+(indiceArreglo-1)+" cambiar al indice  "+ indiceArreglo);
			indiceArreglo%=lenght;
		}
		arreglo[indiceArreglo]=elemento;
		}
		}
	public void HasheoSumatorio(String[] cadenaArreglo,String [] arreglo,int tamaño) {
		for(int i=0;i<cadenaArreglo.length;i++) 
		{
			String elemento=cadenaArreglo[i];
			int indiceArreglo=(int) Math.sqrt(((Integer.parseInt(elemento)+(Integer.parseInt(elemento)+2))/2));
			JOptionPane.showMessageDialog(null,"El indice es "+ indiceArreglo+ " para el valor "+ elemento);
		/*Tratando colisiones*/
		while(arreglo[indiceArreglo] != "-1")
		{
			indiceArreglo++;
			JOptionPane.showMessageDialog(null,"Ocurrio una colision en el indice "+(indiceArreglo-1)+" cambiar al indice  "+ indiceArreglo);
			indiceArreglo%=lenght;
		}
		arreglo[indiceArreglo]=elemento;
		}
		}
	/*Funcion Buscadora*/
	public String buscarClave(String elemento, int tamaño)
	{
		int indiceArreglo=Integer.parseInt(elemento)%(tamaño-1);
		int contador=0;
		while(arreglo[indiceArreglo] != "-1")
		{
			JOptionPane.showMessageDialog(null,Arrays.toString(arreglo));
			if(arreglo[indiceArreglo].equals(elemento)) 
			{
				JOptionPane.showMessageDialog(null,"Busqueda exitosa");	
				JOptionPane.showMessageDialog(null,"El elemento "+ elemento+" fue encontrado en el indice " + indiceArreglo);
			return arreglo[indiceArreglo];
			}
			else {
			indiceArreglo++;
			indiceArreglo%=lenght;
			contador++;
			if(contador> (tamaño-1))
				{
				JOptionPane.showMessageDialog(null,"Recorrido finalizado");
				break;
				}
			}
		}
				
		return null;
		
	}
	/*Ingreso de datos*/
	public static String[] Ingreso()
	{
		try 
		{
			int tamaño=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos datos vas ingresar?"));
		if (tamaño>0)
		{
		String[] vector= new String[tamaño];
		for (int i=0;i<vector.length;i++)
			{
			String dato=JOptionPane.showInputDialog("Ingresa el valor "+(i+1));
			vector[i]=dato;
			}
		JOptionPane.showMessageDialog(null,"Estado Inicial del Vector --> "+ Arrays.toString(vector));
		return vector;
		}
		else
			JOptionPane.showMessageDialog(null,"Ingresa un tamaño valido");
		return Ingreso();
		}
		catch (InputMismatchException exp)
		{JOptionPane.showMessageDialog(null,"Ingresa un valor numerico, el programa se cerrara"); System.exit(0);}
		return Ingreso();}

	/*MAIN*/
	public static void Hashing() 
	{
		/*Lectura de datos*/
		JOptionPane.showMessageDialog(null,"Bienvenido a busqueda Hash");
		String[] elementos=Ingreso();
		int tamaño=elementos.length;
		/*CREACION DE OBJETO*/
		Hashing hash=new Hashing(tamaño);
		/*Seleccion de Metodo*/
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Del siguiente menu que HashCode deseas usar \n Hasheo Sumatorio---->  1 \n Hasheo Cuadrado----->  2\n Hasheo Modular ----->  3 "));
		String dato=JOptionPane.showInputDialog("Ingresa el dato que deseas buscar");
		String buscado=null;
		switch(opcion){
			case 1:
				hash.HasheoSumatorio(elementos, hash.arreglo, tamaño);
				JOptionPane.showMessageDialog(null," Los datos son --> "+ Arrays.toString(elementos));
				buscado=hash.buscarClave(dato, tamaño);
				if(buscado==null)
				{
					JOptionPane.showMessageDialog(null,"El elemento buscado no se encuentra");
				}
				break;
			case 2: 
				hash.HasheoCuadrado(elementos, hash.arreglo, tamaño);
				JOptionPane.showMessageDialog(null," Los datos son --> "+ Arrays.toString(elementos));
				buscado=hash.buscarClave(dato, tamaño);
				if(buscado==null)
				{
					JOptionPane.showMessageDialog(null,"El elemento buscado no se encuentra");
				}
				break;
			case 3: 
				hash.HasheoModular(elementos, hash.arreglo, tamaño);
			System.out.println(" Los datos son --> "+ Arrays.toString(elementos));
				buscado=hash.buscarClave(dato, tamaño);
				if(buscado==null)
				{
					JOptionPane.showMessageDialog(null,"El elemento buscado no se encuentra");
				}
				break;
			default: JOptionPane.showMessageDialog(null,"Ingresa una clave valida");break;
		}
		
	}

}
