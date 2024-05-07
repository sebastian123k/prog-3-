import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame {
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panelTrasero = new JPanel();
	JPanel panelTrasero2 = new JPanel();
	JPanel panelTrasero3 = new JPanel();
	
	JPanel panelAltas = new JPanel();
	JPanel panelBajas = new JPanel();
	JPanel panelConsu = new JPanel();
	
	JPanel panelAyuda = new JPanel();
	
	JFrame este;
	
	
	
	public Ventana()
	{	
		este = this;
		this.setSize(600,650);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("User login");
		
		
		
		this.setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
		
		
		this.agregarElementos();
		this.agregarRegistro();
		this.admin();	
		this.agregarMenu();
		
		this.setVisible(true);
		panel.revalidate();
		panel2.revalidate();
		
		
	}
	
	public void agregarMenu()
	{
		JMenuBar menuMain = new JMenuBar();
		this.setJMenuBar(menuMain);
		
		JMenu login = new JMenu("login");
		
		
		JMenuItem iniciar = new JMenuItem("iniciar secion");
		iniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll();
			
				este.repaint();
				este.revalidate();
				
				este.add(panel);
				este.add(panelTrasero);
				este.repaint();
				este.revalidate();
				
			}});
		
		login.add(iniciar);
		
		
		JMenuItem crear = new JMenuItem("crear cuenta");
		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll();
			
				este.repaint();
				este.revalidate();
				
				este.add(panel2);
				este.add(panelTrasero2);
				este.repaint();
				este.revalidate();
				
			}});
		login.add(crear);
		
		JMenuItem recuperar = new JMenuItem("recuperar cuenta");
		recuperar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll();
			
				este.repaint();
				este.revalidate();
				
				este.add(panel3);
				este.add(panelTrasero3);
				este.repaint();
				este.revalidate();
				
			}});
		
		login.add(recuperar);
		
	
		menuMain.add(login);
		
		
		JMenu usuarios = new JMenu("Users");
		
	
		JMenuItem bajas = new JMenuItem("Bajas");
		bajas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll(); 
				addBajas();
				este.add(panelBajas);
				
				este.repaint();
				este.revalidate();
				
			}});
		
		usuarios.add(bajas);
		
		
		JMenuItem altas = new JMenuItem("altas");
		altas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll(); 
				este.repaint();
				este.revalidate();
				addAltas();
				este.add(panelAltas);
				
				este.repaint();
				este.revalidate();
				
			}});
		
		usuarios.add(altas);
		
		JMenuItem consu = new JMenuItem("consultas");
		consu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll(); 
				este.repaint();
				este.revalidate();
				addConsultas();
				este.add(panelConsu);
				
				este.repaint();
				este.revalidate();
				
			}});
		
		usuarios.add(consu);
		
		menuMain.add(usuarios);
		
		////////////////////////////
		JMenu ayuda = new JMenu("ayuda");
		
		
		JMenuItem recu = new JMenuItem("como recupero mi cuentas");
		recu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll(); 
				panelAyuda.removeAll();
				comoRecuperarContrasena();
				este.add(panelAyuda);
				
				este.repaint();
				este.revalidate();
				
			}});
		
		ayuda.add(recu);
		
		
		JMenuItem acceder = new JMenuItem("Como acceder al sistema");
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll(); 
				este.repaint();
				este.revalidate();
				panelAyuda.removeAll();
				
				comoAcceder();
				
				este.add(panelAyuda);
				
				este.repaint();
				este.revalidate();
				
			}});
		
		ayuda.add(acceder);
		
		JMenuItem crear2 = new JMenuItem("como crerar cuenta");
		crear2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				este.getContentPane().removeAll(); 
				este.repaint();
				este.revalidate();
				panelAyuda.removeAll();
				comoCrearCuenta();
				este.add(panelAyuda);
				
				este.repaint();
				este.revalidate();
				
			}});
		ayuda.add(crear2);
		
		
		
		
		menuMain.add(ayuda);
		
		
	}
	
	public void addAltas()
	{
		panelAltas.setBounds(0,0,600,650);
		panelAltas.setLayout(null);
		panelAltas.setBackground(new Color(39,63,100));
		

		JLabel lblAltas = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblAltas.setFont(fontUsuario);
		lblAltas.setBounds(120,120,300,25);
		lblAltas.setText("Altas");
		lblAltas.setOpaque(true);
		lblAltas.setBackground(new Color(0,0,0,1));
		lblAltas.setForeground(new Color(255,255,255));
		panelAltas.add(lblAltas);
		
	}
	
	public void addBajas()
	{
		panelBajas.setBounds(0,0,600,650);
		panelBajas.setLayout(null);
		panelBajas.setBackground(new Color(39,63,100));
		

		JLabel lblBajas = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblBajas.setFont(fontUsuario);
		lblBajas.setBounds(120,120,300,25);
		lblBajas.setText("Bajas");
		lblBajas.setOpaque(true);
		lblBajas.setBackground(new Color(0,0,0,1));
		lblBajas.setForeground(new Color(255,255,255));
		panelBajas.add(lblBajas);
	}
	
	public void addConsultas()
	{
		panelConsu.setBounds(0,0,600,650);
		panelConsu.setLayout(null);
		panelConsu.setBackground(new Color(39,63,100));
		

		JLabel lblConsu = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblConsu.setFont(fontUsuario);
		lblConsu.setBounds(120,120,300,25);
		lblConsu.setText("Consulktas");
		lblConsu.setOpaque(true);
		lblConsu.setBackground(new Color(0,0,0,1));
		lblConsu.setForeground(new Color(255,255,255));
		panelConsu.add(lblConsu);
	}
	
	public void addPreguntasFrecuentes()
	{
		comoCrearCuenta();
		comoAcceder();
		comoRecuperarContrasena();
	}
	
	public void comoCrearCuenta()
	{
		panelAyuda.setBounds(0,0,600,650);
		panelAyuda.setLayout(null);
		panelAyuda.setBackground(new Color(39,63,100));
		
		JLabel lblBajas = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblBajas.setFont(fontUsuario);
		lblBajas.setBounds(120,120,300,25);
		lblBajas.setText("Como crear cuenta");
		lblBajas.setOpaque(true);
		lblBajas.setBackground(new Color(0,0,0,1));
		lblBajas.setForeground(new Color(255,255,255));
		panelAyuda.add(lblBajas);
	}
	
	public void comoAcceder()
	{
		panelAyuda.setBounds(0,0,600,650);
		panelAyuda.setLayout(null);
		panelAyuda.setBackground(new Color(39,63,100));
		
		JLabel lblBajas = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblBajas.setFont(fontUsuario);
		lblBajas.setBounds(120,120,300,25);
		lblBajas.setText("Como Aceeder");
		lblBajas.setOpaque(true);
		lblBajas.setBackground(new Color(0,0,0,1));
		lblBajas.setForeground(new Color(255,255,255));
		panelAyuda.add(lblBajas);
	}
	
	public void comoRecuperarContrasena()
	{
		panelAyuda.setBounds(0,0,600,650);
		panelAyuda.setLayout(null);
		panelAyuda.setBackground(new Color(39,63,100));
		
		JLabel lblBajas = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblBajas.setFont(fontUsuario);
		lblBajas.setBounds(120,120,300,25);
		lblBajas.setText("Como Recuperar Contrasena");
		lblBajas.setOpaque(true);
		lblBajas.setBackground(new Color(0,0,0,1));
		lblBajas.setForeground(new Color(255,255,255));
		panelAyuda.add(lblBajas);
	}
	
	
	
	
	
	public void agregarElementos()
	{
		
		
		panelTrasero.setBounds(0,0,600,650);
		panelTrasero.setLayout(null);
		panelTrasero.setBackground(new Color(39,63,100));
		
		
		
	
		
		
		
		panel.setBounds(20,100,550,400);
		panel.setLayout(null);
		panel.setBackground(new Color(39,63,120));
		

		
		
		JLabel lblIngresar = new JLabel();
		Font fontIngresar = new Font(Font.SANS_SERIF,Font.ITALIC,50);
		lblIngresar.setFont(fontIngresar);
		lblIngresar.setBounds(120,20,300,70);
		lblIngresar.setText("Iniciar secion");
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
		pwUsuario.setText("  PASWORD");
		pwUsuario.setForeground(new Color(100,100,100,100));
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
				
				este.remove(panel);
				este.remove(panelTrasero);
				este.repaint();
				este.revalidate();
				
				este.add(panel2);
				este.add(panelTrasero2);
				este.repaint();
				este.revalidate();
				
				
				
			}});
		
		panel.add(btnEnviar2);
		
		JButton btnEnviar3 = new JButton("recuperar cuenta");
		btnEnviar3.setBackground(Color.yellow);
		btnEnviar3.setBounds(20,320,150,30);
		btnEnviar3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				este.remove(panel);
				este.remove(panelTrasero);
				este.repaint();
				este.revalidate();
				
				este.add(panel3);
				este.add(panelTrasero3);
				este.repaint();
				este.revalidate();
				
				
				
			}});
		
		panel.add(btnEnviar3);
		
		
	
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo.setBounds(0,-20,770,650);
		panelTrasero.add(fondo);
		
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo2.setBounds(1,-100,548,648);
		panel.add(fondo2);
		

	
		
		
		this.add(panel);
		this.add(panelTrasero);
		
	}
	

	
	public void admin(){
		
		panelTrasero3.setBounds(0,0,600,650);
		panelTrasero3.setLayout(null);
		panelTrasero3.setBackground(new Color(39,63,100));
		
		
		
	
		
		
		
		panel3.setBounds(20,100,550,400);
		panel3.setLayout(null);
		panel3.setBackground(new Color(39,63,120));
		

		
		
		JLabel lblIngresar = new JLabel();
		Font fontIngresar = new Font(Font.SANS_SERIF,Font.ITALIC,50);
		lblIngresar.setFont(fontIngresar);
		lblIngresar.setBounds(120,20,300,70);
		lblIngresar.setText("Recuperar cuenta");
		lblIngresar.setOpaque(true);
		lblIngresar.setHorizontalAlignment(0);
		lblIngresar.setBackground(new Color(0,0,0,1));
		lblIngresar.setForeground(new Color(216,199,137));
		panel3.add(lblIngresar);
		
		
		
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(getClass().getResource("icono.png")));
		lblImagen.setBounds(92,150,32,32);
		panel3.add(lblImagen);
		
		JLabel lblImagen2 = new JLabel();
		lblImagen2.setIcon(new ImageIcon(getClass().getResource("icono2.png")));
		lblImagen2.setBounds(92,250,32,32);
		panel3.add(lblImagen2);

		
		JLabel lblUsuario = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblUsuario.setFont(fontUsuario);
		lblUsuario.setBounds(120,120,300,25);
		lblUsuario.setText("Ingresa tu correo");
		lblUsuario.setOpaque(true);
		lblUsuario.setBackground(new Color(0,0,0,1));
		lblUsuario.setForeground(new Color(255,255,255));
		panel3.add(lblUsuario);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(120,150,300,35);
		panel3.add(txtUsuario);
		
		JLabel lblContrasena = new JLabel();
		Font fontContrasena = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblContrasena.setFont(fontContrasena);
		lblContrasena.setBounds(120,220,300,25);
		lblContrasena.setText("ingresa el codigo de confirmacion");
		lblContrasena.setOpaque(true);
		lblContrasena.setBackground(new Color(0,0,0,1));
		lblContrasena.setForeground(new Color(255,255,255));
		panel3.add(lblContrasena);
		
		JTextField pwUsuario = new JTextField();
		pwUsuario.setBounds(120,250,300,35);
		pwUsuario.setText("  PASWORD");
		pwUsuario.setForeground(new Color(100,100,100,100));
		panel3.add(pwUsuario);
		
		JButton btnEnviar = new JButton();
		btnEnviar.setBackground(Color.blue);
		btnEnviar.setBounds(200,320,100,30);
		btnEnviar.setIcon(new ImageIcon(getClass().getResource("botonsito.png")));
		panel3.add(btnEnviar);
	
		JButton btnEnviar2 = new JButton("ya recupere mi cuenta");
		btnEnviar2.setBackground(Color.yellow);
		btnEnviar2.setBounds(320,320,200,30);
		btnEnviar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				este.remove(panel3);
				este.remove(panelTrasero3);
				este.repaint();
				este.revalidate();
				
				este.add(panel);
				este.add(panelTrasero);
				este.repaint();
				este.revalidate();
				
				
				
			}});
		
		panel3.add(btnEnviar2);
		

		
		
	
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo.setBounds(0,-20,770,650);
		panelTrasero3.add(fondo);
		
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo2.setBounds(1,-100,548,648);
		panel3.add(fondo2);
		
		

	
		
		
		
		
		
	}
	
	
	public void agregarRegistro()
	{
		panelTrasero2.setBounds(0,0,600,650);
		panelTrasero2.setLayout(null);
		panelTrasero2.setBackground(new Color(39,63,100));
		
		
		panel2.setBounds(20,50,550,580);
		panel2.setLayout(null);
		panel2.setBackground(new Color(39,63,120));
		
		
		JLabel lblIngresar = new JLabel();
		Font fontIngresar = new Font(Font.SANS_SERIF,Font.ITALIC,50);
		lblIngresar.setFont(fontIngresar);
		lblIngresar.setBounds(120,20,300,70);
		lblIngresar.setText("Registrarse");
		lblIngresar.setOpaque(true);
		lblIngresar.setHorizontalAlignment(0);
		lblIngresar.setBackground(new Color(0,0,0,1));
		lblIngresar.setForeground(new Color(216,199,137));
		panel2.add(lblIngresar);
		
		
		
		
		/*JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(getClass().getResource("icono.png")));
		lblImagen.setBounds(92,150,32,32);
		panel2.add(lblImagen);
		
		JLabel lblImagen2 = new JLabel();
		lblImagen2.setIcon(new ImageIcon(getClass().getResource("icono2.png")));
		lblImagen2.setBounds(92,250,32,32);
		panel2.add(lblImagen2);*/

		
		JLabel lblUsuario = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblUsuario.setFont(fontUsuario);
		lblUsuario.setBounds(50,120,300,25);
		lblUsuario.setText("Ingresa tu nombre");
		lblUsuario.setOpaque(true);
		lblUsuario.setBackground(new Color(0,0,0,1));
		lblUsuario.setForeground(new Color(255,255,255));
		panel2.add(lblUsuario);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(50,150,200,35);
		panel2.add(txtUsuario);
		
		JLabel lblUsuario2 = new JLabel();
		Font fontUsuario2 = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblUsuario2.setFont(fontUsuario);
		lblUsuario2.setBounds(300,120,300,25);
		lblUsuario2.setText("Ingresa tu Apellido");
		lblUsuario2.setOpaque(true);
		lblUsuario2.setBackground(new Color(0,0,0,1));
		lblUsuario2.setForeground(new Color(255,255,255));
		panel2.add(lblUsuario2);
		
		JTextField txtUsuario2 = new JTextField();
		txtUsuario2.setBounds(300,150,200,35);
		panel2.add(txtUsuario2);
		
		JLabel lblCorreo = new JLabel();
		Font fontCorreo = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblCorreo.setFont(fontCorreo);
		lblCorreo.setBounds(120,200,300,25);
		lblCorreo.setText("Ingresa tu correo");
		lblCorreo.setOpaque(true);
		lblCorreo.setBackground(new Color(0,0,0,1));
		lblCorreo.setForeground(new Color(255,255,255));
		panel2.add(lblCorreo);
		
		JTextField pwCorreo = new JTextField();
		pwCorreo.setBounds(120,230,300,35);
		pwCorreo.setText("                                                           @UabcsMail.com");
		pwCorreo.setForeground(new Color(100,100,100,100));
		panel2.add(pwCorreo);
		
		JLabel lblContrasena = new JLabel();
		Font fontContrasena = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblContrasena.setFont(fontContrasena);
		lblContrasena.setBounds(120,270,300,25);
		lblContrasena.setText("Ingresa tu contrasena");
		lblContrasena.setOpaque(true);
		lblContrasena.setBackground(new Color(0,0,0,1));
		lblContrasena.setForeground(new Color(255,255,255));
		panel2.add(lblContrasena);
		
		JTextField pwUsuario = new JTextField();
		pwUsuario.setBounds(120,300,300,35);
		pwUsuario.setText("  Contrasena");
		pwUsuario.setForeground(new Color(100,100,100,100));
		panel2.add(pwUsuario);
		
		JLabel lblContrasena2 = new JLabel();
		lblContrasena2.setFont(fontContrasena);
		lblContrasena2.setBounds(120,340,300,25);
		lblContrasena2.setText("Confirme la contrasena");
		lblContrasena2.setOpaque(true);
		lblContrasena2.setBackground(new Color(0,0,0,1));
		lblContrasena2.setForeground(new Color(255,255,255));
		panel2.add(lblContrasena2);
		
		JTextField pwUsuario2 = new JTextField();
		pwUsuario2.setBounds(120,370,300,35);
		pwUsuario2.setText("  Contrasena");
		pwUsuario2.setForeground(new Color(100,100,100,100));
		panel2.add(pwUsuario2);
	
		

		
		JButton btnEnviar = new JButton();
		btnEnviar.setBounds(200,480,50,20);
		btnEnviar.setBackground(new Color(0,0,0,1));
		btnEnviar.setOpaque(true);
		btnEnviar.setIcon(new ImageIcon(getClass().getResource("boton2.png")));
		panel2.add(btnEnviar);
		
		JButton btnEnviar2 = new JButton("Login");
		btnEnviar2.setBackground(Color.yellow);
		btnEnviar2.setBounds(320,480,200,30);
		btnEnviar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				este.remove(panel2);
				este.remove(panelTrasero2);
				este.repaint();
				este.revalidate();
				
				este.add(panel);
				este.add(panelTrasero);
				este.repaint();
				este.revalidate();
				
				
				
			}});
		
		panel2.add(btnEnviar2);
		
		
		
		
		JCheckBox chkDiablo = new JCheckBox();
		chkDiablo.setBounds(120,430,300,15);
		chkDiablo.setOpaque(true);
		chkDiablo.setBackground(Color.BLUE);
		chkDiablo.setText("  marca si quiere vender tu alma al diablo ");
		chkDiablo.setForeground(new Color(100,100,100));
		panel2.add(chkDiablo);
		

		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo.setBounds(0,-20,770,650);
		panelTrasero2.add(fondo);
		
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo2.setBounds(1,-100,548,648);
		panel2.add(fondo2);
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	

}
















