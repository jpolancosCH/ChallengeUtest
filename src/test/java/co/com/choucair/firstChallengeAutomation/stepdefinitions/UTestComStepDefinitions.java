package co.com.choucair.firstChallengeAutomation.stepdefinitions;

import co.com.choucair.firstChallengeAutomation.model.DataFirstStep;
import co.com.choucair.firstChallengeAutomation.model.DataFourthStep;
import co.com.choucair.firstChallengeAutomation.model.DataSecondStep;
import co.com.choucair.firstChallengeAutomation.model.DataThirdStep;
import co.com.choucair.firstChallengeAutomation.questions.Answer;
import co.com.choucair.firstChallengeAutomation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.List;

public class UTestComStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than Julian want to register in the website$")
    public void thanJulianWantToRegisterInTheWebsite() {
        OnStage.theActorCalled("julian").wasAbleTo(OpenUp.thePage());
    }

    @When("^He complete the first part of the register$")
    public void heCompleteTheFirstPartOfTheRegister(List<DataFirstStep> dataFirstStep) {
        OnStage.theActorInTheSpotlight().attemptsTo(FullStep1.complete(dataFirstStep.get(0).getFirstName(),
                dataFirstStep.get(0).getLastName(),
                dataFirstStep.get(0).getEmailAddress(),
                dataFirstStep.get(0).getBirthMonth(),
                dataFirstStep.get(0).getBirthDay(),
                dataFirstStep.get(0).getBirthYear(),
                dataFirstStep.get(0).getLanguages()));
    }

    @When("^Complete the second part$")
    public void heCompleteTheSecondPart(List<DataSecondStep> dataSecondStep) {
        OnStage.theActorInTheSpotlight().attemptsTo((FullStep2.complete(dataSecondStep.get(0).getCity(),
                dataSecondStep.get(0).getZip(),
                dataSecondStep.get(0).getCountry())));
    }

    @When("^Complete the third part$")
    public void heCompleteTheThirdPart(List<DataThirdStep> dataThirdStep) {
        OnStage.theActorInTheSpotlight().attemptsTo((FullStep3.complete(dataThirdStep.get(0).getOsComputer(),
                dataThirdStep.get(0).getVersionOSComputer(),
                dataThirdStep.get(0).getLanguageOSComputer(),
                dataThirdStep.get(0).getBrandMobile(),
                dataThirdStep.get(0).getModelMobile(),
                dataThirdStep.get(0).getOsMobile())));
    }

    @When("^Complete the fourth part$")
    public void heCompleteTheFourthPart(List<DataFourthStep> dataFourthSteps) {
        OnStage.theActorInTheSpotlight().attemptsTo((FullStep4.complete(dataFourthSteps.get(0).getPassword(),
                dataFourthSteps.get(0).getConfirmPassword())));
    }

    @Then("^He can se the welcome message$")
    public void heCanSeTheWelcomeMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
