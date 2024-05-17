Feature: Búsqueda en Airbnb

  @ConsultarHotelLocacion
  Scenario Outline: Busqueda valida de Hotel en el app Airbnb
    Given el usuario se encuentra en el login de la app Airbnb
    And el usuario cierra la vista de update
    And el usuario cirra la vista de login
    When el usuario hace tap en  Where To
    And el usuario hace tap en Search Destinations
    And el usuario digita su destiono "<destino>" en el input
    And el usuario presiona buscar
    And el usuario hace tap en skip
    And el usuario hace tao en next
    Then se valida que los resultados sean mayores a 1
    And se valida el texto esperado sea "<mensaje>"
    Examples:
      | destino              | mensaje           |
      | Hoteles en Vichayito | Over 1,000 places |

  @ConsultarHotelLocacionInvalid
  Scenario Outline: Busqueda Invalida de Hotel en el app Airbnb
    Given el usuario se encuentra en el login de la app Airbnb
    And el usuario cierra la vista de update
    And el usuario cirra la vista de login
    When el usuario hace tap en  Where To
    And el usuario hace tap en Search Destinations
    And el usuario digita su destiono "<destino>" en el input
    And el usuario presiona buscar
    And el usuario hace tap en skip
    And el usuario hace tao en next
    Then se valida que los resultados sean mayores a 1
    And se valida el texto esperado sea "<mensaje>"
    Examples:
      | destino              | mensaje           |
      | Hoteles en Vichayito | Over 1,000 stays  |