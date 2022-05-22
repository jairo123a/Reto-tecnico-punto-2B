package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.ElementosWebGoogle;

public class Buscar implements Task {
   String datos;
    public Buscar(String datos){
       this.datos=datos;
   }

    public static Buscar laUrlConLos(String datos) {
           return new Buscar(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(
                   Enter.theValue(datos).into(ElementosWebGoogle.Buscar),
                   Hit.the(Keys.ENTER).into(ElementosWebGoogle.Buscar)
           );
    }
}
