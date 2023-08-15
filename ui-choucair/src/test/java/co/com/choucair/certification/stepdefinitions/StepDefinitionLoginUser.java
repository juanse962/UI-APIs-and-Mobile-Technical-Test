package co.com.choucair.certification.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.question.Answer;
import co.com.choucair.certification.tasks.Category;
import co.com.choucair.certification.tasks.OpenTask;
import co.com.choucair.certification.tasks.Products;


public class StepDefinitionLoginUser {
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user wishes to buy product")
    public void theUserWishesToBuyProduct() {
        OnStage.theActor("User").wasAbleTo(OpenTask.theHomePage());
    }

    @When("the user enters yours credentials (.*)$")
    public void theUserEntersYoursCredentials(String email) {
        OnStage.theActorInTheSpotlight().attemptsTo(Category.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(Products.inPage(email));
    }

    @Then("he must display your buy in the shopping car")
    public void heMustDisplayYourBuyInTheShoppingCar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
