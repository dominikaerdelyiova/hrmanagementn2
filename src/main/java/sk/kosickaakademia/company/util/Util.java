package sk.kosickaakademia.company.util;

import org.apache.camel.util.json.JsonArray;
import org.apache.camel.util.json.JsonObject;
import sk.kosickaakademia.company.entity.User;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Util {
    public String getJson(List<User> list){
        if(list.isEmpty()==null) return "{}";

        JsonObject object = new JsonObject();
        object.put("datetime", getCurrentDateTime());
        object.put("size", 1);
        JsonArray jsonArray=new JsonArray();
        for(User u : list) {

        }
        JsonObject userJson= new JsonObject();
        userJson.put("id",user.getId());
        userJson.put("fname", user.getFname());
        userJson.put("lname", user.getLname());
        userJson.put("age", user.getAge());
        userJson.put("gender", user.getGender());
        jsonArray.add(userJson);
        object.put("users", jsonArray);


        return null;
    }
        public String getJson(User user){

        if(user==null) return "{}";
            JsonObject object = new JsonObject();
            object.put("datetime", getCurrentDateTime());
            object.put("size", 1);
            JsonArray jsonArray=new JsonArray();
            JsonObject userJson= new JsonObject();
            userJson.put("id",user.getId());
            userJson.put("fname", user.getFname());
            userJson.put("lname", user.getLname());
            userJson.put("age", user.getAge());
            userJson.put("gender", user.getGender());
            jsonArray.add(userJson);
            object.put("users", jsonArray);

            return object.toJson();

        }

        public Date getCurrentDateTime(){

        return null;

            Date date = new Date();

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println(formatter.format(date));

            return date;

        }

        public String normalize(String name){
        if (name==null) || name.equals("");
            return Character.toUpperCase(name.charAt(0)+name.substring(1).toLowerCase();

            }


    public String normalizeName(String fname) {
    }
}
}
