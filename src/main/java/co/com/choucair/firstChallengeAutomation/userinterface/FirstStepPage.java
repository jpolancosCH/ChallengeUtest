package co.com.choucair.firstChallengeAutomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FirstStepPage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("link that redirect to the sign up page")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the First name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("where do we write the Last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the Email address")
            .located(By.id("email"));

    public static final Target SELECT_BIRTH_MONTH = Target.the("where do we select the Birth month")
            .located(By.id("birthMonth"));

    public static final Target SELECT_BIRTH_DAY = Target.the("where do we select the Birth day")
            .located(By.id("birthDay"));

    public static final Target SELECT_BIRTH_YEAR = Target.the("where do we select the Birth year")
            .located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGES = Target.the("where do we select the Languages (spoken)")
            .located(By.xpath("//div[@aria-label='Add languages']//following::input"));

    public static final Target SUBMIT_BUTTON = Target.the("button to go to the step 2")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));


}
