package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	  ChromeDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15,0));
			driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
			driver.findElement(By.name("firstname")).sendKeys("Brindha");
			driver.findElement(By.name("lastname")).sendKeys("4005");
			driver.findElement(By.name("reg_email__")).sendKeys("9698566096");
			driver.findElement(By.name("reg_passwd__")).sendKeys("1314");
			driver.findElement(By.id("dateSelector")).click();
			WebElement dateElement = driver.findElement(By.id("day"));
			WebElement monthElement = driver.findElement(By.id("month"));
			WebElement yearElement = driver.findElement(By.id("Year"));
			Select dateDropdown = new Select(dateElement);
			dateDropdown.selectByVisibleText("14");
			Select monthDropdown = new Select(monthElement);
			Select yearDropdown = new Select(yearElement);
			dateDropdown.selectByVisibleText("14");
			monthDropdown.selectByVisibleText("Jul");
			yearDropdown.selectByVisibleText("1991");
			driver.findElement(By.xpath("//input[@typr='radio' and @value = '0'])"));
			
			driver.findElement(By.xpath("//buttom[text()='radio' and @value = '0'])"));
	}
	}
		
