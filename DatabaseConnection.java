import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection
{
    Connection connection = null;
    
    public static Connection getDB()
    {
        String url = "jdbc:mysql://localhost:3306/addressbook?useSSL=false";
        String username = "root";
        String password = "sesame";
        
        try
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}