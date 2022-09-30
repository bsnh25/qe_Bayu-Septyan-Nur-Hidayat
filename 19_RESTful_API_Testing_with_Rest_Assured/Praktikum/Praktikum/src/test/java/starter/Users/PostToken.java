package starter.Users;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostToken {
    private static String url, userName, password;
    public static void setUrl(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
    }
    public static void validUserNameAndPassword(){
        userName = "bayuseptyan";
        password = "Password1_#";
    }
    public static void requestPost(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .body(bodyPostToken().toJSONString());
        when().post(url);
    }
    public static void validationOfToken(){
        then().body("status", equalTo("Success"));
    }
    public static void validUserNameAndInvalidPassword(){
        userName = "bayuseptyan";
        password = "Password1_";
    }
    public static void requestPostToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .body(bodyPostTokenInvalid().toJSONString());
        when().post(url);

    }
    public static void validationOfFailed(){
        then().body("result", equalTo("User authorization failed."));
    }
    public static void invalidUserNameAndPassword(){
        userName = "0";
        password = "Password1_";
    }
    public static void requestPostThat(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .body(bodyPostTokenAllInvalid().toJSONString());
        when().post(url);
    }
    public static void validationOfAllFailed(){
        then().body("message", equalTo("UserName and Password required."));
    }
    private static JSONObject bodyPostToken(){
        JSONObject bodyValid = new JSONObject();
        bodyValid.put("userName", "bayuseptyan");
        bodyValid.put("password", "Password1_#");
        return bodyValid;
    }

    private static JSONObject bodyPostTokenInvalid(){
        JSONObject bodyInvalid = new JSONObject();
        bodyInvalid.put("userName", "bayuseptyan");
        bodyInvalid.put("password", "Password1_");
        return bodyInvalid;
    }
    private static JSONObject bodyPostTokenAllInvalid(){
        JSONObject bodyAllInvalid = new JSONObject();
        bodyAllInvalid.put("userName", 0);
        bodyAllInvalid.put("password", "Password1_");
        return bodyAllInvalid;
    }
//    public static void validateSuccess(){
//        {"token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImJheXVzZXB0eWFuIiwicGFzc3dvcmQiOiJQYXNzd29yZDFfIyIsImlhdCI6MTY2NDUxNTMxNH0.mzikmHUBrFfDTox1p7VDx1BNuCXbw-4sWCYSxS3laBE",
//                "expires":"2022-10-07T05:21:54.618Z",
//                "status":"Success",
//                "result":"User authorized successfully."}
//    }
}
