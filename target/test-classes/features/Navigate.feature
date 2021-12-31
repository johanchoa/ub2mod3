Feature: Navigate

  Navegar por los diferentes tipos de productos (Teléfonos, ordenadores y Pantallas)

  Scenario: Navegacion de cliente

    Given Abrir Navegador en Home
    And Seleccionar Categoria Phones
    And Validar items Categoria Phones
    And Seleccionar Categoria Laptops
    And Validar items Categoria Laptops
    When Seleccionar Categoria Monitors
    Then Validar items Categoria Monitors
