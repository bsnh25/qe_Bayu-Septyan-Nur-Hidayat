package starter.stepdefinitions.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Users.DeleteAccount;

public class DeleteAccountStep {
    @Given("^I set url and invalid user id$")
        public void iSetUrlAndInvalidUserId() {
            DeleteAccount.setUrlAndInvalidUserId();
        }
        @When("^I request delete$")
        public void iRequestDelete() {
            DeleteAccount.requestDelete();
        }

        @And("^get Error Unauthorized message$")
        public void getErrorUnauthorizedMessage() {
            DeleteAccount.validateForbiddenMessage();
        }

    @Then("I will get 401")
    public void iWillGet401() {
        DeleteAccount.validateStatusCode();
    }
}
