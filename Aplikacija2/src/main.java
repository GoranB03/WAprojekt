import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Moja Prva Desktop Aplikacija");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBackground(new Color(255, 0, 255));
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(45, 11, 355, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JSlider slider = new JSlider();
		slider.setBounds(96, 165, 200, 26);
		frame.getContentPane().add(slider);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Radio VeleRI");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Popis pjesama koji slijede na radiju VeleRI: Kristijan Golubiæ - Motivacijska prièa");
			}
		});
		rdbtnNewRadioButton.setBounds(145, 193, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("Odaberite frekvenciju ili ve\u0107 napravljenu stanicu");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setBounds(80, 151, 240, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ugasi radio...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Radio ugašen...");
			}
		});
		btnNewButton.setFont(new Font("Ravie", Font.PLAIN, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(272, 215, 152, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
