package co.com.choucair.firstChallengeAutomation.questions;

import co.com.choucair.firstChallengeAutomation.userinterface.FourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {


    public static Answer toThe() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeMessage = Text.of(FourthStepPage.WELCOME_MESSAGE).viewedBy(actor).asString();
        String question="Welcome to the world's largest community of freelance software testers!";
        return question.equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
