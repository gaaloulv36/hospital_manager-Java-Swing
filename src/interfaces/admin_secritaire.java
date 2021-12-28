package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

public class admin_secritaire extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private final JPanel panel_3 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_secritaire frame = new admin_secritaire();
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
	public admin_secritaire() {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 655);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 857, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Polyclinique Nabeul");
		lblNewLabel.setBounds(284, 5, 258, 35);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Administrasion ");
		lblNewLabel_2.setBounds(323, 50, 175, 24);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\gaalo\\Downloads\\click.png"));
		lblNewLabel_3.setBounds(64, 5, 187, 55);
		panel.add(lblNewLabel_3);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 89, 857, 483);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 283, 857, 200);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"DOCTOR_ID", "DOCTOR_NAME", "SPECIALITE", "PASSWORD"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(76);
		table.getColumnModel().getColumn(1).setPreferredWidth(86);
		table.getColumnModel().getColumn(2).setPreferredWidth(67);
		table.getColumnModel().getColumn(3).setPreferredWidth(74);
		table.getColumnModel().getColumn(3).setMinWidth(39);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setToolTipText("");
		
		textField = new JTextField();
		textField.setBounds(89, 57, 180, 38);
		textField.setColumns(10);
		panel_1.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(41, 57, 47, 34);
		panel_1.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(647, 57, 180, 38);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 129, 180, 38);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(647, 129, 180, 38);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nom");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1.setBounds(22, 133, 69, 34);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("SPECIALITE");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_1.setBounds(499, 129, 138, 34);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("PASSWORD");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		lblNewLabel_2_1_1_2.setBounds(498, 61, 124, 26);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("DOCTOR MANAGER");
		lblNewLabel_2_2.setForeground(new Color(0, 0, 102));
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2_2.setBounds(317, 10, 339, 24);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(246, 210, 131, 38);
		panel_1.add(btnNewButton);
		
		JButton btnSupprimer = new JButton("SUPPRIMER");
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSupprimer.setBackground(Color.BLACK);
		btnSupprimer.setBounds(409, 210, 131, 38);
		panel_1.add(btnSupprimer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 51));
		panel_2.setBounds(0, 257, 857, 26);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("DOCTOR MANAGER");
		lblNewLabel_2_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_2_1.setBounds(284, 0, 339, 24);
		panel_2.add(lblNewLabel_2_2_1);
		panel_3.setBackground(new Color(0, 0, 51));
		panel_3.setBounds(0, 571, 857, 47);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHome.setBounds(373, 10, 128, 32);
		panel_3.add(btnHome);
		btnHome.setForeground(new Color(0, 0, 0));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setBackground(SystemColor.activeCaptionBorder);
	}
}
