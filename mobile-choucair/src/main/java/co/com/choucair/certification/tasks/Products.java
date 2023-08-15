package co.com.choucair.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.choucair.certification.userinterface.ProductsView.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Products implements Task {
    private static Map<String, String> dataTable;

    public Products(Map<String, String> dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable form(Map<String, String> dataTable) {
        return new Products(dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(dataTable.get("Product")).into(SEARCH_BAR),
                Click.on(SEARCH_BAR),
                Click.on(HOME_DELIVERY),
                Click.on(DEPARTMENT),
                Click.on(SELECT_DEPARTMENT),
                Click.on(CITIES),
                Click.on(SELECT_CITY),
                Enter.keyValues(dataTable.get("Address")).into(ADDREES_INPUT),
                Click.on(ADD),
                Click.on(SELECT_ITEM),
                Click.on(ADD_TO_CART),
                Click.on(SHOPPING_CART),
                WaitUntil.the(EMAIL_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues(dataTable.get("Email")).into(EMAIL_INPUT)
        );
    }
}
