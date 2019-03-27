package Interfaz;
import Interfaz.Metodos_Busqueda;
import Interfaz.Metodos_Ordenamiento;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Master_Control {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Master_Control window = new Master_Control();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Master_Control() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(102, 153, 255));
		frame.getContentPane().setBackground(new Color(0, 153, 255));
		frame.getContentPane().setForeground(new Color(153, 255, 102));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Master_Control.class.getResource("/LOgo/c409d409708a06c921ab88ed9e43bc9e-icono-del-c-rculo-de-base-de-datos-by-vexels.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 295, 235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMetodosDeOrdenamiento = new JButton("Metodos de Ordenamiento");
		btnMetodosDeOrdenamiento.setForeground(new Color(255, 255, 255));
		btnMetodosDeOrdenamiento.setBackground(new Color(51, 102, 204));
		btnMetodosDeOrdenamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Metodos_Ordenamiento.ventana_ordenamiento();
			}
		});
		btnMetodosDeOrdenamiento.setBounds(33, 64, 218, 42);
		frame.getContentPane().add(btnMetodosDeOrdenamiento);
		
		JButton btnNewButton = new JButton("Metodos de Busqueda");
		btnNewButton.setBackground(new Color(51, 102, 204));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Metodos_Busqueda.ventana_busqueda();
			}
		});
		btnNewButton.setBounds(33, 134, 218, 42);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Estructuras de Datos II");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(44, 11, 218, 42);
		frame.getContentPane().add(lblNewLabel);
	}
}
