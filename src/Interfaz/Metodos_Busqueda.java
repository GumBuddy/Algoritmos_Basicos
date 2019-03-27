package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Algoritmos_Busqueda.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Window.Type;
public class Metodos_Busqueda {

	private JFrame frame;

	public static void ventana_busqueda() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metodos_Busqueda window = new Metodos_Busqueda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Metodos_Busqueda() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setForeground(new Color(102, 102, 153));
		frame.getContentPane().setBackground(new Color(0, 153, 255));
		frame.getContentPane().setForeground(new Color(153, 255, 153));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Metodos_Busqueda.class.getResource("/LOgo/magnifier-1093183_960_720.png")));
		frame.setResizable(false);
		frame.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frame.setBounds(100, 100, 269, 300);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Busqueda Asimetrica");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 102, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda_Asimetrica.Busqueda_AsimetricaM();
			}
		});
		btnNewButton.setBounds(32, 29, 200, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Busqueda Binaria");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(51, 102, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda_Binaria.Busqueda_BinariaM();
			}
		});
		btnNewButton_1.setBounds(32, 84, 200, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Busqueda Secuencial");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(51, 102, 204));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda.Busqueda();
			}
		});
		btnNewButton_2.setBounds(32, 143, 200, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Hashing");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(51, 102, 204));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hashing.Hashing();
			}
		});
		btnNewButton_3.setBounds(32, 198, 200, 39);
		frame.getContentPane().add(btnNewButton_3);
	}

}
