import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locators {


	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");

		//Text Fields
		WebElement editlink=	driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		editlink.click();
		WebElement enteremail=driver.findElement(By.id("email"));
		enteremail.sendKeys("Hello@hello.com");
		WebElement appendtext= driver.findElement(By.xpath("//input[@value='Append ']"));
		appendtext.sendKeys("Hi");
		String defaulttext=driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("text is " +defaulttext);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Boolean enablestatus=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println("Element is Disabled" +enablestatus);
		driver.navigate().back();


		//Buttons
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		WebElement position =driver.findElement(By.id("position"));
		Point pointer = position.getLocation();
		System.out.println("X Position is "+pointer.getX());
		System.out.println("Y Position is "+pointer.getY());
		String backgroundcolor=driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Background color is "+backgroundcolor);
		WebElement buttonsize=driver.findElement(By.id("size"));
		System.out.println("Height is"+buttonsize.getSize().getHeight());
		System.out.println("Width is "+buttonsize.getSize().getWidth());
		driver.findElement(By.id("home")).click();

		//Hyperlink
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		WebElement home= driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		WebElement findlink =driver.findElement(By.partialLinkText("Find where am supposed"));
		findlink.getAttribute("href");
		System.out.println("UrL directed to "+findlink);
		WebElement brokenlink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		String title=driver.getTitle();
		if(title.contains("404 Not Found")) {
			System.out.println("Link is broken");
		}

		driver.navigate().back();
		WebElement home1= driver.findElement(By.linkText("Go to Home Page"));
		home1.click();

		driver.navigate().back();
		List<WebElement> totallink=driver.findElements(By.tagName("a"));

		System.out.println("Number of Links in this Page are "+totallink.size());
		driver.navigate().back();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		WebElement brokenimage= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		brokenimage.click();
		if(brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");	
		}

		WebElement Keyboardimage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).click(Keyboardimage).build().perform();
		
		

	}

}
