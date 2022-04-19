import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonAppear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement voilaelement=	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='btn']"))));
		System.out.println("Element appear" +voilaelement.getText());}

}
