# Desafio de Testes de API - Chuck Norris API

Este projeto tem como objetivo validar o funcionamento de duas APIs públicas utilizando Java, RestAssured e Cucumber para automação de testes.

## 🔗 Endpoints testados

- `GET https://api.chucknorris.io/jokes/categories`  
  Retorna uma lista de categorias disponíveis para piadas.

- `GET https://api.chucknorris.io/jokes/random?category={category}`  
  Retorna uma piada aleatória da categoria informada.

## ✅ Cenários de Teste

1. Validar que o endpoint de categorias retorna status 200.
2. Validar que a lista de categorias não está vazia.
3. Validar que uma piada é retornada para uma categoria válida.
4. Validar que ao utilizar uma categoria inválida, a API retorna erro (404).

## 🛠️ Tecnologias utilizadas

- Java 11+
- RestAssured
- Cucumber
- JUnit
- Maven

## ▶️ Como executar os testes

1. Clone o repositório:
    ```
    git clone <url-do-repositorio>
    ```

2. Navegue até o diretório do projeto:
    ```
    cd ChuckNorrisApiTest
    ```

3. Execute os testes com o Maven:
    ```
    mvn test
    ```

4. O relatório HTML será gerado em:
    ```
    target/report.html
    ```

## 📁 Estrutura de Diretórios

```
src
├── test
│   ├── java
│   │   ├── steps
│   │   │   ├── ConsultaCategoriaSteps.java
│   │   │   └── ConsultaJokesSteps.java
│   │   └── runners
│   │       └── TestRunner.java
│   └── resources
│       └── features
│           ├── consultaCategoria.feature
│           └── consultaJokes.feature
```

---

Desenvolvido para fins de avaliação técnica. 💻
