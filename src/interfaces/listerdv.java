package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class listerdv extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listerdv frame = new listerdv();
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
	public listerdv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 862, 85);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 51));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Polyclinique Nabeul");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(322, 5, 258, 35);
		panel.add(lblNewLabel);
		
		JTextPane txtpnListeDesPatients = new JTextPane();
		txtpnListeDesPatients.setText("LISTE DES RDV");
		txtpnListeDesPatients.setForeground(Color.WHITE);
		txtpnListeDesPatients.setFont(new Font("Maiandra GD", Font.ITALIC, 24));
		txtpnListeDesPatients.setBackground(new Color(0, 0, 51));
		txtpnListeDesPatients.setBounds(348, 36, 310, 39);
		panel.add(txtpnListeDesPatients);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 852, 190);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID PATIENT", "NOM PATIENT", "NUM TEL", "NOM MEDECIEN", "DATE RDV", "DUREE CONSULTATION"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(347, 354, 133, 45);
		contentPane.add(btnNewButton);
	}

}
