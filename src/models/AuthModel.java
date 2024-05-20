package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthModel {
	
	public void AuthModel()
	{
		
	}
	
	public boolean login(String usuario,String contra)
	{
		
		boolean loginLogrado = false;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Usuarios","freedb_KevinAdmin","*heaPNr7BX7vaZr");  
			Statement stmt=con.createStatement();  
			ResultSet rs= stmt.executeQuery("SELECT * FROM usuarios");
			while(rs.next())  
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2));  
				if(usuario.equals(rs.getString(1)) && contra.equals(rs.getString(2)))
				{
					loginLogrado = true;
					System.out.println("login logrado");
				}
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);
			}  
		
		if(loginLogrado)
		{
			return true;
		}
		System.out.println("fallido");
		return false;
		}  
	
	}

