package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver lead =new ChromeDriver();
lead.get("http://leaftaps.com/opentaps/control/login");
lead.manage().window().maximize();
lead.findElement(By.id("username")).sendKeys("Demosalesmanager");
lead.findElement(By.id("password")).sendKeys("crmsfa");
lead.findElement(By.className("decorativeSubmit")).click();
lead.findElement(By.linkText("CRM/SFA")).click();
lead.findElement(By.linkText("Leads")).click();
lead.findElement(By.linkText("Create Lead")).click();
lead.findElement(By.id("createLeadForm_companyName")).sendKeys("ATOS");
lead.findElement(By.id("createLeadForm_firstName")).sendKeys("Brindha");
lead.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
lead.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Brinji");
lead.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
lead.findElement(By.id("createLeadForm_description")).sendKeys("Creative");
lead.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("brindha4005@gmail.com");
WebElement ele1 = lead.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select sec1 = new Select(ele1);
sec1.selectByVisibleText("New York");
lead.findElement(By.name("submitButton")).click();
String title = lead.getTitle();
System.out.println(title);

	}

}
