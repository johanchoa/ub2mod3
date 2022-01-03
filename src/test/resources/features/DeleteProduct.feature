Feature: Borrar un producto de la canasta

  Agregar el producto Galaxy s6 a la canasta y despues borrarlo

  Scenario: Borrar un producto de la canasta

    Given Abrir NavegadorParaBorrar
    When Seleccionar producto y agregarlo al carrito
    And  Borrar Producto
    Then Confirmacion de Borrado de Producto