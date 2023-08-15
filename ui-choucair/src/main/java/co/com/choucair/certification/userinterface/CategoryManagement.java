package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryManagement {
    public static final Target CATEGORY_MENU = Target.the("Select category menu")
            .locatedBy("#category-menu");
    public static final Target BEED_ROOM = Target.the("Select beed room")
            .locatedBy("#undefined-nivel2-Dormitorio");
    public static final Target HEADBOARD = Target.the("Product headboard")
            .locatedBy("#Categorías-nivel3-Cabeceros");
    public static final Target PRODUCT_ONE = Target.the("Select product 1")
            .locatedBy("//div[@id='gallery-layout-container']/div[1]//span[contains(text(),'Compra rápida')]");
    public static final Target PRODUCT_TWO = Target.the("Select product 2")
            .locatedBy("//div[@id='gallery-layout-container']/div[2]//span[contains(text(),'Compra rápida')]");
    public static final Target PRODUCT_THREE = Target.the("Select product 3")
            .locatedBy("//div[@id='gallery-layout-container']/div[3]//span[contains(text(),'Compra rápida')]");
    public static final Target PRODUCT_FOUR = Target.the("Select product 4")
            .locatedBy("//div[@id='gallery-layout-container']/div[4]//span[contains(text(),'Compra rápida')]");
    public static final Target PRODUCT_FIVE = Target.the("Select product 5")
            .locatedBy("//div[@id='gallery-layout-container']/div[5]//span[contains(text(),'Compra rápida')]");
    public static final Target ADD = Target.the("Add product")
            .locatedBy("//button//span[contains(text(),'Agregar')][1]");
    public static final Target NUMBER_OF_PRODCUTS = Target.the("Number of products")
            .locatedBy(".product-summary-add-to-car-plus");
    public static final Target CLOSE = Target.the("Close pop-up")
            .locatedBy(".exito-vtex-components-4-x-continue");
}
