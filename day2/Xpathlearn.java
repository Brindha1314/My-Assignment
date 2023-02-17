package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlearn {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.xpath("//input[@name='submitButton']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ATOS");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Brindha");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			String title = driver.getTitle();
			System.out.println(title);
}
}
