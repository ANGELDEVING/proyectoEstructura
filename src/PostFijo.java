import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PostFijo extends JFrame {

	private JPanel contentPane;
	private JTextField txtOperacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostFijo frame = new PostFijo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PostFijo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOperacion = new JTextField();
		txtOperacion.setBounds(10, 45, 114, 20);
		contentPane.add(txtOperacion);
		txtOperacion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 170, 500, 140);
		contentPane.add(lblNewLabel);
		JButton btnPostfijo = new JButton("Calcular");
		btnPostfijo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones objOperaciones = new Operaciones();
				lblNewLabel.setText(objOperaciones.Postfijo(txtOperacion.getText()));
			}
		});
		btnPostfijo.setBounds(173, 87, 89, 23);
		contentPane.add(btnPostfijo);
		
	}
}
