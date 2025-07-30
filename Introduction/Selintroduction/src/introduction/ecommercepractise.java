package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommercepractise {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://www.automationexercise.com/");
		//driver.findElement( By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		// TODO Auto-generated method stub

	}

}
