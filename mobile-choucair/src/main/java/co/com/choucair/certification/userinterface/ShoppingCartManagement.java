package co.com.choucair.certification.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartManagement {
    public static Target ITEM_IN_CART = Target.the("look the item in the shopping cart")
            .located(AppiumBy.xpath("(//android.widget.TextView[@index='3'])[2]"));
}