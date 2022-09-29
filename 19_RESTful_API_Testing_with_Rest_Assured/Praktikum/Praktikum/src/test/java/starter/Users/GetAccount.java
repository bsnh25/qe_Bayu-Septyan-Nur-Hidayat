package starter.Users;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class GetAccount {
    private static String url = "https://demoqa.com/Account/v1/User/12345";
    public static void requestGetAccount(){
        given().header("accept", "application/json"); //kondisi yg harus disiapkan sebelum request, dan bisa pakai method chaining
        when().get(url); //method dan url apa yg akan kita request dan melakukan requestnya
    }
}
