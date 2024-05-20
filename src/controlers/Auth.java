package controlers;
import views.AuthView;

public class Auth {
	
	AuthView vista;
	
	public Auth()
	{
		vista = new AuthView();
	}
	
	public void login()
	{
		vista.login();
	}
	
}
