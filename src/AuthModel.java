import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AuthModel {

	public boolean login(String user,String pasword)
	{
		 String nombreUsuario;
		 String contrasenaUsuario;
		 JSONParser parser = new JSONParser();

	        try {
	            
	            Object obj = parser.parse(new FileReader("users.json"));
	           
	            JSONObject jsonObject = (JSONObject) obj;
   
	            JSONArray usuarios = (JSONArray) jsonObject.get("users");

	           
	            for(int i = 0;i<usuarios.size();i++)
	            {
	            	JSONObject usuario = (JSONObject) usuarios.get(i);
	            	nombreUsuario = (String) usuario.get("username");
	 	            contrasenaUsuario = (String) usuario.get("password");
	 	            
	 	            if(user.equals(nombreUsuario) && contrasenaUsuario.equals(contrasenaUsuario))
	 	            {
	 	            	return true;
	 	            }
	            }
	           

	         
	        } catch (Exception e) {
	           System.out.println("error");
	        }
	        
		
		
		return false;
	}
}
