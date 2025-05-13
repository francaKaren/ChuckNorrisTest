package steps;

import io.cucumber.java.pt.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ConsultaJokesSteps {

    private static final String BASE_URL = "https://api.chucknorris.io/jokes/random";
    private Response response;
    private String categoria;

    @Dado("que realizo a consulta de joke para a categoria {string}")
    public void que_realizo_a_consulta_de_joke_para_a_categoria(String categoria) {
        this.categoria = categoria;
        response = given()
                .queryParam("category", categoria)
                .when()
                .get(BASE_URL);
    }

    @Entao("o status da resposta deve ser {int}")
    public void o_status_da_resposta_deve_ser(Integer status) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().statusCode(status);
    }

    @Entao("o campo {string} da joke deve estar preenchido")
    public void o_campo_da_joke_deve_estar_preenchido(String campo) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().body(campo, not(isEmptyOrNullString()));
    }

    @Entao("o campo {string} da resposta deve conter a categoria usada")
    public void o_campo_da_resposta_deve_conter_a_categoria_usada(String campo) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().body(campo, hasItem(categoria));
    }

    @Entao("a resposta deve conter os campos {string}, {string}, {string}")
    public void a_resposta_deve_conter_os_campos(String campo1, String campo2, String campo3) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().body("$", hasKey(campo1))
                .body("$", hasKey(campo2))
                .body("$", hasKey(campo3));
    }

    @Entao("o tempo de resposta da joke deve ser menor que {int} milissegundos")
    public void o_tempo_de_resposta_da_joke_deve_ser_menor_que(Integer tempo) {
        assertThat("Resposta está nula", response, is(notNullValue()));
        response.then().time(lessThan((long) tempo));
    }
}