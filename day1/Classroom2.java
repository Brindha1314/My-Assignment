package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		//WebElement findElement = driver.findElement(By.id("username"));
		//findElement.sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@234");
		driver.findElement(By.id("Title"));
		System.out.println("salesforce");
		driver.findElement(By.id("Login")).click();
		
	}

}
