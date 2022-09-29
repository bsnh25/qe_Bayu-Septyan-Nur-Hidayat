package starter.Users;

import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class DeleteAccount {
    private static String url, userId;

    public static void setUrlAndInvalidUserId(){
        url = "https://demoqa.com/Account/v1/User/12345";
        userId = "12345"; //penamaan variabel token
    }

    public static void requestDelete(){
        given().header("accept", "application/json"); //kondisi yg harus disiapkan sebelum request, dan bisa pakai method chaining
        when().delete(url); //method dan url apa yg akan kita request dan melakukan requestnya
    }

    public static void validateStatusCode(){

        then().statusCode(401);
    }

    public static void validateStatus200(){
        then().statusCode(200);
    }

    public static void validateForbiddenMessage(){
        then().body(equalTo("{" +
                "\"code\":\"1200\"," +
                "\"message\":\"User not authorized!\"}"));
    }



}
