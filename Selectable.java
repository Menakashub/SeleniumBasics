import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> totelements=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		System.out.println("Total elements" +totelements.size());
		/*
		 * Actions action = new Actions(driver);
		 * action.keyDown(Keys.CONTROL).click(totelements.get(0))
		 * .click(totelements.get(1)) .click(totelements.get(2)).build().perform();
		 */
		Actions action = new Actions(driver);
		action.clickAndHold(totelements.get(0))
		 .clickAndHold(totelements.get(1)) 
		 .clickAndHold(totelements.get(2)).build().perform();
		
	}

}
