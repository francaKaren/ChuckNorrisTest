# languade: pt
# enconding: UTF-8


Feature: Consulta das categorias da API do Chuck Norris

  Scenario: Validar que o retorno da API é um array JSON não vazio
    Given que realizo a consulta das categorias
    Then a resposta deve conter um array JSON

  Scenario: Validar que a resposta contém uma categoria específica
    Given que realizo a consulta das categorias
    Given a resposta deve conter a categoria "animal"

  Scenario: Validar que a resposta contém todas as categorias esperadas
    Given que realizo a consulta das categorias
    Given a resposta deve conter todas as categorias esperadas

  Scenario: Validar o tempo de resposta da API de categorias
    Given que realizo a consulta das categorias
    Given o tempo de resposta deve ser menor que 2000 milissegundos