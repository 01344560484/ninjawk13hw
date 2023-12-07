package homepage;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuTest extends BaseTest {
    String baseurl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
   /* 1. create class "TopMenuTest"
      1.1 create method with name "selectMenu" it has one parameter name "menu" of type  string
      1.2 This method should click on the menu whatever name is passed as parameter.*/

    public void selectMenu(String menu) {
        List<WebElement> topMenuName=driver.findElements(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']"));
        for (WebElement name : topMenuName){
            if(name.getText().equalsIgnoreCase(menu)){
                name.click();
                break;
            }
        }
    }
}
