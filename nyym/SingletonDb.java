/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;
import java.sql.*;

class SingletonDb
{
	private static Connection conn;
	
	private SingletonDb(){}
	
	public static Connection getConnection()
	{
		try
		{
			if(conn==null)
			{
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nyym",
				"postgres", "12345");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}