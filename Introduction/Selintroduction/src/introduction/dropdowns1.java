package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver0=new ChromeDriver();
		driver0.manage().window().maximize();
		driver0.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
		
		driver0.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//select dropdown -select class (Static dropdown)
		WebElement Static=driver0.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select drop=new Select(Static);
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByVisibleText("AED");
		drop.selectByValue("INR");
	}

}
