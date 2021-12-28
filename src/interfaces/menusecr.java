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

public class menusecr extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menusecr frame = new menusecr();
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
	public menusecr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 941, 97);
		contentPane.add(panel);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Polyclinique Nabeul");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Maiandra GD", Font.BOLD, 26));
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setBounds(343, 10, 299, 34);
		panel.add(textPane);
		
		JTextPane txtpnMenuSecrtaire = new JTextPane();
		txtpnMenuSecrtaire.setText("Menu Secr\u00E9taire");
		txtpnMenuSecrtaire.setForeground(Color.BLACK);
		txtpnMenuSecrtaire.setFont(new Font("Maiandra GD", Font.ITALIC, 24));
		txtpnMenuSecrtaire.setBackground(SystemColor.activeCaption);
		txtpnMenuSecrtaire.setBounds(386, 38, 219, 39);
		panel.add(txtpnMenuSecrtaire);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 97, 941, 77);
		contentPane.add(panel_1);
		
		JTextPane txtpnPatient = new JTextPane();
		txtpnPatient.setText("Patients");
		txtpnPatient.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnPatient.setBackground(SystemColor.activeCaption);
		txtpnPatient.setBounds(110, 18, 127, 31);
		panel_1.add(txtpnPatient);
		
		JTextPane txtpnRendezVous = new JTextPane();
		txtpnRendezVous.setText("Rendez Vous");
		txtpnRendezVous.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnRendezVous.setBackground(SystemColor.activeCaption);
		txtpnRendezVous.setBounds(400, 19, 127, 30);
		panel_1.add(txtpnRendezVous);
		
		JTextPane txtpnComptabilit = new JTextPane();
		txtpnComptabilit.setText("Comptabilit\u00E9");
		txtpnComptabilit.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtpnComptabilit.setBackground(SystemColor.activeCaption);
		txtpnComptabilit.setBounds(681, 18, 127, 31);
		panel_1.add(txtpnComptabilit);
	}
}
