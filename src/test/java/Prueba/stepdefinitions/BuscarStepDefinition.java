package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verifico;
import tasks.Abrir;
import tasks.Buscar;

public class BuscarStepDefinition {
     @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^yo ingreso al sitio web de google$")
    public void yo_ingreso_al_sitio_web_de_google() {
        OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }


    @When("^yo Ingreso la url y busco el sitio web \"([^\"]*)\"$")
    public void yo_Ingreso_la_url_y_busco_el_sitio_web(String datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.laUrlConLos(datos));
    }

    @Then("^yo Verifico verifico  que el sitio este disponible\"([^\"]*)\"$")
    public void yo_Verifico_verifico_que_el_sitio_este_disponible(String dato) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifico.laRespuestaConEl(dato)));
    }


}
