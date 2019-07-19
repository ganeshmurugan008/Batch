package launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				
		/*driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/

/*		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); */

		WebElement button=driver.findElement(By.id("btnLogin"));
		WebDriverWait wait=new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		
		WebElement element=	driver.findElement(By.id("footer"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		//js.executeScript("window.scrollBy(0,300)");	
				
	}

}
