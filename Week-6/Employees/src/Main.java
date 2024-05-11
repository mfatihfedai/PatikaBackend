import java.sql.*;

public class Main {
    //Veritabanı bilgileri alınır.
    public static final String DB_URL = "jdbc:mysql://localhost/company";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //Veritabanı bilgileri ile java arasındaki bağlantı kurulur.
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
            //Veritabanındaki bilgilerin ekrana basılması sağlanır.
            while(resultSet.next()){
                System.out.println("ID : " + resultSet.getInt("employees_id"));
                System.out.println("Name : " + resultSet.getString("employees_name"));
                System.out.println("Position : " + resultSet.getString("employees_position"));
                System.out.println("Salary : " + resultSet.getInt("employees_salary"));
                System.out.println("###############");
            }
        } catch (SQLException e) {
            //Eğer hata oluşursa hata açıklanır.
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
}