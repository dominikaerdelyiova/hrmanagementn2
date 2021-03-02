package sk.kosickaakademia.company.database;

import sk.kosickaakademia.company.log.Log;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    Log log = new Log();
    public void getConnection() throws IOException {
        Properties props = new Properties();
        InputStream InputStream = getClass().getClassLoader().getResourceAsStream("database.properties");
        props.load(InputStream);
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = (String) props.get("password");


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
}
