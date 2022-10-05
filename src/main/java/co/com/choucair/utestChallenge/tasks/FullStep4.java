package co.com.choucair.utestChallenge.tasks;

import co.com.choucair.utestChallenge.userinterface.FourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FullStep4 implements Task {

    private final String password;
    private final String confirmPassword;

    public FullStep4(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static FullStep4 complete(String password, String confirmPassword) {
        return Tasks.instrumented(FullStep4.class, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(FourthStepPage.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(FourthStepPage.INPUT_CONFIRMED_PASSWORD),
                Click.on(FourthStepPage.CHECK_STAY_INFORMED),
                Click.on(FourthStepPage.CHECK_TERMS_OF_USE),
                Click.on(FourthStepPage.CHECK_PRIVACY_POLICY),
                Click.on(FourthStepPage.SUBMIT_BUTTON)
        );
    }
}
