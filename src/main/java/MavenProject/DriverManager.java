package MavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("Images"));
		
	   ele.click();
	   
	   driver.navigate().back();
	   
	   WebElement ele2 = driver.findElement(By.partialLinkText("ail"));
	   
	   ele2.click();
	   
	   driver.navigate().back();
	   
	   List<WebElement> element = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	   
	   for (int i=0; i<element.size(); i++) {
		   
	WebElement ele4 = element.get(i);
	
	String text = ele4.getText();
	
	System.out.println (text);
	   
	  	   
	   }

	}

}
