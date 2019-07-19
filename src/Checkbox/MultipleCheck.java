package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html");
		List <WebElement> ele=web.findElements(By.xpath("//*[contains(@id,'con')]//*[contains(@type,'checkbox')]"));
		System.out.println("The element size:"+ele.size());
		for(int i=0; i<ele.size();i++)
		{
			String chc=web.findElement(By.xpath("//*[contains(@id,'con')]")).getText();
			System.out.println(chc);
		}
	}

}
