package co.com.choucair.certification.utils;

import net.serenitybdd.screenplay.targets.Target;
import java.util.ArrayList;
import java.util.List;

import static co.com.choucair.certification.userinterface.CategoryManagement.*;

public class GenerateProducts {

    private static List<Target> products = new ArrayList<Target>();
    private static int min = 0;

    public static Target getProduct() {
        int pos = Integer.parseInt(Random.randoms(products.size()-1, min));
        Target product = products.get(pos);
        products.remove(pos);
        return product;
    }

    public static void setProduct() {
        products.add(PRODUCT_ONE);
        products.add(PRODUCT_TWO);
        products.add(PRODUCT_THREE);
        products.add(PRODUCT_FOUR);
        products.add(PRODUCT_FIVE);
    }
}