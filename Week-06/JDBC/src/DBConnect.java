import java.io.IOError;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        Connection connect = null;
        String url = "jdbc:mysql://localhost/university?user=root&password=mysql";
        try{
            connect = DriverManager.getConnection(url);
        }catch (SQLException e){
            e.getMessage();
        }
    }
}
