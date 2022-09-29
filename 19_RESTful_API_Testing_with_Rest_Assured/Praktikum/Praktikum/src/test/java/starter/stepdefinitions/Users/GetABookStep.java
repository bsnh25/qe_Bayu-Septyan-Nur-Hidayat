package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Users.GetABook;

public class GetABookStep {

    @Steps
    GetABook getABook;

    @Given("I set url and valid ISBN")
    public void iSetUrlAndValidISBN() {
        getABook.setUrlAndValidToken();
    }

    @When("I request get book")
    public void iRequestGetBook() {
        getABook.requestGetABook();
    }
    @Then("I will get 200")
    public void iWillGet200() {
        getABook.validateStatus200();
    }


    @Given("I set url and invalid ISBN")
    public void iSetUrlAndInvalidISBN() {
        getABook.setUrlAndInvalidToken();
    }

    @Then("I will get 400")
    public void iWillGet400 (){
        getABook.validateStatusCode();
    }

    @And("get not found message")
    public void getNotFoundMessage() {
        getABook.validateNotFoundMessage();
    }

    @And("get a infromation of the book")
    public void getAInfromationOfTheBook() {
        getABook.validateSuccessMessage();
    }
}