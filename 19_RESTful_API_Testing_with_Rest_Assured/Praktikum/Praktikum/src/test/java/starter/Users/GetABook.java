package starter.Users;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetABook {

    private String url, ISBN;

    public void setUrlAndInvalidToken(){
        url = "https://demoqa.com/BookStore/v1/Book?ISBN=11";
        ISBN = "11";
    }

    public void setUrlAndValidToken(){
        url = "https://demoqa.com/BookStore/v1/Book?ISBN=9781449325862";
        ISBN = "9781449325862";
    }

    public void requestGetABook(){
        given().header("accept", "application/json");
        when().get(url);
    }

    public void validateStatusCode(){
        then().statusCode(400);
    }

    public void validateStatus200(){
        then().statusCode(200);
    }


    public void validateNotFoundMessage(){
        then().body(equalTo("{" +
                "\"code\":\"1205\"," +
                "\"message\":\"ISBN supplied is not available in Books Collection!\"}"));
    }

    public void validateSuccessMessage(){
        then().body(equalTo("{" +
                "\"isbn\":\"9781449325862\"," +
                "\"title\":\"Git Pocket Guide\"," +
                "\"subTitle\":\"A Working Introduction\"," +
                "\"author\":\"Richard E. Silverman\"," +
                "\"publish_date\":\"2020-06-04T08:48:39.000Z\"," +
                "\"publisher\":\"O'Reilly Media\"," +
                "\"pages\":234," +
                "\"description\":\"This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp\"," +
                "\"website\":\"http://chimera.labs.oreilly.com/books/1230000000561/index.html\"}"));
    }

}