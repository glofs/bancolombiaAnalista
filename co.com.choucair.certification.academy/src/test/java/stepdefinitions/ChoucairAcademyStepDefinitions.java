package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
    OnStage.setTheStage(new OnlineCast());
    }
    @Given("^That Gustavo wants to learn automation at the Academy Choucair$")
    public void thatGustavoWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData>academyChoucairData) {
    OnStage.theActorCalled("Gustavo").wasAbleTo(OpenUp.thePage(),Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }


    @When("^He search for the course on the Choucair Academy platform$")
    public void heSearchForTheCourseWorkShopDeAutomatizacionOnTheChoucairAcademyPlatform(List<AcademyChoucairData>academyChoucairData) {
    OnStage.theActorInTheSpotlight().attemptsTo(Search.theCourse(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^He finds the course called$")
    public void heFindsTheCourseCalledWorkShopDeAutomatizacion(List<AcademyChoucairData>academyChoucairData) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}