package com.nttdata.stepsdefinitions;


import com.nttdata.steps.StoreDemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StoreDemoStepdefs {
    @Steps
    StoreDemo steps;

    @Given("estoy en la aplicación de Store Demo")
    public void estoyEnLaAplicaciónDeStoreDemo() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        steps.validacionProductGaleria();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int cantidad, String producto) {
        steps.hacerClick(producto,cantidad);
    }

    @Then("valido el carrito de compra actualice correctamente las unidades {string}")
    public void validoElCarritoDeCompraActualiceCorrectamentelasunidades(String cantidad) {
        steps.validarCarritoActualizacion(cantidad);
    }
}
