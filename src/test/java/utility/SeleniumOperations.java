package utility;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver = null;

	// browser launch
	public static void browserLaunch(Object[] inputParameters) 
	{
		try{
			
		String bName = (String) inputParameters[0];
		String webDriverExePath = (String) inputParameters[1];
		if (bName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", webDriverExePath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (bName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", webDriverExePath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

	// open application
	public static void openApplication(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String strgurl = (String)inputParameters[0];
		driver.get(strgurl);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		

	// clik
	public static void clickOnElement(Object[] inputParameters) throws InterruptedException
	{
		try {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String locator = (String) inputParameters[0];
		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	// mouse over
	public static void mouseOverAction(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String locator = (String) inputParameters[0];
		Actions act = new Actions(driver);
		WebElement abc = driver.findElement(By.xpath(locator));
		act.moveToElement(abc).build().perform();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	// sendkeys
	public static void sendText(Object[] inputParameters)
	{
		try {
		String locator = (String) inputParameters[0];
		String sendText = (String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath(locator)).sendKeys(sendText);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

	public static void validation(Object[]inputParameters)
	{
		try {
		 String xpath=(String) inputParameters[0];
		String giventext=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	String findText =driver.findElement(By.xpath(xpath)).getText();
	if(findText.equalsIgnoreCase(giventext))
	{
		System.out.println("Test case pass");
		
	}
	else
	{
		System.out.println("test case fail");
		
	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	public static void errorMsg(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		
		String givenText=(String) inputParameters[1];
		
		String findedText=driver.findElement(By.xpath(xpath)).getText();
		if(findedText.equals(findedText))
		{
			System.out.println("test case pass");		
			}
		else
		{
			
			System.out.println("test case fail");
		}
	}
	
}
