import java.sql.*;

public class database {
    static String url = "jdbc:postgresql://localhost:5432/login";
    static Connection conn = null;

    static void connect(){
        try {
            conn = DriverManager.getConnection(url, "postgres", "1234");
        } catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    static ResultSet list(String query){
        try{
            Statement st = conn.createStatement();
            return st.executeQuery(query);
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
