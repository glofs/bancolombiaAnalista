package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.remote.server.handler.ClickElement;
import userinterface.SearchCoursePage;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search theCourse(String course) {
     return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Scroll.to(SearchCoursePage.SCROLL_UC),
            Click.on(SearchCoursePage.BUTTON_UC),
            Enter.theValue(course).into(SearchCoursePage.INPUT_SEARCH),
            Click.on(SearchCoursePage.BUTTON_GO),
            Scroll.to(SearchCoursePage.SCROLL_MAIN),
            JavaScriptClick.on(SearchCoursePage.SELECT_COURSE))
            ;
    }
}
