package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Secritaire_admin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secritaire_admin frame = new Secritaire_admin();
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
	public Secritaire_admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 838, 91);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Polyclinique Nabeul");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(284, 5, 258, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Administrasion ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2.setBounds(323, 50, 175, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(81, 5, 175, 76);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("SECRITAIRE MANAGER");
		lblNewLabel_2_2.setForeground(new Color(0, 0, 102));
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2_2.setBounds(276, 101, 339, 24);
		contentPane.add(lblNewLabel_2_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 136, 838, 403);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 283, 838, 124);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID SECRITAIRE", "Departement", "PASSWORD", "NOM_SECRITAIRE"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(89, 57, 180, 38);
		panel_1.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(41, 57, 47, 34);
		panel_1.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(587, 57, 180, 38);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 129, 180, 38);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(587, 129, 180, 38);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nom");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1.setBounds(22, 133, 69, 34);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("DEPARTEMENT");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_1.setBounds(416, 129, 161, 34);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("PASSWORD");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2.setBounds(453, 61, 124, 26);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(231, 210, 131, 38);
		panel_1.add(btnNewButton);
		
		JButton btnSupprimer = new JButton("SUPPRIMER");
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSupprimer.setBackground(Color.BLACK);
		btnSupprimer.setBounds(391, 210, 131, 38);
		panel_1.add(btnSupprimer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 0, 51));
		panel_2.setBounds(0, 257, 838, 26);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("SECRITAIRE LIST");
		lblNewLabel_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_2_1_1.setBounds(284, 0, 339, 24);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 51));
		panel_3.setBounds(0, 537, 838, 76);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBounds(332, 5, 136, 48);
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setBackground(Color.BLACK);
		panel_3.add(btnHome);
	}

}
