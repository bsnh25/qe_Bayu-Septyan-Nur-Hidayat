package starter.Users;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostAuth {
    private static String url1;
    public static void setUrlAuth() {
        url1 = "https://demoqa.com/Account/v1/Authorized";
    }
    public static void validationMessage200(){
        then().body("true", equalTo(null));
    }

    public static void validateStatus404(){
        then().statusCode(404);
    }

    public static void validationOfNotFound(){
        then().body("message", equalTo("User not found!"));
    }
    public static void requestPostAuth(){
            given().header("accept", "application/json")
                    .header("Content-Type","application/json")
                    .body(bodyPostAuthInvalid().toJSONString());
            when().post(url1);
    }
    private static JSONObject bodyPostAuthInvalid(){
        JSONObject bodyAuthInvalid = new JSONObject();
        bodyAuthInvalid.put("userName", "bayuseptyan");
        bodyAuthInvalid.put("password", "Password1_");
        return bodyAuthInvalid;
    }

}
