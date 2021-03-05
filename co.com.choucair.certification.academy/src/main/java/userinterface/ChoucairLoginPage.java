package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON=  Target.the("button that shows us the form to login").located(By.xpath("(//A[@id=''])[1]"));
    public static final Target INPUT_EMAIL=Target.the(" user Email").located(By.xpath("//INPUT[@id='username']"));
    public  static final Target INPUT_PASSWORD=Target.the("user password").located(By.id("password"));
    public static final Target ENTER_BUTTON=Target.the("button to confirm login").located(By.xpath("//BUTTON[@type='submit'][text()='Acceder']"));
}
