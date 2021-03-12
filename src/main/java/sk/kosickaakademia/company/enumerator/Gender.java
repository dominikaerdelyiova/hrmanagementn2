package sk.kosickaakademia.company.enumerator;

import sk.kosickaakademia.company.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public enum Gender {
    MALE(0), FEMALE(1), OTHER(2);
    private int value;

    Gender(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public List<User> getFemales() {
        String sql = "SELECT * FROM user WHERE gender = 1";
        try {
            PreparedStatement = getConnection().prepareStatement(sql);
            return executeSelect(ps);
        } catch (Exception ex) {
            log.error(ex.toString());
        }
        return null;
    }

    private Connection getConnection() {
    }

    public List<User> getMales()

    String sql = "SELECT * FROM user WHERE gender = 0";

    public List<User> getUsersByAge(int from, int to) {
        return null;
    }

    private List<User> executeSelect(PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        List<User> list = new ArrayList<>();
        while (rs.next()) ;
        String fname = rs.getString("fname");
        String lname = rs.getString("lname");
        int age = rs.getInt("age");
        int id = rs.getInt("id");
        int gender = rs.getInt("gender");
        User U = new User


    }

    Gender g;
    if(gender==null)
    g=Gender.OTHER;
}else if(gender.equalsIgnoreCase(anotherString:"male")){
    g=Gender.MALE;
}else if(gender.equalsIgnoreCase(anotherString:"female")){
        g=Gender.FEMALE;
}else
    g=Gender.OTHER;

     User user = New User(fname,lname,age,g.getValue());
     new Database().insertNewUser(user);

        } catch(Exception e){
    log.error(msg: "Cannot process input data in user/new controller");
    JSONObject obj = new JSONObject();
    obj.put("error","Cannot process input data in user/new controller");
    return ResponseEntity.status(400).contentType


    }
}
