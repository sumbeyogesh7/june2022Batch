package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Thread.sleep(5000);
		//driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		Actions act=new Actions(driver);
		WebElement web=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(web).build().perform();
		driver.findElementByXPath("(//*[@class='_2NOVgj'])[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("8999663205");
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("yogesh");
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
		
		
	}
}
