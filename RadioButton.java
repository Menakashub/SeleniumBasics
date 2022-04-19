import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		WebElement yesb=driver.findElement(By.id("yes"));
		yesb.click();
		WebElement uncheck =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		
		if(uncheck.isSelected()) {
			System.out.println("Default selected is--Unchecked ");
		}
		else {
			System.out.println("Default selected is --Checked");
		}
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]")).click();
	}

}
