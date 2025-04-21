Feature: Error en la autenticación
  Verificar que se muestran mensajes de error al ingresar credenciales incorrectas.

  Scenario: Mostrar mensaje de error al ingresar usuario incorrecto
    Given el usuario está en la página de login
    When ingresa un usuario incorrecto
    And ingresa una contraseña correcta
    Then se muestra un mensaje de error de usuario

  Scenario: Mostrar mensaje de error al ingresar contraseña incorrecta
    Given el usuario está en la página de login
    When ingresa un usuario correcto
    And ingresa una contraseña incorrecta
    Then se muestra un mensaje de error de contraseña