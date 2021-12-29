Feature: logIn

  Probar formulario de Login

  Scenario: LogIn de cliente

    Given Abrir Navegador LogIn
    And Seleccionar LogIn Buttom
    When Ingresar usuario y clave
    And Click LogIn
    Then Confirmacion Usuario Logeado