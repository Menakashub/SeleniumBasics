import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement sql=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]"));
		sql.click();
		WebElement checkbox=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		System.out.println(checkbox.isSelected());
	
		WebElement decheckbox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if(decheckbox1.isSelected()) {
			decheckbox1.click();
		}
		WebElement decheckbox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if(decheckbox2.isSelected()) {
			System.out.println("I am here ");
			decheckbox2.click();
		}
	}
}
