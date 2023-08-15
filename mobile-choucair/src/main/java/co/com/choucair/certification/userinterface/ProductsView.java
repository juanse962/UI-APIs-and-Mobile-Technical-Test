package co.com.choucair.certification.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsView {
    public static Target SEARCH_BAR = Target.the("Search bar")
            .located(AppiumBy.id("com.exito.appcompania:id/appCompatEditText_search_bar"));
    public static Target HOME_DELIVERY = Target.the("Home delivery option")
            .located(AppiumBy.id("com.exito.appcompania:id/appCompatTextView_item_title"));
    public static Target DEPARTMENT = Target.the("Colombia department list")
            .located(AppiumBy.id("com.exito.appcompania:id/filled_exposed_dropdown_department"));
    public static Target SELECT_DEPARTMENT = Target.the("Select department")
            .located(AppiumBy.id("com.exito.appcompania:id/appCompatTextView_title"));
    public static Target CITIES = Target.the("Colombia cities list")
            .located(AppiumBy.id("com.exito.appcompania:id/filled_exposed_dropdown_city"));
    public static Target SELECT_CITY = Target.the("Select city")
            .located(AppiumBy.className("android.widget.EditText"));
    public static Target ADDREES_INPUT = Target.the("Typing address")
            .located(AppiumBy.className("android.widget.EditText"));
    public static Target ADD = Target.the("Add information")
            .located(AppiumBy.id("com.exito.appcompania:id/appCompatButton_add_address"));
    public static Target SELECT_ITEM = Target.the("Select item")
            .located(AppiumBy.id("com.exito.appcompania:id/CardView_option"));
    public static Target ADD_TO_CART = Target.the("Add to shopping cart")
            .located(AppiumBy.xpath("(//android.widget.ImageView[@index='1'])[1]"));
    public static Target SHOPPING_CART = Target.the("Shopping cart section")
            .located(AppiumBy.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));
    public static Target EMAIL_INPUT = Target.the("Email input")
            .located(AppiumBy.xpath("(//android.widget.EditText[@index='0'])[2]"));

}
