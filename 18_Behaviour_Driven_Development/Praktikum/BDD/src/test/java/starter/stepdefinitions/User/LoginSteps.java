package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("I go to login page");
    }

    @When("I click Login button")
    public void iClickLoginButton(){
        System.out.println("I click login button");
    }

    @Then("I will get error message data is required")
    public void iWillGetErrorMessageDataIsRequired() {
        System.out.println("I get error message");
    }

    @And("I can't login")
    public void iCanTLogin() {
        System.out.println("I can't login");
    }

    @When("I input valid password")
    public void iInputValidPassword() {
        System.out.println("Valid password");
    }

    @Then("I will get error message data email is required")
    public void iWillGetErrorMessageDataEmailIsRequired() {
        System.out.println("required");
    }
}
