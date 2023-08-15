package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.CategoryManagement;
import co.com.choucair.certification.userinterface.ShoppingCart;
import co.com.choucair.certification.utils.GenerateProducts;
import co.com.choucair.certification.utils.Random;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Products implements Task {

    private static String email;

    @Override
    public <T extends Actor> void performAs(T actor) {
        GenerateProducts.setProduct();
        product(actor);
        product(actor);
        product(actor);
        product(actor);
        product(actor);
        actor.attemptsTo(
                Click.on(ShoppingCart.CAR),
                Enter.keyValues(email).into(ShoppingCart.EMAIL),
                Click.on(ShoppingCart.BUTTON)
        );
    }

    public static Products inPage(String email) {
        return Tasks.instrumented(Products.class, email);
    }

    public Products(String email) {
        this.email = email;
    }

    public <T extends Actor> void product(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CategoryManagement.PRODUCT_ONE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(GenerateProducts.getProduct()),
                WaitUntil.the(CategoryManagement.ADD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CategoryManagement.ADD)
        );
        Random.clickRandom(actor, 9, 1, CategoryManagement.NUMBER_OF_PRODCUTS);
        actor.attemptsTo(
                Click.on(CategoryManagement.CLOSE)
        );
    }
}