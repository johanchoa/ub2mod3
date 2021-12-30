Feature: Selector

  Seleccionar diferentes productos y adicionarlos al carrito de compras

  Scenario: SingUp de cliente seleccionar productos y adicionarlos al carrito

    Given Abrir NavegadorP
    When Seleccionar productos y agregarlos al carrito
    Then Confirmacion Productos Adicionados