package steps;

import io.cucumber.java.pt.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ConsultaCategoriaSteps {

    private static final String BASE_URL = "https://api.chucknorris.io/jokes/categories";
    private Response response;

    @Dado("que realizo a consulta das categorias")
    public void que_realizo_a_consulta_das_categorias() {
        response = given()
                .when()
                .get(BASE_URL);
    }

    @Entao("a resposta deve conter um array JSON")
    public void a_resposta_deve_conter_um_array_json() {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then()
                .statusCode(200)
                .body("$", is(not(empty())))
                .body("$", instanceOf(java.util.List.class));
    }

    @Entao("a resposta deve conter a categoria {string}")
    public void a_resposta_deve_conter_a_categoria(String categoria) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().body("$", hasItem(categoria));
    }

    @Entao("o tempo de resposta deve ser menor que {int} milissegundos")
    public void o_tempo_de_resposta_deve_ser_menor_que_milissegundos(Integer tempo) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().time(lessThan((long) tempo));
    }

    @Entao("a resposta deve conter todas as categorias esperadas")
    public void a_resposta_deve_conter_todas_as_categorias_esperadas() {
        assertThat("Resposta está nula", response, is(notNullValue()));
        String[] categoriasEsperadas = {
                "animal", "career", "celebrity", "dev", "explicit", "fashion",
                "food", "history", "money", "movie", "music", "political",
                "religion", "science", "sport", "travel"
        };
        for (String categoria : categoriasEsperadas) {
            response.then().body("$", hasItem(categoria));
        }
    }
}
