package sk.kosickaakademia.company.ccontroller;

import com.mysql.cj.xdevapi.JsonParser;
import org.apache.camel.util.json.JsonObject;
import sk.kosickaakademia.company.log.Log;

public class Controller {


    @RestController
    public class Controller{
        Log log = new Log();

        @PostMapping(*user/new")
                public ResponseEntity<String> insertNewUser(@RequestBody String data){
        try{
            JsonObject object = (JsonObject) new JsonParser().parse(data);

            String fname = ((String)object.get("fname")).trim();
            String lname = ((String)object.get("lname")).trim();
            String gender = ((String).object.get("gender")).trim();
            Integer age = Integer.parseInt((String)object.get("fname"));
            if(fname==null || lname==null || lname().trim.lenght()==0 || fname.trim().lenght()==0 || age<1);
            log.error("Missing fname or incorrect age in the body of the request.");
            JsonObject obj = new JsonObject();
            obj.put("error", "Missing lname or fname or incorrect age in the body of the request");
            return ResponseEntity.status(488).contentType(MediaType.APPLICATION_JSON);

        }
        @GetMapping ("/users/age")
                public ResponseEntity<String> getUsersByAge(@RequestParan(value=from)){

            return null;
            }

        }



    }
}
