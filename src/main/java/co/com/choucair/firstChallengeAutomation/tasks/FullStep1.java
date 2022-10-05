package co.com.choucair.firstChallengeAutomation.tasks;

import co.com.choucair.firstChallengeAutomation.userinterface.FirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class FullStep1 implements Task {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String birthMonth;
    private final String birthDay;
    private final String birthYear;
    private final String languages;

    public FullStep1(String firstName, String lastName, String emailAddress, String birthMonth, String birthDay, String birthYear, String languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.languages = languages;
    }

    public static FullStep1 complete(String firstName, String lastName, String emailAddress, String birthMonth, String birthDay, String birthYear, String languages) {
        return Tasks.instrumented(FullStep1.class, firstName, lastName, emailAddress, birthMonth, birthDay, birthYear, languages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FirstStepPage.JOIN_TODAY_BUTTON),
                Enter.theValue(firstName).into(FirstStepPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(FirstStepPage.INPUT_LASTNAME),
                Enter.theValue(emailAddress).into(FirstStepPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(FirstStepPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(birthDay).from(FirstStepPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(FirstStepPage.SELECT_BIRTH_YEAR),
                Enter.theValue(languages).into(FirstStepPage.INPUT_LANGUAGES),
                Hit.the(Keys.ENTER).into(FirstStepPage.INPUT_LANGUAGES),
                Click.on(FirstStepPage.SUBMIT_BUTTON)
        );
    }
}
