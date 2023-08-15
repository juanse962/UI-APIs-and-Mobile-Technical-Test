package co.com.choucair.certification.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Random {

    public static  <T extends Actor> void clickRandom(T actor, int max, int min, Target LOCATOR) {

        int rnd = Integer.parseInt(randoms(max, min));
        for (int i = 0; i < rnd; i++) {
            actor.attemptsTo(
                    Click.on(LOCATOR)
            );
        }

    }
    public static String randoms(int max, int min) {
        String random = String.valueOf((int)Math.floor(Math.random()*max+min));
        return random;
    }
}