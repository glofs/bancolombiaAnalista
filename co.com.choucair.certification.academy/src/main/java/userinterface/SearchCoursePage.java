package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target SCROLL_UC=Target.the("Desplazarse para ver las categorias").located(By.id("region-main"));
    public static final Target BUTTON_UC=Target.the("Boton Universidad Choucair").located(By.xpath("(//IMG[@class='card-img-top'])[1]"));
    public static final Target  INPUT_SEARCH=Target.the("buscar el curso").located(By.xpath("//INPUT[@id='coursesearchbox']"));
    public static final Target BUTTON_GO =Target.the("Ir al curso").located(By.xpath("//BUTTON[@class='btn btn-secondary'][text()='Ir']"));
    public static final Target SCROLL_MAIN=Target.the("Desplazarse para ver resultados").located(By.xpath("//SECTION[@id='region-main']"));
    public static final Target SELECT_COURSE=Target.the("seleccionar el curso").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE=Target.the("Nombre del curso").located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
