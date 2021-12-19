/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_simulator_system;

/**
 *
 * @author C9 Hyper
 */
import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project6", "root", "thedarkphoenix1171");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
