# Desafio de Testes de API - Chuck Norris API

Este projeto tem como objetivo validar o funcionamento de duas APIs públicas utilizando Java, RestAssured e Cucumber para automação de testes.

## 🔗 Endpoints testados

- `GET https://api.chucknorris.io/jokes/categories`  
  Retorna uma lista de categorias disponíveis para piadas.

- `GET https://api.chucknorris.io/jokes/random?category={category}`  
  Retorna uma piada aleatória da categoria informada.

## ✅ Cenários de Teste

1. Validar que o retorno da API é um array JSON não vazio.
2. Validar que a resposta contém uma categoria específica.
3. Validar que a resposta contém todas as categorias esperadas.
4. Validar o tempo de resposta da API de categorias.
5. Validar que a API retorna status 200 para uma categoria válida.
6. Validar que o campo "value" da joke está preenchido.
7. Validar que a categoria retornada está presente na resposta.
8. Validar estrutura da resposta da joke.

## 🛠️ Tecnologias utilizadas

- Java 11+
- RestAssured
- Cucumber
- JUnit
- Maven

## ▶️ Como executar os testes

1. Clone o repositório:
    ```bash
    git clone https://github.com/francaKaren/ChuckNorrisTest.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd ChuckNorrisApiTest
    ```

3. Execute os testes com o Maven:
    ```bash
    mvn test
    ```

4. O relatório HTML será gerado em:
    ```bash
    target/report.html
    ```

## 📁 Estrutura de Diretórios

src
├── test
│ ├── java
│ │ ├── steps
│ │ │ ├── ConsultaCategoriaSteps.java
│ │ │ └── ConsultaJokesSteps.java
│ │ └── runners
│ │ └── TestRunner.java
│ └── resources
│ └── features
│ ├── consultaCategoria.feature
│ └── consultaJokes.feature


---

Desenvolvido para fins de avaliação técnica. 💻
