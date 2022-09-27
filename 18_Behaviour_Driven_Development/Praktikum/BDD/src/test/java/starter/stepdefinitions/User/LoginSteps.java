package starter.stepdefinitions.User;

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

    @Then("^I go to home page$")
    public void iGoToHomePage() {
        System.out.println("I go to home page");
    }

    @When("^I input valid email or phone$")
    public void iInputValidEmailOrPhone() {
        System.out.println("I input valid email or phone");
    }

    @When("^I input invalid email or phone$")
    public void iInputInvalidEmailOrPhone() {
        System.out.println("I input invalid email or phone");
    }

    @And("^I input invalid password$")
    public void iInputInvalidPassword() {
        System.out.println("I input invalid password");
    }

    @When("I click my network")
    public void iClickMyNetwork() {
        System.out.println("I click my network");
    }

    @And("I click connect to persons")
    public void iClickConnectToPersons() {
        System.out.println("I click connect to persons");
    }

    @Then("I get result waiting")
    public void iGetResultWaiting() {
        System.out.println("I get result waiting");
    }

    @When("^I click search menu$")
    public void iClickSearchMenu() {
        System.out.println("I click search menu");
    }

    @And("^I write specific jobs$")
    public void iWriteSpecificJobs() {
        System.out.println("I write specific jobs");
    }

    @Then("^I get result by the spesific jobs$")
    public void iGetResultByTheSpesificJobs() {
        System.out.println("I get result by the spesific jobs");
    }

    @And("^I write specific persons$")
    public void iWriteSpecificPersons() {
        System.out.println("I write specific persons");
    }

    @Then("^I get result by the spesific persons$")
    public void iGetResultByTheSpesificPersons() {
        System.out.println("I get result by the spesific persons");
    }
}
