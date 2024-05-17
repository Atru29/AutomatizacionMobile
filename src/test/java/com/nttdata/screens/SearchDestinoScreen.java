package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchDestinoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.airbnb.android:id/n2_bottom_sheet_title_title\"]")
    private WebElement resultText;

    public void validarMensajeEsperado(String mensaje) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        // Esperar a que el texto del resultado esté presente en el DOM
        WebElement resultElement = wait.until(ExpectedConditions.visibilityOf(resultText));
        // Ahora puedes obtener el texto del resultado
        Assert.assertEquals(mensaje, resultElement.getText());
    }

    public String getResultMessage() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        // Esperar a que el texto del resultado esté presente en el DOM
        WebElement resultElement = wait.until(ExpectedConditions.visibilityOf(resultText));
        // Ahora puedes obtener el texto del resultado
        return resultElement.getText();
    }

    public void validarCantidadEncontradaSeaMayor(int cantidad) {
        // Obtener el mensaje de resultado
        String mensaje = getResultMessage();
        // Aqui defino la busqueda en el formato de numero con comas
        Pattern pattern = Pattern.compile("\\b\\d{1,3}(,\\d{3})*(\\.\\d+)?\\b");
        // Use Matcher para buscar un numero den la cadena
        Matcher matcher = pattern.matcher(mensaje);
        int numeroResultados = 0;
        if (matcher.find()) {
            // Elimnar ","  de la cadena
            String numeroEnTexto = matcher.group().replaceAll(",", "");
            numeroResultados = Integer.parseInt(numeroEnTexto);
        }
        // Validar que el número de resultados sea mayor a 1,000
        Assert.assertTrue("El número de resultados es mayor a 1", numeroResultados > cantidad);
    }
}
