Feature: Ingresar a google y buscar http://automationpractice.com/index.php
  @regresion

  @caso1
  Scenario: ingresar a google y buscar el sito web http://automationpractice.com/index.php
    Given yo ingreso al sitio web de google
    When  yo Ingreso la url y busco el sitio web "http://automationpractice.com/index.php"
    Then  yo Verifico verifico  que el sitio este disponible"http://automationpractice.com"
