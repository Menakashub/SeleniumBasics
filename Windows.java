import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		String parent =driver.getWindowHandle();//current window
		driver.findElement(By.id("home")).click();
		Set<String>	handles=driver.getWindowHandles();
		for (String window : handles) {
			driver.switchTo().window(window);

		}
		WebElement editbox=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		System.out.println("Number of windows opened"+driver.getWindowHandles().size());
		driver.findElement(By.xpath("//*[@id=\"color\"]")).click();
		Set<String> newhandles=driver.getWindowHandles();
		for (String allwindow : newhandles) {
			if(!allwindow.equals(parent)) {
				driver.switchTo().window(allwindow);
				driver.close();
			}

		}


	}

}
