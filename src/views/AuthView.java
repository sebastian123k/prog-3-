package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
	
	JFrame window;
	AuthModel model;
	JPanel panel;
	
	
	public AuthView()
	{
		window = new JFrame();
		window.setLayout(null);
		window.setBounds(0,0,550,550);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(20,20,550,550);
		
		model = new AuthModel();
		
	}
	
	public void alta()
	{
		window.removeAll();
		
		 JLabel lblIngresar = new JLabel();
	        Font fontIngresar = new Font(Font.SANS_SERIF, Font.ITALIC, 15);
	        lblIngresar.setFont(fontIngresar);
	        lblIngresar.setBounds(120, 20, 300, 70);
	        lblIngresar.setText("login exitoso");
	        lblIngresar.setOpaque(true);
	        lblIngresar.setHorizontalAlignment(JLabel.CENTER);
	        lblIngresar.setBackground(Color.BLACK);
	        lblIngresar.setForeground(new Color(0, 255, 0));
	        panel.add(lblIngresar);
	       
	        
	     window.add(panel);
	     panel.repaint();
	     panel.revalidate();
	     window.repaint();
	     window.revalidate();
		
	}
	
	
	public void login() {
        JLabel lblIngresar = new JLabel();
        Font fontIngresar = new Font(Font.SANS_SERIF, Font.ITALIC, 15);
        lblIngresar.setFont(fontIngresar);
        lblIngresar.setBounds(120, 20, 300, 70);
        lblIngresar.setText("presiona crear cuenta para que funcione");
        lblIngresar.setOpaque(true);
        lblIngresar.setHorizontalAlignment(JLabel.CENTER);
        lblIngresar.setBackground(Color.BLACK);
        lblIngresar.setForeground(new Color(216, 199, 137));
        panel.add(lblIngresar);

        JLabel lblUsuario = new JLabel();
        Font fontUsuario = new Font(Font.SANS_SERIF, Font.ITALIC, 15);
        lblUsuario.setFont(fontUsuario);
        lblUsuario.setBounds(120, 120, 300, 25);
        lblUsuario.setText("Enter your Username");
        lblUsuario.setOpaque(true);
        lblUsuario.setBackground(Color.BLACK);
        lblUsuario.setForeground(Color.WHITE);
        panel.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 150, 300, 35);
        panel.add(txtUsuario);

        JLabel lblContrasena = new JLabel();
        Font fontContrasena = new Font(Font.SANS_SERIF, Font.ITALIC, 15);
        lblContrasena.setFont(fontContrasena);
        lblContrasena.setBounds(120, 220, 300, 25);
        lblContrasena.setText("Enter your Password");
        lblContrasena.setOpaque(true);
        lblContrasena.setBackground(Color.BLACK);
        lblContrasena.setForeground(Color.WHITE);
        panel.add(lblContrasena);

        JTextField pwUsuario = new JTextField();
        pwUsuario.setBounds(120, 250, 300, 35);
        pwUsuario.setText("");
        panel.add(pwUsuario);


        JButton btnEnviar2 = new JButton("crear cuenta");
        btnEnviar2.setBackground(Color.YELLOW);
        btnEnviar2.setBounds(320, 320, 200, 30);
        btnEnviar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(model.login(txtUsuario.getText(),pwUsuario.getText()))
            	{
            		lblContrasena.setForeground(new Color(0,255,0));
            		lblUsuario.setForeground(new Color(0,255,0));
            		lblIngresar.setText("bienenido");
            		lblIngresar.setForeground(new Color(0,255,0));
            	}
            	else 
            	{
            		lblContrasena.setForeground(new Color(255,0,0));
            		lblUsuario.setForeground(new Color(255,0,0));
            		lblIngresar.setText("Error de coneccion");
            		lblIngresar.setForeground(new Color(255,0,0));
            	}
            	
            }
        });
        panel.add(btnEnviar2);

        JButton btnEnviar3 = new JButton("recuperar cuenta");
        btnEnviar3.setBackground(Color.YELLOW);
        btnEnviar3.setBounds(20, 320, 150, 30);
        btnEnviar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
            }
        });
        panel.add(btnEnviar3);
        panel.setBackground(Color.BLUE);
        
        window.add(panel);
        window.setVisible(true);
    }
}
