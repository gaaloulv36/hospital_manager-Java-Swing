package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class loding extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loding frame = new loding();
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
	public loding() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Polyclinique Nabeul");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		lblNewLabel.setBounds(276, 254, 212, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblGestionDeHospital = new JLabel("GESTION DE HOSPITAL");
		lblGestionDeHospital.setForeground(Color.WHITE);
		lblGestionDeHospital.setFont(new Font("Tw Cen MT", Font.BOLD, 28));
		lblGestionDeHospital.setBounds(236, 10, 280, 71);
		contentPane.add(lblGestionDeHospital);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gaalo\\Downloads\\hospital (1) (1).png"));
		lblNewLabel_1.setBounds(306, 56, 138, 174);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("%");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 29));
		lblNewLabel_2.setBounds(351, 321, 72, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHealthcare = new JLabel("HEALTHCARE");
		lblHealthcare.setForeground(Color.WHITE);
		lblHealthcare.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		lblHealthcare.setBounds(306, 210, 138, 71);
		contentPane.add(lblHealthcare);
	}

}
