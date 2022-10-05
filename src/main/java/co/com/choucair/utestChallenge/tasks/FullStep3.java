package co.com.choucair.utestChallenge.tasks;

import co.com.choucair.utestChallenge.userinterface.ThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FullStep3 implements Task {

    private final String osComputer;
    private final String versionOSComputer;
    private final String languageOSComputer;
    private final String brandMobile;
    private final String modelMobile;
    private final String osMobile;

    public FullStep3(String osComputer, String versionOSComputer, String languageOSComputer, String brandMobile, String modelMobile, String osMobile) {
        this.osComputer = osComputer;
        this.versionOSComputer = versionOSComputer;
        this.languageOSComputer = languageOSComputer;
        this.brandMobile = brandMobile;
        this.modelMobile = modelMobile;
        this.osMobile = osMobile;
    }

    public static FullStep3 complete(String osComputer, String versionOSComputer, String languageOSComputer, String brandMobile, String modelMobile, String osMobile) {
        return Tasks.instrumented(FullStep3.class,osComputer, versionOSComputer, languageOSComputer, brandMobile, modelMobile, osMobile);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ThirdStepPage.DIV_OS),
                Enter.theValue(osComputer).into(ThirdStepPage.INPUT_OS),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_OS),
                Click.on(ThirdStepPage.DIV_VERSION),
                Enter.theValue(versionOSComputer).into(ThirdStepPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_VERSION),
                Click.on(ThirdStepPage.DIV_LANGUAGE),
                Enter.theValue(languageOSComputer).into(ThirdStepPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_LANGUAGE),
                Click.on(ThirdStepPage.DIV_BRAND),
                Enter.theValue(brandMobile).into(ThirdStepPage.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_BRAND),
                Click.on(ThirdStepPage.DIV_MODEL),
                Enter.theValue(modelMobile).into(ThirdStepPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_MODEL),
                Click.on(ThirdStepPage.DIV_OS_MOBILE),
                Enter.theValue(osMobile).into(ThirdStepPage.INPUT_OS_MOBILE),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_OS_MOBILE),
                Click.on(ThirdStepPage.BUTTON_SUBMIT)
                );
    }
}
