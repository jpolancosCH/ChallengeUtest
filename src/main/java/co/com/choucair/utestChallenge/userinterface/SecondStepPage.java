package co.com.choucair.utestChallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SecondStepPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("where do we write the Zip or Postal Code")
            .located(By.id("zip"));

    public static final Target DIV_COUNTRY = Target.the("where do we click to write the Country")
            .located(By.xpath("//div[@placeholder='Select a country']"));

    public static final Target INPUT_COUNTRY = Target.the("where do we write the Country")
            .located(By.xpath("//input[@placeholder='Select a country']"));

    public static final Target BUTTON_SUBMIT = Target.the("button to go to the step 3")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
