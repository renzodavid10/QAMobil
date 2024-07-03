package com.nttdata.screens;


import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StoreScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement tituloApp;

    @AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup)")
    private List<WebElement> lista2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement cantidad;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement agregarCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement cantidadCarrito;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]/android.widget.ImageView")
    private WebElement entrarCarrito;

    String paxnameProducto;

    public void nameProducto(String nameProducto) {
        this.paxnameProducto = "//android.widget.ImageView[@content-desc=\"" + nameProducto + "\"]";
    }

    public void hacerClick() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement productElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(paxnameProducto)));
        productElement.click();
    }

    public int getCountElements() {
        return lista2.size();
    }

    public String getTitulo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup)")));
        return tituloApp.getText();
    }
    public void agregarCantidad(int canti){
        if(canti>1) {
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(cantidad));
            cantidad.click();
        }
    }
    public void agregarCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(agregarCarrito));
        agregarCarrito.click();
    }
    public String validCantidadCarrito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")));
        return cantidadCarrito.getText();
    }
    public void entrarCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(entrarCarrito));
        entrarCarrito.click();
    }
}


