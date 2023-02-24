package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
driver.findElement(By.id("nav-search-submit-button")).click();
List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
List<Integer>list= new ArrayList<>();
for(WebElement each:prices)
{
	
	String allPriceText = each.getText();
	String replacedString = allPriceText.replaceAll(",","");
	
	if(!replacedString.isEmpty())
	{
		int convertedString = Integer.parseInt(replacedString);
		list.add(convertedString);
	}
	}
Collections.sort(list);
System.out.println(list.get(0));
	}
}

