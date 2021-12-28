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
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class patient_interface extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patient_interface frame = new patient_interface();
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
	public patient_interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 936, 91);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Polyclinique Nabeul");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(371, 5, 258, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Secritaire");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2.setBounds(448, 50, 121, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(81, 5, 175, 76);
		panel.add(lblNewLabel_3);
		
		JLabel lblPatientsInformation = new JLabel("PATIENTS INFORMATION");
		lblPatientsInformation.setForeground(new Color(0, 0, 102));
		lblPatientsInformation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblPatientsInformation.setBounds(289, 101, 370, 35);
		contentPane.add(lblPatientsInformation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 146, 936, 403);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 283, 936, 124);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "NOM", "PRENOM", "PHONE", "AGE", "SEX", "ADDRESS", "MEDICINES"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(78, 57, 124, 38);
		panel_1.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(41, 57, 47, 34);
		panel_1.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 129, 124, 38);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nom");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1.setBounds(22, 133, 69, 34);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("MEDICINES");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_1.setBounds(212, 129, 124, 34);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("PRENOM");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2.setBounds(212, 61, 94, 26);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("DOCTOR MANAGER");
		lblNewLabel_2_2_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2_2_1.setBounds(341, 10, 339, 24);
		panel_1.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(253, 210, 131, 38);
		panel_1.add(btnNewButton);
		
		JButton btnModifer = new JButton("MODIFER");
		btnModifer.setForeground(Color.WHITE);
		btnModifer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnModifer.setBackground(Color.BLACK);
		btnModifer.setBounds(420, 210, 131, 38);
		panel_1.add(btnModifer);
		
		JButton btnSupprimer = new JButton("SUPPRIMER");
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSupprimer.setBackground(Color.BLACK);
		btnSupprimer.setBounds(586, 210, 131, 38);
		panel_1.add(btnSupprimer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 0, 51));
		panel_2.setBounds(0, 257, 936, 26);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("PATIENTS LIST");
		lblNewLabel_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_2_1_1.setBounds(400, 0, 339, 24);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(341, 57, 124, 38);
		panel_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(341, 129, 124, 38);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(593, 57, 124, 38);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("ADDRESSE");
		lblNewLabel_2_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2_1.setBounds(475, 61, 124, 26);
		panel_1.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("SEXE");
		lblNewLabel_2_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2_1_1.setBounds(496, 133, 87, 26);
		panel_1.add(lblNewLabel_2_1_1_2_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(593, 132, 124, 30);
		panel_1.add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(815, 57, 111, 38);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("PHone");
		lblNewLabel_2_1_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2_1_1_1.setBounds(724, 65, 81, 26);
		panel_1.add(lblNewLabel_2_1_1_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(815, 129, 111, 38);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("AGE");
		lblNewLabel_2_1_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2_1_1_1_1.setBounds(737, 133, 81, 26);
		panel_1.add(lblNewLabel_2_1_1_2_1_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 0, 51));
		panel_3.setBounds(0, 547, 936, 47);
		contentPane.add(panel_3);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setBackground(Color.BLACK);
		btnHome.setBounds(406, 0, 127, 34);
		panel_3.add(btnHome);
	}
}
