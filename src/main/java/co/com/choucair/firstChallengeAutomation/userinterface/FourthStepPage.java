package co.com.choucair.firstChallengeAutomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FourthStepPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMED_PASSWORD = Target.the("where do we write the Confirmed password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("where do we click check Stay Informed")
            .located(By.name("newsletterOptIn"));

    public static final Target CHECK_TERMS_OF_USE = Target.the("where do we click check the reading of the terms of use")
            .located(By.name("termOfUse"));

    public static final Target CHECK_PRIVACY_POLICY = Target.the("where do we click check the reading of the privacy & security policy")
            .located(By.name("privacySetting"));

    public static final Target SUBMIT_BUTTON = Target.the("where do we click Complete the Setup")
            .located(By.xpath("//a[@id='laddaBtn']"));

    public static final Target WELCOME_MESSAGE = Target.the("welcome message of UTest.com")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]"));





}
