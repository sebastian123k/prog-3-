import javax.swing.JFrame;

public class AuthControler {

	JFrame frame;
	AuthView view;
	
	public AuthControler(){
		
		view = new AuthView();
		
		frame = new JFrame();
		frame.setSize(600,650);
		frame.setVisible(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("frame");
		
	}
	
	public void login()
	{
		frame.add(view.login());
		frame.setVisible(true);
	}
	
}
