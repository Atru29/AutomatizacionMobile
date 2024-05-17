package com.nttdata.screens;


import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.interactions.Actions;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(id = "search_input")
    private WebElement searchDetailInput;
    private By searchDetailInputText = By.xpath("//android.widget.EditText[@resource-id=\"com.airbnb.android:id/input_bar_input\"]");

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement btnSkip;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_dls_action_footer_gradient_button\"]")
    private WebElement btnSearch;

    public void enterSearchInput(String place) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10); // Increase timeout to 10 seconds
        WebElement searchInput = wait.until(ExpectedConditions.presenceOfElementLocated(searchDetailInputText));
        searchInput.sendKeys(place);
    }

    public void pressEnterKey() {
        // Enviar la tecla Enter usando la clase Actions
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER).perform();
    }
    public void clickSkip() {
        btnSkip.click();
    }
    public void clickSearchLocation() {
        btnSearch.click();
    }
}
