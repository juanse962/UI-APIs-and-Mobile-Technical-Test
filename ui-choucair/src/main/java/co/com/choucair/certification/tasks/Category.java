package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.CategoryManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverBy;

public class Category implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CategoryManagement.CATEGORY_MENU),
                HoverOverBy.over(CategoryManagement.BEED_ROOM),
                Click.on(CategoryManagement.HEADBOARD)
        );
    }

    public static Category inPage() {
        return Tasks.instrumented(Category.class);
    }
}