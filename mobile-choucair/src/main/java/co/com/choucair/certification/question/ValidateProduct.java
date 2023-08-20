package co.com.choucair.certification.question;

import co.com.choucair.certification.userinterface.ShoppingCartManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProduct implements Question {

    private String items;


    public static ValidateProduct isCorrect(){
        return new ValidateProduct();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return ShoppingCartManagement.ITEM_IN_CART.isVisibleFor(actor);
    }
}