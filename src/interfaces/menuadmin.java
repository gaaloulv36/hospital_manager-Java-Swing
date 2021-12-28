package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class menuadmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuadmin frame = new menuadmin();
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
	public menuadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 944, 87);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnPolycliniqueNabeul = new JTextPane();
		txtpnPolycliniqueNabeul.setFont(new Font("Maiandra GD", Font.BOLD, 26));
		txtpnPolycliniqueNabeul.setForeground(new Color(0, 0, 0));
		txtpnPolycliniqueNabeul.setText("Polyclinique Nabeul");
		txtpnPolycliniqueNabeul.setBackground(SystemColor.activeCaption);
		txtpnPolycliniqueNabeul.setBounds(343, 10, 299, 34);
		panel.add(txtpnPolycliniqueNabeul);
		
		JTextPane txtpnAcceuil = new JTextPane();
		txtpnAcceuil.setBackground(SystemColor.activeCaption);
		txtpnAcceuil.setForeground(new Color(0, 0, 0));
		txtpnAcceuil.setFont(new Font("Maiandra GD", Font.ITALIC, 24));
		txtpnAcceuil.setText("Menu Admin");
		txtpnAcceuil.setBounds(386, 38, 219, 39);
		panel.add(txtpnAcceuil);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 86, 934, 77);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnSecrtaire = new JTextPane();
		txtpnSecrtaire.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnSecrtaire.setBackground(SystemColor.activeCaption);
		txtpnSecrtaire.setText("Secr\u00E9taire");
		txtpnSecrtaire.setBounds(276, 19, 127, 31);
		panel_1.add(txtpnSecrtaire);
		
		JTextPane txtpnMdecin = new JTextPane();
		txtpnMdecin.setBackground(SystemColor.activeCaption);
		txtpnMdecin.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnMdecin.setText("M\u00E9decin");
		txtpnMdecin.setBounds(509, 19, 127, 30);
		panel_1.add(txtpnMdecin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\247719793_3205988292975526_3923866616756717571_n (6).png"));
		lblNewLabel.setBounds(0, 160, 934, 319);
		contentPane.add(lblNewLabel);
	}
}
