package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Users.PostAuth;

public class PostAuthStep {
    @Given("^I set url auth$")
    public void iSetUrlAuth(){
        PostAuth.setUrlAuth();
    }

    @And("^get true message$")
    public void getTrueMessage(){
        PostAuth.validationMessage200();
    }
    @Then("^I will get 404$")
    public void iWillGet404(){
        PostAuth.validateStatus404();
    }
    @And("^get message not found$")
    public void getMessageNotFound(){
        PostAuth.validationOfNotFound();
    }

    @When("I request post auth")
    public void iRequestPostAuth() {
        PostAuth.requestPostAuth();
    }
}
