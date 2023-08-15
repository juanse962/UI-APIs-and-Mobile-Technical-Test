package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;


public class ShoppingCart {
    public static final Target CAR = Target.the("Select shopping cart")
            .locatedBy("//a[@class='exito-header-3-x-minicartLink']");
    public static final Target EMAIL = Target.the("typing email")
            .locatedBy("//input[@type='email']");
    public static final Target PRODUCT_ONE_NAME_AFTER = Target.the("looking product 1")
            .locatedBy("(//span[@data-molecule-product-detail-name-span='true'])[1]");
    public static final Target PRODUCT_TWO_NAME_AFTER = Target.the("looking product 2")
            .locatedBy("(//span[@data-molecule-product-detail-name-span='true'])[2]");
    public static final Target PRODUCT_THREE_NAME_AFTER = Target.the("looking product 3")
            .locatedBy("(//span[@data-molecule-product-detail-name-span='true'])[3]");
    public static final Target PRODUCT_FOUR_NAME_AFTER = Target.the("looking product 4")
            .locatedBy("(//span[@data-molecule-product-detail-name-span='true'])[4]");
    public static final Target PRODUCT_FIVE_AFTER = Target.the("looking product 5")
            .locatedBy("(//span[@data-molecule-product-detail-name-span='true'])[5]");
    public static final Target PRICE = Target.the("verify price")
            .locatedBy("(//span[@data-molecule-summary-item-value='true'])[2]");
    public static final Target BUTTON = Target.the("Confirm email")
            .locatedBy(".exito-checkout-io-0-x-preLoginActiveButton");
    public static final Target AMMOUNT_ONE = Target.the("looking ammount 1")
            .locatedBy("(//span[@data-molecule-quantity-und-value='true'])[1]");
    public static final Target AMMOUNT_TWO = Target.the("looking ammount 2")
            .locatedBy("(//span[@data-molecule-quantity-und-value='true'])[2]");
    public static final Target AMMOUNT_THREE = Target.the("looking ammount 3")
            .locatedBy("(//span[@data-molecule-quantity-und-value='true'])[3]");
    public static final Target AMMOUNT_FOUR = Target.the("looking ammount 4")
            .locatedBy("(//span[@data-molecule-quantity-und-value='true'])[4]");
    public static final Target AMMOUNT_FIVE = Target.the("looking ammount 5")
            .locatedBy("(//span[@data-molecule-quantity-und-value='true'])[5]");

}