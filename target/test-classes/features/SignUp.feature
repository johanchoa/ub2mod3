Feature: signUp

  Probar formulario de Login

  Scenario: SingUp de cliente

    Given Abrir Navegador
    And Seleccionar SignUp Buttom
    When Crear usuario y clave
    And Click SignUp
    Then Confirmacion Usuario Creado