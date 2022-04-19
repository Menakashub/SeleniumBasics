import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Appium");

		WebElement dropdown3= driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("3");

		WebElement totDropdown=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select select4 = new Select(totDropdown);
		List<WebElement> total=	select4.getOptions();
		System.out.println("Total Elements" +total.size());
		
		WebElement dropdown4=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		dropdown4.sendKeys("Loadrunner");

		WebElement multiselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multi = new Select(multiselect);
		multi.selectByIndex(1);
		multi.selectByIndex(2);

	}

}
