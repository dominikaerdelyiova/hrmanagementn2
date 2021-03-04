package sk.kosickaakademia.company.database;

import sk.kosickaakademia.company.entity.User;
import sk.kosickaakademia.company.log.Log;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    Log log = new Log();
    private final String INSERTQUERY = "INSERT INTO USER (fname, lname, age, gender)" +
          "  VALUES (? , ? , ? , ?)";

    public Connection getConnection() throws IOException {
        Properties props = new Properties();
        InputStream InputStream = getClass().getClassLoader().getResourceAsStream("database.properties");
        props.load(InputStream);
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = (String) props.get("password");


        return null;
    }
    public void closeConnection (Connection con){

        if (con!=null){
            try{
                con.close();
                log.print("Connection closed!");
            }catch (SQLException e){
                log.error(e.toString());
            }

        }


    }
    public boolean insertNewUser(User user) throws SQLException, IOException {
        Connection con = getConnection();
        if (con != null) {
            try {
                PreparedStatement ps = con.prepareStatement(INSERTQUERY);
                ps.setString(1, user.getFname());
                ps.setString(2, user.getLname());
                ps.setInt(3, user.getAge());
                ps.setInt(4, user.getGender());
                int result = ps.executeUpdate();
                closeConnection(con);
                log.print("New user has been added to the DB");
                return result == 1;

            } catch (SQLException ex) {
                log.error(ex.toString());
            }
            log.info("Number of records: "+ count);
            return list;
        }
        return false;


    }
    public List<User> getAllUsers(){
        return null;
    }

    public User getUserById(int id){
        return null;
    }

    public boolean changeAge(int id, int newAge){
        return false;
    }

    public List<User> getUser(String pattern){
        "la" -> Milan, Ladislav, Milada
        return null;
    }
}
