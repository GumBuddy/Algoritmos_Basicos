package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Algoritmos_Ordenamiento.*;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Color;

public class Metodos_Ordenamiento {

	private JFrame frame;

	public static void ventana_ordenamiento() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metodos_Ordenamiento window = new Metodos_Ordenamiento();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Metodos_Ordenamiento() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setBackground(new Color(0, 153, 255));
		frame.getContentPane().setForeground(new Color(153, 255, 255));
		frame.setForeground(SystemColor.textHighlight);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Metodos_Ordenamiento.class.getResource("/LOgo/descarga.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 342, 300);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Burbuja");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 102, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burbuja.Bubble_Sort();
			}
		});
		btnNewButton.setBounds(28, 45, 128, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Heap");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(51, 102, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Heap_Sort.Heap();
			}
		});
		btnNewButton_1.setBounds(28, 99, 128, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mezcla");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(51, 102, 204));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Merge_Sort.MergeSortM();
			}
		});
		btnNewButton_2.setBounds(107, 207, 128, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("QuickSort");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(51, 102, 204));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuickSort.Quicksort();
			}
		});
		btnNewButton_3.setBounds(176, 45, 128, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Radix");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(51, 102, 204));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radix_Sort.Radix();
			}
		});
		btnNewButton_4.setBounds(176, 99, 128, 43);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Shell");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(new Color(51, 102, 204));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shell_Sort.Shell_sort();
			}
		});
		btnNewButton_5.setBounds(176, 153, 128, 43);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Torneo Heap");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(51, 102, 204));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tournament_Heap_Sort.Torneo_Heap();
			}
		});
		btnNewButton_6.setBounds(28, 153, 128, 43);
		frame.getContentPane().add(btnNewButton_6);
	}

}
