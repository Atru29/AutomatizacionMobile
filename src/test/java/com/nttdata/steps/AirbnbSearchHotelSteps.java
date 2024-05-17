package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDestinoScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchHotelSteps {


    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    SearchDestinoScreen searchDestinoScreen;

    @Step("Click en cerrar vista Update")
    public void clickCloseUpdate(){
        loginScreen.clickClose();
    }
    @Step("Click en cerrar vista Login")
    public void clickCloseLogin(){
        loginScreen.clickClose();
    }
    @Step("Click en boton Where To")
    public void clickButtonWhereTo() {
        searchScreen.clickSearchInput();
    }
    @Step("Click en boton Destionations")
    public void clickSearchDestionations() {
        searchScreen.clickTypeSearchInput();
    }
    @Step("Escribir lugar de destino en el input")
    public void typeDestino(String destino) {
        searchDetailsScreen.enterSearchInput(destino);
    }
    @Step("click en buscar destiono")
    public void clickBuscarDestiono() {
        searchDetailsScreen.pressEnterKey();
    }
    @Step("click en el boton Skip")
    public void clickSkip() {
        searchDetailsScreen.clickSkip();
    }
    @Step("click en el boton Next")
    public void clickNext() {
        searchDetailsScreen.clickSearchLocation();
    }

    @Step("validar que la cantidad encontrada sea mayor a 1")
    public void validarCantidadEncontrada(int cantidad) {
        searchDestinoScreen.validarCantidadEncontradaSeaMayor(cantidad);
    }
    @Step("validar el mensaje esperado")
    public void validarMensaje(String mensaje) {
        searchDestinoScreen.validarMensajeEsperado(mensaje);
    }
}
