package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchHotelSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AirbnbSearchHotelStepsDefs {
    @Steps
    AirbnbSearchHotelSteps airbnbSearchHotelSteps;

    @Given("el usuario se encuentra en el login de la app Airbnb")
    public void elUsuarioSeEncuentraEnElLoginDeLaAppAirbnb() {
    }

    @And("el usuario cierra la vista de update")
    public void elUsuarioCierraLaVistaDeUpdate() {
        airbnbSearchHotelSteps.clickCloseUpdate();
    }

    @And("el usuario cirra la vista de login")
    public void elUsuarioCirraLaVistaDeLogin() {
        airbnbSearchHotelSteps.clickCloseLogin();
    }

    @When("el usuario hace tap en  Where To")
    public void elUsuarioHaceTapEnWhereTo() {
        airbnbSearchHotelSteps.clickButtonWhereTo();
    }

    @And("el usuario hace tap en Search Destinations")
    public void elUsuarioHaceTapEnSearchDestinations() {
        airbnbSearchHotelSteps.clickSearchDestionations();
    }

    @And("el usuario digita su destiono {string} en el input")
    public void elUsuarioDigitaSuDestionoEnElInput(String destino) {
        airbnbSearchHotelSteps.typeDestino(destino);
    }

    @And("el usuario presiona buscar")
    public void elUsuarioPresionaBuscar() {
        airbnbSearchHotelSteps.clickBuscarDestiono();
    }

    @And("el usuario hace tap en skip")
    public void elUsuarioHaceTapEnSkip() {
        airbnbSearchHotelSteps.clickSkip();
    }

    @And("el usuario hace tao en next")
    public void elUsuarioHaceTaoEnNext() {
        airbnbSearchHotelSteps.clickNext();
    }
    @Then("se valida que los resultados sean mayores a {int}")
    public void seValidaQueLosResultadosSeanMayoresA(int cantidad) {
        airbnbSearchHotelSteps.validarCantidadEncontrada(cantidad);
    }

    @And("se valida el texto esperado sea {string}")
    public void seValidaElTextoEsperadoSea(String mensaje) {
        airbnbSearchHotelSteps.validarMensaje(mensaje);
    }

}
