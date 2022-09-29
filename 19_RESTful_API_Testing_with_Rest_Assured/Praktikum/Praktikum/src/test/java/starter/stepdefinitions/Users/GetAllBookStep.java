package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.Users.GetAllBook;

public class GetAllBookStep {

        @Given("I set url")
        public void iSetUrl() {
                GetAllBook.setUrl();
        }

        @When("I request get all of book")
        public void iRequestGetAllOfBook() {
                GetAllBook.requestGetAllOfBook();
        }

        @And("get all of the infromation of the book")
        public void getAllOfTheInfromationOfTheBook() {
                GetAllBook.validateAllOfTheInfromationOfTheBook();
        }
}
