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

public class menumedecin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menumedecin frame = new menumedecin();
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
	public menumedecin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 940, 97);
		contentPane.add(panel);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Polyclinique Nabeul");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Maiandra GD", Font.BOLD, 26));
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setBounds(343, 10, 299, 34);
		panel.add(textPane);
		
		JTextPane txtpnMenuMdecin = new JTextPane();
		txtpnMenuMdecin.setText("Menu M\u00E9decin");
		txtpnMenuMdecin.setForeground(Color.BLACK);
		txtpnMenuMdecin.setFont(new Font("Maiandra GD", Font.ITALIC, 24));
		txtpnMenuMdecin.setBackground(SystemColor.activeCaption);
		txtpnMenuMdecin.setBounds(386, 38, 219, 39);
		panel.add(txtpnMenuMdecin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(-1, 94, 941, 77);
		contentPane.add(panel_1);
		
		JTextPane txtpnRendezVous = new JTextPane();
		txtpnRendezVous.setText("Rendez Vous");
		txtpnRendezVous.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnRendezVous.setBackground(SystemColor.activeCaption);
		txtpnRendezVous.setBounds(385, 18, 127, 31);
		panel_1.add(txtpnRendezVous);
		
		JTextPane txtpnOrd = new JTextPane();
		txtpnOrd.setText("Ordonnance");
		txtpnOrd.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnOrd.setBackground(SystemColor.activeCaption);
		txtpnOrd.setBounds(708, 19, 127, 31);
		panel_1.add(txtpnOrd);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Patients");
		textPane_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textPane_2.setBackground(SystemColor.activeCaption);
		textPane_2.setBounds(87, 18, 127, 31);
		panel_1.add(textPane_2);
	}

}
