package sk.kosickaakademia.company.util;

import sk.kosickaakademia.company.entity.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Util {
    public String getJ(List<User> list){

        return null;
    }
        public String getJson(User user){

        return null;
        }

        public String getCurrentDateTime(){

        return null;

            Date date = new Date();

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println(formatter.format(date));

        }

        public String normalize(String name){

        return name;


        }
}
