Feature: Tienda demo

  @prueba
  Scenario Outline: Ingresar productos de la tienda
    Given estoy en la aplicación de Store Demo
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente las unidades "<UNIDADES>"
    Examples:
      | PRODUCTO                  | UNIDADES |
      | Sauce Labs Backpack       | 1        |
      | Sauce Labs Bolt - T-Shirt | 1        |
      | Sauce Labs Bike Light     | 2        |
