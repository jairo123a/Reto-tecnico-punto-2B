package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebGoogle {

    public static final Target Buscar=Target.the("campo busqueda de google").located(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
    public static final Target Verificar=Target.the("campo busqueda de google").located(By.xpath("//div[@class='TbwUpd NJjxre']//cite[contains(text(),'http://automationpractice.com')]"));


}
