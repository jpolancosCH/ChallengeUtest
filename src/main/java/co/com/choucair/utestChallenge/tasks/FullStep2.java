package co.com.choucair.utestChallenge.tasks;

import co.com.choucair.utestChallenge.userinterface.SecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FullStep2 implements Task {

    private final String city;
    private final String zip;
    private final String country;

    public FullStep2(String city, String zip, String country) {
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public static FullStep2 complete(String city, String zip, String country) {
        return Tasks.instrumented(FullStep2.class, city, zip, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(SecondStepPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(SecondStepPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(SecondStepPage.INPUT_CITY),
                Enter.theValue(zip).into(SecondStepPage.INPUT_ZIP),
                Click.on(SecondStepPage.DIV_COUNTRY),
                Enter.theValue(country).into(SecondStepPage.INPUT_COUNTRY),
                Click.on(SecondStepPage.BUTTON_SUBMIT)
        );
    }
}
