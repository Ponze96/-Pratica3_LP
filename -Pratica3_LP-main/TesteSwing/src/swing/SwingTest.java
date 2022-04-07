package swing;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingTest {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTest window = new SwingTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(23, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(76, 34, 191, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(23, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(77, 87, 190, 20);
		frame.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Valida CPF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ValidaCPF.isCPF(txtCPF.getText()) == true)
					JOptionPane.showMessageDialog(null, "CPF Valido " + txtCPF.getText());
				else 
					JOptionPane.showMessageDialog(null,  "CPF Invalido " + txtCPF.getText());
			}
		});
		btnNewButton.setBounds(105, 146, 131, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
