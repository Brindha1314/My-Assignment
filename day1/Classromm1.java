package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Classromm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		EdgeDriver edge=new EdgeDriver();
		edge.get("https://www.facebook.com/");
		ChromeDriver sfchrome=new ChromeDriver();
		sfchrome.get("https://login.salesforce.com/");
		EdgeDriver sfedge=new EdgeDriver();
		sfedge.get("https://login.salesforce.com/");
	}
	}

