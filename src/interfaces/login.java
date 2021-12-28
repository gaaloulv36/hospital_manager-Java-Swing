package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 548);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 280, 505);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Polyclinique Nabeul");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(35, 34, 212, 103);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Traitements sp\u00E9ciales");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(45, 125, 199, 67);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Staff qualifi\u00E9s");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(71, 202, 163, 50);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\pngtree-hospital-icon-png-image_5222692 (2).png"));
		lblNewLabel_3.setBounds(59, 280, 175, 132);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("USERNAME");
		lblNewLabel_4.setFont(new Font("Maiandra GD", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(333, 126, 127, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PASSWORD");
		lblNewLabel_5.setFont(new Font("Maiandra GD", Font.ITALIC, 15));
		lblNewLabel_5.setBounds(333, 192, 127, 33);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(453, 131, 156, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(405, 335, 113, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(543, 335, 113, 33);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(453, 192, 156, 28);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2_1 = new JLabel("PCN");
		lblNewLabel_2_1.setBackground(new Color(0, 51, 51));
		lblNewLabel_2_1.setForeground(new Color(0, 0, 51));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_2_1.setBounds(497, 44, 70, 50);
		contentPane.add(lblNewLabel_2_1);
	}
}
