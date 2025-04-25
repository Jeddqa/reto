Feature: Login y contratación en OrangeHRM

  Scenario: Usuario válido inicia sesión y contrata un candidato
    Given que Juan abre la aplicación OrangeHRM
    When ingresa sus credenciales válidas
    And registra a Eduardo Enrique como nuevo candidato
    Then debería ver el panel principal
    And el estado del candidato debe ser contratado