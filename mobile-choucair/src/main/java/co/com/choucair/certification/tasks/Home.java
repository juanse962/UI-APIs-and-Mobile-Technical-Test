package co.com.choucair.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.userinterface.HomeView.*;


public class Home implements Task {

    public static Performable loginWithAccount() {
        return new Home();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CLOSE_ADVERTISING),
                Click.on(LOG_IN_LATER_BUTTON),
                Click.on(PERMISION_BUTTON)
        );
    }
}