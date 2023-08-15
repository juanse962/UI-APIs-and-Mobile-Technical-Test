package co.com.choucair.certification.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.choucair.certification.userinterface.ShoppingCart.*;

public class Answer implements Question<Boolean> {
    private static final List<String> names = new ArrayList<String>();
    private static final List<String> ammount = new ArrayList<String>();

    public static Answer toThe() {
        return new Answer();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        ammount.add(Text.of(AMMOUNT_ONE).viewedBy(actor).asString());
        ammount.add(Text.of(AMMOUNT_TWO).viewedBy(actor).asString());
        ammount.add(Text.of(AMMOUNT_THREE).viewedBy(actor).asString());
        ammount.add(Text.of(AMMOUNT_FOUR).viewedBy(actor).asString());
        ammount.add(Text.of(AMMOUNT_FIVE).viewedBy(actor).asString());

        names.add(Text.of(PRODUCT_ONE_NAME_AFTER).viewedBy(actor).asString());
        names.add(Text.of(PRODUCT_TWO_NAME_AFTER).viewedBy(actor).asString());
        names.add(Text.of(PRODUCT_THREE_NAME_AFTER).viewedBy(actor).asString());
        names.add(Text.of(PRODUCT_FOUR_NAME_AFTER).viewedBy(actor).asString());
        names.add(Text.of(PRODUCT_FIVE_AFTER).viewedBy(actor).asString());

        String price = (Text.of(PRICE).viewedBy(actor).asString()).replace("$", "");

        return names.size() == 5 &&
                !price.isEmpty() &&
                !ammount.isEmpty();
    }
}