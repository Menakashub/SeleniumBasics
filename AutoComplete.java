import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.findElement(By.id("tags")).sendKeys("s");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		
		System.out.println(list.size());
		for (WebElement webElement : list) {
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				break;
			}
			
		}
	}
	

}
