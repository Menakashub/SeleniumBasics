import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement first=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		first.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement second=driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		second.click();
		
		org.openqa.selenium.Alert obj = driver.switchTo().alert();
		obj.dismiss();
		
		WebElement third=driver.findElement(By.xpath("//button[normalize-space()='Prompt Box']"));
		third.click();
		org.openqa.selenium.Alert obj1 = driver.switchTo().alert();
		obj1.sendKeys("hello");
		obj1.accept();
		
		WebElement fourth=driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
		fourth.click();
		org.openqa.selenium.Alert obj2 = driver.switchTo().alert();
		List<WebElement> line=driver.findElements(By.tagName("/br"));
		System.out.println("Break are "+line.size());
		obj2.accept();
		
		
	}

}
