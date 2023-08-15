package co.com.choucair.certification.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeView {
    public static Target CLOSE_ADVERTISING = Target.the("Close advertising")
            .located(AppiumBy.id("com.exito.appcompania:id/collapse_button"));
    public static Target LOG_IN_LATER_BUTTON = Target.the("Login later butoon")
            .located(AppiumBy.id("com.exito.appcompania:id/textView_loginlater"));
    public static Target PERMISION_BUTTON = Target.the("Accept mobile permissions")
            .located(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
}