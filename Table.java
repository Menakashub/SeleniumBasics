import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Menakas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/table.html");
			List<WebElement> colcount=driver.findElements(By.tagName("th"));
			System.out.println("Total column is "+colcount.size());
			
			List<WebElement> rowcount =driver.findElements(By.tagName("tr"));
			System.out.println("Tot Rows are" +rowcount.size());
			
			WebElement getPercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
			System.out.println("Percentage is "+getPercent.getText());
			
			  List<Integer> convertinteger= new ArrayList<Integer>(); 
			  List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]")); 
			  for (WebElement  webelement : allProgress) { 
				  
				  String value=webelement.getText().replace("%", "");
				   convertinteger.add(Integer.parseInt(value));
			  }
			  System.out.println("Final List"+convertinteger);
			int smallvalue= Collections.min(convertinteger);
			String percentString=Integer.toString(smallvalue)+"%";
			System.out.println("small is "+percentString);
			String finalxpath="//td[normalize-space()="+"\""+percentString+"\""+"]"+"//following::td[1]";
			System.out.println(finalxpath);
			driver.findElement(By.xpath(finalxpath)).click();
		}
}
