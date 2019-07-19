package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Jar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	System.out.println("The Attribute value is " + driver.findElement(By.id("welcome-menu")).getAttribute("class"));
	System.out.println(driver.findElement(By.id("welcome")).getText());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
//	driver.close();	
	}
	
}
