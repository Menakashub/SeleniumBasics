import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		Thread.sleep(3000);
		WebElement filebutton=driver.findElement(By.xpath("//input[@name='filename']"));
		Actions click = new Actions(driver);
		click.moveToElement(filebutton).click().build().perform();
		StringSelection selection= new StringSelection("C:\\Users\\Menakas\\OneDrive\\Documents\\Mani-Chandra\\TestCase_MakeMyTrip.ods");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000); robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);




	}
}
