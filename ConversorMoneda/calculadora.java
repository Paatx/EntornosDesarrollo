package monedas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class calculadora {

	private JFrame frmCalculadoraDeMonedas;
	private JTextField importecambio;
	private JTextField resultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadoraDeMonedas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public calculadora() {
		initialize();
	}

	private void initialize() {
		frmCalculadoraDeMonedas = new JFrame();
		frmCalculadoraDeMonedas.setTitle("Calculadora de Monedas\r\n");
		frmCalculadoraDeMonedas.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Acer\\Desktop\\CLASE\\ENTORNOS DE DESARROLLO\\PROYECTOS\\475497.png"));
		frmCalculadoraDeMonedas.getContentPane().setBackground(new Color(255, 217, 255));
		frmCalculadoraDeMonedas.getContentPane().setForeground(SystemColor.inactiveCaptionText);
		frmCalculadoraDeMonedas.setResizable(false);
		frmCalculadoraDeMonedas.setBounds(100, 100, 312, 489);
		frmCalculadoraDeMonedas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmCalculadoraDeMonedas.getContentPane().setLayout(null);

		JLabel importe = new JLabel("AÑADA  IMPORTE (en euros)");
		importe.setForeground(Color.GRAY);
		importe.setFont(new Font("Source Sans Pro Black", Font.BOLD, 15));
		importe.setBounds(80, 11, 195, 29);
		frmCalculadoraDeMonedas.getContentPane().add(importe);

		importecambio = new JTextField();
		importecambio.setBackground(new Color(164, 209, 255));
		importecambio.setBounds(24, 40, 251, 57);
		frmCalculadoraDeMonedas.getContentPane().add(importecambio);
		importecambio.setColumns(10);

		JLabel lblCambio = new JLabel("CAMBIO");
		lblCambio.setForeground(SystemColor.textInactiveText);
		lblCambio.setFont(new Font("Source Sans Pro", Font.BOLD, 17));
		lblCambio.setBounds(207, 114, 68, 29);
		frmCalculadoraDeMonedas.getContentPane().add(lblCambio);

		resultado = new JTextField();
		resultado.setBackground(new Color(164, 209, 255));
		resultado.setColumns(10);
		resultado.setBounds(24, 143, 251, 57);
		frmCalculadoraDeMonedas.getContentPane().add(resultado);

		JButton dolar = new JButton("DOLAR");
		dolar.setBackground(new Color(217, 236, 255));
		dolar.setBorder(UIManager.getBorder("RadioButton.border"));
		dolar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor;
				double calculo;
				double tasaDolar = 1.08;

				try {
					valor = Integer.parseInt(importecambio.getText());
					calculo = valor * tasaDolar;

					resultado.setText(String.format("%.2f", calculo) + " Dolares");
				} catch (NumberFormatException ex) {
					resultado.setText("Ingrese un número válido");
				}
			}
		});

		dolar.setBounds(24, 232, 116, 74);
		frmCalculadoraDeMonedas.getContentPane().add(dolar);

		JButton libras = new JButton("LIBRAS");
		libras.setBackground(new Color(217, 236, 255));
		libras.setBorder(UIManager.getBorder("RadioButton.border"));
		libras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor;
				double calculo;
				double tasaLibra = 0.86;

				try {
					valor = Integer.parseInt(importecambio.getText());
					calculo = valor * tasaLibra;

					resultado.setText(String.format("%.2f", calculo) + " Libras");
				} catch (NumberFormatException ex) {
					resultado.setText("Ingrese un número válido");
				}
			}
		});
		libras.setBounds(159, 232, 116, 74);
		frmCalculadoraDeMonedas.getContentPane().add(libras);

		JButton rublos = new JButton("RUBLOS");
		rublos.setBackground(new Color(217, 236, 255));
		rublos.setBorder(UIManager.getBorder("RadioButton.border"));
		rublos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor;
				double calculo;
				double tasaRublo = 98.86;

				try {
					valor = Integer.parseInt(importecambio.getText());
					calculo = valor * tasaRublo;

					resultado.setText(String.format("%.2f", calculo) + " Rublos");
				} catch (NumberFormatException ex) {
					resultado.setText("Ingrese un número válido");
				}
			}
		});
		rublos.setBounds(24, 317, 116, 74);
		frmCalculadoraDeMonedas.getContentPane().add(rublos);

		JButton yenes = new JButton("YENES");
		yenes.setBackground(new Color(217, 236, 255));
		yenes.setBorder(UIManager.getBorder("RadioButton.border"));
		yenes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor;
				double calculo;
				double tasaYen = 162;

				try {
					valor = Integer.parseInt(importecambio.getText());
					calculo = valor * tasaYen;

					resultado.setText(String.format("%.2f", calculo) + " Yenes");
				} catch (NumberFormatException ex) {
					resultado.setText("Ingrese un número válido");
				}
			}
		});
		yenes.setBounds(159, 317, 116, 74);
		frmCalculadoraDeMonedas.getContentPane().add(yenes);
	}
}
