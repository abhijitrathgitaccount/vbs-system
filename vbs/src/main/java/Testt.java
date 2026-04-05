import java.sql.*;

public class Testt {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC1";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM your_table_name")) {


            while (rs.next()) {

                String columnName = rs.getString("column_name");
                int columnInt = rs.getInt("another_column");
                System.out.println("Data: " + columnName + ", " + columnInt);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}