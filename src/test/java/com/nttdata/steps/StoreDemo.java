package com.nttdata.steps;

import com.nttdata.screens.StoreScreen;
import org.junit.Assert;

public class StoreDemo {
    StoreScreen screen;

    public void hacerClick(String name,int cantidad) {
        screen.nameProducto(name);
        screen.hacerClick();
        screen.agregarCantidad(cantidad);
        screen.agregarCarrito();
    }

    public void validacionProductGaleria() {
        Assert.assertEquals("PRODUCTS", screen.getTitulo());
        Assert.assertTrue(screen.getCountElements() > 1);
    }
    public  void  validarCarritoActualizacion(String cantidad){
        screen.entrarCarrito();
        Assert.assertEquals(cantidad,screen.validCantidadCarrito());
    }

}
