package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxselection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver0=new ChromeDriver();
		driver0.manage().window().maximize();
		driver0.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
		
		driver0.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver0.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		
		Assert.assertFalse(driver0.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		
		driver0.findElement(By.cssSelector("[id*='friendsandfamily']")).click();
		
		Assert.assertTrue(driver0.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		
		//System.out.println(driver0.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		
		//count no.of checkboxes:
		
		System.out.println(driver0.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver0.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		
		Thread.sleep(2000);

		
		//driver0.findElement(By.cssSelector("button.ui-datepicker-trigger")).click();
		
		
		//radio-buttons:
		//System.out.println(driver0.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver0.findElement(By.id("Div1")).getDomAttribute("style"));
		driver0.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(2000);
		System.out.println(driver0.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver0.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
				{
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(By.id("ctl00_mainContent_view_date2"), true);
		

	}

}
