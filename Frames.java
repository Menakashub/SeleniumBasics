import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.switchTo().frame(0);
	WebElement button1 =driver.findElement(By.id("Click"));
	button1.click();
	System.out.println("Text is" +button1.getText());
	
	
	/*
	 * driver.switchTo().defaultContent(); driver.switchTo().frame(1);
	 * driver.switchTo().frame("frame2"); WebElement button2=
	 * driver.findElement(By.id("Click1")); button2.click();
	 */
	 
	
	driver.switchTo().defaultContent();
	List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
	System.out.println("Total frames"+totalframe.size());
	
	}
}
