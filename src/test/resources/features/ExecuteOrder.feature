Feature: Realizar Pedido

  realizar pedido de los productos seleccionados en el carrito

  Scenario: Ejecutar la orden de compra de los productos

    Given Abrir NavegadorOrden
    When Seleccionar productos y agregarlos al carrito para realizar la compra y borrar uno
    And  Solicitar la orden
    Then Confirmacion de productos ordenados