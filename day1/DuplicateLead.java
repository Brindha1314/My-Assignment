package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver editlead=new ChromeDriver();
		editlead.get("http://leaftaps.com/opentaps/control/login");
		editlead.findElement(By.id("username")).sendKeys("Demosalesmanager");
		editlead.findElement(By.id("password")).sendKeys("crmsfa");
		editlead.findElement(By.className("decorativeSubmit")).click();
		editlead.findElement(By.linkText("CRM/SFA")).click();
		editlead.findElement(By.linkText("Leads")).click();
		editlead.findElement(By.linkText("Create Lead")).click();
		editlead.findElement(By.id("createLeadForm_companyName")).sendKeys("Vinothraj");
		editlead.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		editlead.findElement(By.id("createLeadForm_lastName")).sendKeys("raj");
		editlead.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("chellam");
		editlead.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		editlead.findElement(By.id("createLeadForm_description")).sendKeys("Java & JavaScript");
		editlead.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinothraj.mba@gmail.com");
		WebElement scroll = editlead.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(scroll);
		dd.selectByVisibleText("New York");
		editlead.findElement(By.name("submitButton")).click();
		String title = editlead.getTitle();
		System.out.println(title);
		editlead.findElement(By.linkText("Duplicate Lead")).click();
		editlead.findElement(By.id("createLeadForm_companyName")).clear();
		editlead.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		editlead.findElement(By.id("createLeadForm_firstName")).clear();
		editlead.findElement(By.id("createLeadForm_firstName")).sendKeys("s.Vinothraj");
		editlead.findElement(By.name("submitButton")).click();
		String subtitle = editlead.getTitle();
		System.out.println(subtitle);
	}

}
