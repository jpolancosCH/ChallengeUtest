package co.com.choucair.utestChallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ThirdStepPage extends PageObject {

    public static final Target DIV_OS = Target.the("where do we click to write the operating system")
            .located(By.xpath("//div[@placeholder='Select OS']"));

    public static final Target INPUT_OS = Target.the("where do we write the operating system")
            .located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target DIV_VERSION = Target.the("where do we click to write the version of the operating system")
            .located(By.xpath("//div[@placeholder='Select a Version']"));

    public static final Target INPUT_VERSION = Target.the("where do we write the version of the operating system")
            .located(By.xpath("//input[@placeholder='Select a Version']"));

    public static final Target DIV_LANGUAGE = Target.the("where do we click write the language of the operating system")
            .located(By.xpath("//div[@placeholder='Select OS language']"));

    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language of the operating system")
            .located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final Target DIV_BRAND = Target.the("where do we click to write the brand of the mobile device")
            .located(By.xpath("//div[@placeholder='Select Brand']"));

    public static final Target INPUT_BRAND = Target.the("where do we write the brand of the mobile device")
            .located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target DIV_MODEL = Target.the("where do we click to write the model of the mobile device")
            .located(By.xpath("//div[@placeholder='Select a Model']"));

    public static final Target INPUT_MODEL = Target.the("where do we write the model of the mobile device")
            .located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target DIV_OS_MOBILE = Target.the("where do we click to write the operating system of the mobile device")
            .located(By.xpath("//label[contains(text(),'Operating System:')]//following::div[@placeholder='Select OS']"));

    public static final Target INPUT_OS_MOBILE = Target.the("where do we write the operating system of the mobile device")
            .located(By.xpath("//label[contains(text(),'Operating System:')]//following::input[@placeholder='Select OS']"));

    public static final Target BUTTON_SUBMIT = Target.the("button to go to the step 4")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}
