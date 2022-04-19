import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement fromElement=driver.findElement(By.id("draggable"));
		WebElement ToElement=driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		//action.clickAndHold(fromElement).moveToElement(ToElement).release().build().perform();
		action.dragAndDrop(fromElement, ToElement).build().perform();
	}
}
