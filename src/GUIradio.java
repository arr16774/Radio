import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;

public class GUIradio {

	private Radio r;
	private JFrame frame;
	private JLabel Emi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIradio window = new GUIradio();
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
	public GUIradio() {
		Emi=new JLabel();
		r=new Radio();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCamb = new JButton("AM/FM");
		btnCamb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCamb.setBounds(230, 13, 206, 50);
		frame.getContentPane().add(btnCamb);
		
		JButton batras = new JButton("<");
		batras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.Cambiar(false);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		batras.setBounds(12, 203, 97, 25);
		frame.getContentPane().add(batras);
		
		JButton badelante = new JButton(">");
		badelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				r.Cambiar(true);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		badelante.setBounds(339, 203, 97, 25);
		frame.getContentPane().add(badelante);
		
		JButton f1 = new JButton("1");
		f1.setBounds(12, 74, 97, 25);
		frame.getContentPane().add(f1);
		
		JButton f2 = new JButton("2");
		f2.setBounds(121, 74, 97, 25);
		frame.getContentPane().add(f2);
		
		JButton f3 = new JButton("3");
		f3.setBounds(230, 74, 97, 25);
		frame.getContentPane().add(f3);
		
		JButton f4 = new JButton("4");
		f4.setBounds(339, 74, 97, 25);
		frame.getContentPane().add(f4);
		
		JButton f5 = new JButton("5");
		f5.setBounds(12, 112, 97, 25);
		frame.getContentPane().add(f5);
		
		JButton f6 = new JButton("6");
		f6.setBounds(121, 112, 97, 25);
		frame.getContentPane().add(f6);
		
		JButton f7 = new JButton("7");
		f7.setBounds(230, 112, 97, 25);
		frame.getContentPane().add(f7);
		
		JButton f8 = new JButton("8");
		f8.setBounds(339, 112, 97, 25);
		frame.getContentPane().add(f8);
		
		JButton f9 = new JButton("9");
		f9.setBounds(12, 150, 97, 25);
		frame.getContentPane().add(f9);
		
		JButton f10 = new JButton("10");
		f10.setBounds(121, 150, 97, 25);
		frame.getContentPane().add(f10);
		
		JButton f11 = new JButton("11");
		f11.setBounds(230, 150, 97, 25);
		frame.getContentPane().add(f11);
		
		JButton f12 = new JButton("12");
		f12.setBounds(339, 150, 97, 25);
		frame.getContentPane().add(f12);
		
		
		JLabel lblOn = new JLabel("ON");
		lblOn.setForeground(Color.GREEN);
		lblOn.setBounds(40, 25, 29, 16);
		frame.getContentPane().add(lblOn);
		
		JLabel lblOff = new JLabel("OFF");
		lblOff.setForeground(Color.RED);
		lblOff.setBounds(149, 25, 56, 16);
		frame.getContentPane().add(lblOff);
		
		ButtonGroup grupo1=new ButtonGroup();
		
		JRadioButton radioButton = new JRadioButton("",true);
		radioButton.setBounds(75, 22, 29, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("",false);
		radioButton_1.setBounds(106, 22, 29, 23);
		frame.getContentPane().add(radioButton_1);
		
		grupo1.add(radioButton_1);
		grupo1.add(radioButton);
		
		Emi.setBounds(149, 208, 147, 36);
		frame.getContentPane().add(Emi);
		
	}
}
