package questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Votacao extends JFrame {
	int candidato1;
	int candidato2;
	int nulo;
	int branco;
	private JPanel contentPane;
	private JTextField txtVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Votacao frame = new Votacao();
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
	public Votacao() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("20 - MARIA");
		lblNewLabel.setBounds(83, 23, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("30 - PEDRO");
		lblNewLabel_1.setBounds(83, 48, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1 - NULO");
		lblNewLabel_2.setBounds(83, 73, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2 - BRANCO");
		lblNewLabel_3.setBounds(83, 98, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Seu voto");
		lblNewLabel_4.setBounds(21, 151, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtVoto = new JTextField();
		txtVoto.setBounds(83, 148, 86, 20);
		contentPane.add(txtVoto);
		txtVoto.setColumns(10);
		
		JButton btnNewButton = new JButton("Votar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int voto = Integer.parseInt(txtVoto.getText());
				
				switch (voto) {
				
				case 20:
					candidato1 ++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado");
					txtVoto.setText("");
					break;
				case 30:
					candidato2 ++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado");
					txtVoto.setText("");
					break;
				case 1:
					nulo ++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado");
					txtVoto.setText("");					
					break;
				case 2:
					branco ++;
					JOptionPane.showMessageDialog(null, "Voto Confirmado");
					txtVoto.setText("");
					break;
					
				}
				
			}
		});
		btnNewButton.setBounds(49, 197, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(147, 197, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Apurar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (candidato1 > candidato2)
				JOptionPane.showMessageDialog(null, "Candidato Maria GANHOU");
			else if (candidato2 > candidato1)
				JOptionPane.showMessageDialog(null, "Candidato Pedro GANHOU");
			else
				JOptionPane.showMessageDialog(null, "EMPATE");
			
			}
		});
		btnNewButton_2.setBounds(246, 197, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
