package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JButton;

public class Ordonnance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ordonnance frame = new Ordonnance();
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
	public Ordonnance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 677);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom patient");
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel.setBounds(34, 59, 87, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pr\u00E9nom patient");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(291, 59, 118, 33);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(156, 66, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(419, 66, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Date naissance");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(34, 128, 112, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Num tel");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(303, 131, 87, 20);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 132, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(419, 132, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sexe");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(34, 203, 87, 17);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 201, 96, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Situation fam");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_5.setBounds(303, 201, 106, 17);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(419, 199, 96, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Proffession");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_6.setBounds(34, 268, 87, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 267, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Adresse");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_7.setBounds(303, 267, 87, 19);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(419, 267, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("M\u00E9decin traitant");
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_8.setBounds(129, 329, 139, 26);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(278, 333, 179, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 572, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Etat civil du patient");
		lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		lblNewLabel_9.setBounds(208, 18, 156, 13);
		panel.add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 365, 572, 41);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Traitement");
		lblNewLabel_10.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		lblNewLabel_10.setBounds(235, 10, 100, 13);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("M\u00E9dicaux");
		lblNewLabel_11.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_11.setBounds(34, 433, 87, 16);
		contentPane.add(lblNewLabel_11);
		
		textField_7 = new JTextField();
		textField_7.setBounds(156, 433, 96, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Notes");
		lblNewLabel_12.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_12.setBounds(303, 430, 87, 19);
		contentPane.add(lblNewLabel_12);
		
		textField_8 = new JTextField();
		textField_8.setBounds(419, 433, 96, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Signature");
		lblNewLabel_14.setFont(new Font("Sitka Text", Font.ITALIC, 15));
		lblNewLabel_14.setBounds(44, 514, 87, 19);
		contentPane.add(lblNewLabel_14);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		canvas.setBounds(178, 480, 337, 75);
		contentPane.add(canvas);
		
		JLabel lblNewLabel_13 = new JLabel("Pour plus d'information veuillez nous contacter sur notre email:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(10, 617, 380, 13);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("Polycliniquenb@gmail.com");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_15.setBounds(378, 617, 194, 13);
		contentPane.add(lblNewLabel_15);
		
		JButton btnNewButton = new JButton("Imprimer");
		btnNewButton.setBounds(190, 584, 87, 19);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBounds(348, 583, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
