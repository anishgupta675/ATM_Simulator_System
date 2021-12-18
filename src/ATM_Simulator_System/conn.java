package ATM_Simulator_System;

import java.sql.*;

public class conn {
	Connection c;
	Statement s;
	public conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///project6","root","thedarkphoenix1171");
			s = c.createStatement();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
