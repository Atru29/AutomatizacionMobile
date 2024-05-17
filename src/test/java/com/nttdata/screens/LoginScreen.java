package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    //
    private WebElement btnClose;

    public void clickClose(){
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 20);
            wait.until(ExpectedConditions.elementToBeClickable(btnClose));
            btnClose.click();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
