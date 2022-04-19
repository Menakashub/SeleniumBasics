import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/sortable.html");
			List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
			
			WebElement from= elements.get(6);
			WebElement to = elements.get(0);
			Actions action = new Actions(driver);
			action.clickAndHold(from).moveToElement(to).release().build().perform();
			

	}

}
