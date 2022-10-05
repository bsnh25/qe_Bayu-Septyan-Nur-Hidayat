package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.LoginPage;

public class CollectionStep {
        @Steps
        CartPage cartPage;

        @Given("^I am on the book page$")
        public void iAmOnTheBookPage(){
        cartPage.bookUrl();
        cartPage.scrollDown();
        }
        @When("^I click Git Pocket Guide$")
        public void iClickGitPocketGuide(){
        cartPage.clickGitPocketGuide();
        }

        @Then("^I will get information$")
        public void iWillGetPageMessage(){
        cartPage.displayInfo();
        }

        @When("^I click Learning JavaScript Design Patterns$")
        public void iClickLearningJavaScriptDesignPatterns() {
        cartPage.clickLjdp();
        }

        @When("^I click Designing Evolvable Web APIs with ASP.NET$")
        public void iClickDesigningEvolvableWebAPIsWithASPNET() {
        cartPage.clickDewawa();
        }


        @When("^I click Speaking JavaScript$")
        public void iClickSpeakingJavaScript() {
                cartPage.clickSJ();
        }

        @When("^I click You Don't Know JS$")
        public void iClickYouDonTKnowJS() {
                cartPage.clickYdkj();
        }

        @When("^I click Programming JavaScript Applications$")
        public void iClickProgrammingJavaScriptApplications() {
                cartPage.clickPjsa();
        }

        @When("^I click Eloquent JavaScript, Second Edition$")
        public void iClickEloquentJavaScriptSecondEdition() {
                cartPage.clickEjsse();
        }

        @When("^I click Understanding ECMAScript 6$")
        public void iClickUnderstandingECMAScript6() {
                cartPage.clickUe6();
        }
}
