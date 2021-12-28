package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JTree;

public class compta extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compta frame = new compta();
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
	public compta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 739, 26);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(0, 24, 739, 26);
		contentPane.add(panel_1);
		
		JTextPane txtpnServicePaiement = new JTextPane();
		txtpnServicePaiement.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnServicePaiement.setBackground(Color.PINK);
		txtpnServicePaiement.setText("Service Paiement ");
		panel_1.add(txtpnServicePaiement);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Name Patient");
		tglbtnNewToggleButton.setToolTipText("\r\n");
		tglbtnNewToggleButton.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton.setBounds(53, 102, 115, 21);
		contentPane.add(tglbtnNewToggleButton);
		
		table = new JTable();
		table.setBounds(0, 80, 739, 161);
		contentPane.add(table);
	}
}
