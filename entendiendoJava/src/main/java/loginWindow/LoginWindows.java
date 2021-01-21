package loginWindow;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindows extends JFrame {

	private JPanel contentPane;
	private JTextField TxtPassword;


	/**
	 * Create the frame.
	 */
	public LoginWindows() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TxtPassword = new JTextField();
		TxtPassword.setBounds(98, 36, 158, 20);
		contentPane.add(TxtPassword);
		TxtPassword.setColumns(10);
		
		JButton btnLogear = new JButton("Entrar");
		
		btnLogear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogear.setBounds(167, 73, 89, 23);
		contentPane.add(btnLogear);
	}
}
