package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookClass {

	public static void main(String[] args) {
		
WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
		
		///String text = ele.getText();
		
	  String text = ele.getAttribute("innerText");
	   
	   System.out.println(text);
		
	  WebElement ele2 = driver.findElement(By.name("email"));
	  
	  ele2.sendKeys("shyam.dpce@gmail.com");
	  
	  String attr = ele2.getAttribute("value");
	  
	  System.out.println (attr);
	  
	  driver.quit();

	}

}
