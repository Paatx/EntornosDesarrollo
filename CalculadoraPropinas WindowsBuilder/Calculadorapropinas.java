package monedas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

public class Calculadorapropinas {

	private JFrame frmTipmaster;
	private JTextField importe1;
	private JTextField importepropina;
	private JTextField total;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Calculadorapropinas window = new Calculadorapropinas();
					window.frmTipmaster.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculadorapropinas() {
		initialize();
	}

	private void initialize() {
		frmTipmaster = new JFrame();
		frmTipmaster.setForeground(new Color(0, 0, 0));
		frmTipmaster.setTitle("TipMaster ");

		frmTipmaster.getContentPane().setBackground(new Color(255, 170, 170));
		frmTipmaster.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Acer\\Desktop\\CLASE\\ENTORNOS DE DESARROLLO\\Proyectos1\\CalculadoraPropinas WindowsBuilder\\Imagenes del proyecto\\FONDO1.png"));
		frmTipmaster.setBackground(new Color(128, 128, 192));
		frmTipmaster.setBounds(100, 100, 350, 472);
		frmTipmaster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmTipmaster.getContentPane().setLayout(null);

		// botón 10%
		JButton diezporciento = new JButton("10%");
		diezporciento.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		diezporciento.setBackground(new Color(170, 253, 149));
		diezporciento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double importe;
				double resultado;

				try {
					String textoImporte = importe1.getText();
					importe = Double.parseDouble(textoImporte);

					resultado = (importe * 0.10);

					System.out.println("Resultado: " + resultado);

					importepropina.setText(String.format("%.2f Euros", resultado));
					total.setText(String.format("%.2f EUROS", importe + resultado));

				} catch (NumberFormatException ex) {
					importepropina.setText("Ingrese un número válido");
				}
			}
		});

		total = new JTextField();
		total.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(0, 0, 0), null, new Color(0, 0, 0)));
		total.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				importe1.getText();
				importepropina.getText();
				total.setText(String.format("%.2f Euros"));

			}
		});
		// BOTÓN 0%//
		JButton ceroporciento = new JButton("0%");
		ceroporciento.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		ceroporciento.setBackground(new Color(241, 245, 167));

		ceroporciento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				importepropina.setText("");
				try {
					String textoImporte = importe1.getText();
					double importe = Double.parseDouble(textoImporte);
					total.setText(String.format("%.2f EUROS", importe));
				} catch (NumberFormatException ex) {
					importepropina.setText("Ingrese un número válido");
				}
			}
		});

		JLabel lblNewLabel_1 = new JLabel(" Seleccione el porcentaje de propina a aplicar:");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(100, 100, 100));
		lblNewLabel_1.setBackground(new Color(234, 255, 225));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(22, 74, 286, 21);
		frmTipmaster.getContentPane().add(lblNewLabel_1);
		// campos de relleno
		JLabel texto1 = new JLabel("  IMPORTE DE SU FACTURA:");
		texto1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		texto1.setOpaque(true);
		texto1.setBackground(new Color(234, 255, 225));
		texto1.setForeground(new Color(103, 103, 103));
		texto1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		texto1.setBounds(65, 11, 191, 21);
		frmTipmaster.getContentPane().add(texto1);

		importe1 = new JTextField();
		importe1.setCaretColor(new Color(0, 0, 0));
		importe1.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(0, 0, 0), null, new Color(0, 0, 0)));
		importe1.setBounds(44, 32, 240, 31);
		frmTipmaster.getContentPane().add(importe1);
		importe1.setColumns(10);

		ceroporciento.setBounds(44, 106, 101, 43);
		frmTipmaster.getContentPane().add(ceroporciento);

		JLabel adorno = new JLabel("");
		adorno.setIcon(new ImageIcon(
				"C:\\Users\\Acer\\Desktop\\CLASE\\ENTORNOS DE DESARROLLO\\Proyectos1\\Screenshot_1-Recuperado.png"));
		adorno.setBounds(255, -68, 127, 230);
		frmTipmaster.getContentPane().add(adorno);
		total.setBounds(37, 317, 247, 31);
		frmTipmaster.getContentPane().add(total);
		total.setColumns(10);

		diezporciento.setBounds(44, 160, 101, 43);
		frmTipmaster.getContentPane().add(diezporciento);

		// BOTÓN 20%
		JButton veinteporciento = new JButton("20%");
		veinteporciento.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		veinteporciento.setBackground(new Color(136, 251, 21));
		veinteporciento.setBounds(190, 160, 94, 43);
		frmTipmaster.getContentPane().add(veinteporciento);
		veinteporciento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double importe;
				double resultado;

				try {
					String textoImporte = importe1.getText();
					importe = Double.parseDouble(textoImporte);

					resultado = (importe * 20) / 100;

					importepropina.setText(String.format("%.2f EUROS", resultado));
					total.setText(String.format("%.2f EUROS", importe + resultado));

				} catch (NumberFormatException ex) {
					importepropina.setText("Ingrese un número válido");
				}

			}
		});

		JButton quinceporciento = new JButton("15%");
		quinceporciento.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		quinceporciento.setBackground(new Color(138, 255, 138));
		quinceporciento.setBounds(190, 106, 94, 43);
		frmTipmaster.getContentPane().add(quinceporciento);

		// BOTON 15%
		quinceporciento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double importe;
				double resultado;

				try {
					String textoImporte = importe1.getText();
					importe = Double.parseDouble(textoImporte);

					resultado = (importe * 15) / 100;

					importepropina.setText(String.format("%.2f EUROS", resultado));
					total.setText(String.format("%.2f EUROS", importe + resultado));

				} catch (NumberFormatException ex) {
					importepropina.setText("Ingrese un número válido");
				}
			}
		});

		importepropina = new JTextField();
		importepropina.setFont(new Font("Tahoma", Font.BOLD, 12));
		importepropina.setForeground(new Color(0, 193, 49));
		importepropina
				.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(0, 0, 0), null, new Color(0, 0, 0)));
		importepropina.setBounds(37, 253, 247, 31);
		frmTipmaster.getContentPane().add(importepropina);
		importepropina.setColumns(10);

		JLabel PROPINA = new JLabel("\r\n  PROPINA:");
		PROPINA.setForeground(new Color(108, 108, 108));
		PROPINA.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		PROPINA.setOpaque(true);
		PROPINA.setBackground(new Color(199, 228, 194));
		PROPINA.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		PROPINA.setBounds(114, 226, 94, 31);
		frmTipmaster.getContentPane().add(PROPINA);

		JLabel lblNewLabel = new JLabel("   TOTAL A PAGAR:");
		lblNewLabel.setForeground(new Color(108, 108, 108));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setBackground(new Color(199, 228, 194));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel.setBounds(79, 281, 157, 43);
		frmTipmaster.getContentPane().add(lblNewLabel);

		// BOTÓN DE REINICIO
		JButton reinicio = new JButton("REINICIAR");
		reinicio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		reinicio.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		reinicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				importe1.setText("");
				importepropina.setText("");
				total.setText("");

			}
		});
		reinicio.setBounds(95, 366, 127, 31);
		frmTipmaster.getContentPane().add(reinicio);

		JLabel GraciasFinal = new JLabel(" ¡Gracias por su visita! ");
		GraciasFinal.setOpaque(true);
		GraciasFinal.setBackground(new Color(0, 0, 0));
		GraciasFinal.setForeground(new Color(255, 255, 255));
		GraciasFinal.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		GraciasFinal.setBounds(95, 408, 127, 14);
		frmTipmaster.getContentPane().add(GraciasFinal);

		JLabel logotipMaster = new JLabel("");
		logotipMaster.setIcon(new ImageIcon(
				"C:\\Users\\Acer\\Desktop\\CLASE\\ENTORNOS DE DESARROLLO\\Proyectos1\\CalculadoraPropinas WindowsBuilder\\Imagenes del proyecto\\LOGOTIPMASTER.png"));
		logotipMaster.setBounds(222, 317, 141, 152);
		frmTipmaster.getContentPane().add(logotipMaster);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(
				"C:\\Users\\Acer\\Desktop\\CLASE\\ENTORNOS DE DESARROLLO\\Proyectos1\\CalculadoraPropinas WindowsBuilder\\Imagenes del proyecto\\FONDO2.png"));
		fondo.setBounds(-384, -244, 855, 677);
		frmTipmaster.getContentPane().add(fondo);
	}
}
