//Bus Data Access objects

package BusResv;
import java.sql.*;

public class BusDAO {

	public void displayBusInfo() throws SQLException{
		String query ="Select * from bus";
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No: "+rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC: no ");
			else
				System.out.println("AC: yes ");
			System.out.println("Capacity: "+rs.getInt(3));
		}
		System.out.println("-----------------------------------");
		
	}
	
	public int getCapacity(int id) throws SQLException {
		String query = "SELECT capacity FROM bus WHERE id = " + id;
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		if (rs.next()) {
			return rs.getInt(1); 
		} else {
			throw new SQLException("Bus with ID " + id + " not found.");
		}
	}

}






