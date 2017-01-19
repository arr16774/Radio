import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private int gua;

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
		gua=0;
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
		btnCamb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				r.Frecuencia();
			}
		});
		btnCamb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCamb.setBounds(145, 26, 120, 25);
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
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=1;
				r.Seleccionar(1);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		
		f1.setBounds(12, 74, 97, 25);
		frame.getContentPane().add(f1);
		
		JButton f2 = new JButton("2");
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=2;
				r.Seleccionar(2);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f2.setBounds(121, 74, 97, 25);
		frame.getContentPane().add(f2);
		
		JButton f3 = new JButton("3");
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=3;
				r.Seleccionar(3);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f3.setBounds(230, 74, 97, 25);
		frame.getContentPane().add(f3);
		
		JButton f4 = new JButton("4");
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=4;
				r.Seleccionar(4);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f4.setBounds(339, 74, 97, 25);
		frame.getContentPane().add(f4);
		
		JButton f5 = new JButton("5");
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=5;
				r.Seleccionar(5);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f5.setBounds(12, 112, 97, 25);
		frame.getContentPane().add(f5);
		
		JButton f6 = new JButton("6");
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=6;
				r.Seleccionar(6);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f6.setBounds(121, 112, 97, 25);
		frame.getContentPane().add(f6);
		
		JButton f7 = new JButton("7");
		f7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=7;
				r.Seleccionar(7);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f7.setBounds(230, 112, 97, 25);
		frame.getContentPane().add(f7);
		
		JButton f8 = new JButton("8");
		f8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=6;
				r.Seleccionar(8);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f8.setBounds(339, 112, 97, 25);
		frame.getContentPane().add(f8);
		
		JButton f9 = new JButton("9");
		f9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=9;
				r.Seleccionar(9);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f9.setBounds(12, 150, 97, 25);
		frame.getContentPane().add(f9);
		
		JButton f10 = new JButton("10");
		f10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=10;
				r.Seleccionar(10);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f10.setBounds(121, 150, 97, 25);
		frame.getContentPane().add(f10);
		
		JButton f11 = new JButton("11");
		f11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=11;
				r.Seleccionar(11);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f11.setBounds(230, 150, 97, 25);
		frame.getContentPane().add(f11);
		
		JButton f12 = new JButton("12");
		f12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gua=12;
				r.Seleccionar(12);
				Emi.setText(Float.toString(r.Seleccionar(0)));
			}
		});
		f12.setBounds(339, 150, 97, 25);
		frame.getContentPane().add(f12);
		
		
		Emi.setBounds(149, 208, 147, 36);
		frame.getContentPane().add(Emi);
		
		JButton btnOnoff = new JButton("ON/OFF");
		btnOnoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				r.Estado();
			}
		});
		btnOnoff.setBounds(27, 29, 89, 23);
		frame.getContentPane().add(btnOnoff);
		
		JButton GuardarEmi = new JButton("Guardar Emisora");
		GuardarEmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.Guardar(gua);
			}
		});
		GuardarEmi.setBounds(301, 28, 113, 25);
		frame.getContentPane().add(GuardarEmi);
		
	}
}

