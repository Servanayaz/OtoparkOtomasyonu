package nyym;

import java.sql.*;

public class Nyym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Connection conn = SingletonDb.getConnection();
		
		try
		{
			String query = "Select * From arac";
			Statement st = conn.createStatement();
			ResultSet rst = st.executeQuery(query);
			int i = 0;
			while(rst.next())
			{
                                i++;
                                
                                System.out.println(i +"- "+ rst.getString("plaka")+" "+ rst.getString("marka")+" "+ rst.getString("tipi"));
				//System.out.println(i +" "+ rst.toString());	
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try{
				conn.close();
			}catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
        Tarifee tarife = new Tarifee();
        yöneticiii yönetici = new yöneticiii("servan");
        
        tarife.ekle(yönetici);
        
        for(int i = tarife.getUcret(); i<=100;i++){
            tarife.setUcret(i);
            
        }
    }

}
