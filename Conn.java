import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        try {
            // 5 steps og jdbc connectivity
            // Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "urjita");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
