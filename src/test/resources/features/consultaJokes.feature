# languade: pt
# enconding: UTF-8

Feature: Consulta de jokes por categoria na API do Chuck Norris

  Scenario: Validar que a API retorna status 200 para uma categoria válida
    Given que realizo a consulta de joke para a categoria "animal"
    Then o status da resposta deve ser 200

  Scenario: Validar que o campo "value" da joke está preenchido
    Given que realizo a consulta de joke para a categoria "animal"
    Then o campo "value" da joke deve estar preenchido

  Scenario: Validar que a categoria retornada está presente na resposta
    Given que realizo a consulta de joke para a categoria "animal"
    Then o campo "categories" da resposta deve conter a categoria usada

  Scenario: Validar estrutura da resposta da joke
    Given que realizo a consulta de joke para a categoria "animal"
    Then a resposta deve conter os campos "id", "value", "categories"
    And o tempo de resposta da joke deve ser menor que 2000 milissegundos
