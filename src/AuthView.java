import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AuthView {

	JPanel panel;
	
	AuthModel modelo;
	public AuthView()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(20,20,550,550);
		
		modelo = new AuthModel();
	}
	
	
	public JPanel login()
	{

		JLabel lblIngresar = new JLabel();
		Font fontIngresar = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblIngresar.setFont(fontIngresar);
		lblIngresar.setBounds(120,20,300,70);
		lblIngresar.setText("preciones crear cuenta para uqe funcione");
		lblIngresar.setOpaque(true);
		lblIngresar.setHorizontalAlignment(0);
		lblIngresar.setBackground(new Color(0,0,0,1));
		lblIngresar.setForeground(new Color(216,199,137));
		panel.add(lblIngresar);
		
		
		
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(getClass().getResource("icono.png")));
		lblImagen.setBounds(92,150,32,32);
		panel.add(lblImagen);
		
		JLabel lblImagen2 = new JLabel();
		lblImagen2.setIcon(new ImageIcon(getClass().getResource("icono2.png")));
		lblImagen2.setBounds(92,250,32,32);
		panel.add(lblImagen2);

		
		JLabel lblUsuario = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblUsuario.setFont(fontUsuario);
		lblUsuario.setBounds(120,120,300,25);
		lblUsuario.setText("Enter your Username");
		lblUsuario.setOpaque(true);
		lblUsuario.setBackground(new Color(0,0,0,1));
		lblUsuario.setForeground(new Color(255,255,255));
		panel.add(lblUsuario);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(120,150,300,35);
		panel.add(txtUsuario);
		
		JLabel lblContrasena = new JLabel();
		Font fontContrasena = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblContrasena.setFont(fontContrasena);
		lblContrasena.setBounds(120,220,300,25);
		lblContrasena.setText("Enter your Pasword");
		lblContrasena.setOpaque(true);
		lblContrasena.setBackground(new Color(0,0,0,1));
		lblContrasena.setForeground(new Color(255,255,255));
		panel.add(lblContrasena);
		
		JTextField pwUsuario = new JTextField();
		pwUsuario.setBounds(120,250,300,35);
		pwUsuario.setText("");
		panel.add(pwUsuario);
		
		JButton btnEnviar = new JButton();
		btnEnviar.setBackground(Color.blue);
		btnEnviar.setBounds(200,320,100,30);
		btnEnviar.setIcon(new ImageIcon(getClass().getResource("botonsito.png")));
		panel.add(btnEnviar);
	
		JButton btnEnviar2 = new JButton("crear cuenta");
		btnEnviar2.setBackground(Color.yellow);
		btnEnviar2.setBounds(320,320,200,30);
		btnEnviar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(modelo.login(txtUsuario.getText(),pwUsuario.getText()))
				{
					System.out.println("nice biemvenido");
				}
				else
				{
					System.out.println("pipipipipipipip no existe");
				}
				
				
			}});
		
		panel.add(btnEnviar2);
		
		JButton btnEnviar3 = new JButton("recuperar cuenta");
		btnEnviar3.setBackground(Color.yellow);
		btnEnviar3.setBounds(20,320,150,30);
		btnEnviar3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				

				
				
				
			}});
		
		panel.add(btnEnviar3);
		
		
		
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo2.setBounds(1,-100,548,648);
		panel.add(fondo2);
		
		panel.setBackground(Color.blue);
		return panel;
	}
	
	
	
	public JPanel registro()
	{
		panel.setBackground(Color.blue);
		return panel;
	}
}
