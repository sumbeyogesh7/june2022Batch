package utility;

import java.util.Hashtable;
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
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	// browser launch
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters) 
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
			outputParameters.put("STATUS", "Fail");
			outputParameters.put("MESSAGE", "Action:Browser launch,Input Given:"+inputParameters[0].toString());
			
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Browser launch,Input Given:"+inputParameters[0].toString());
			
		}
			return outputParameters;
		}

	// open application
	public static Hashtable<String,Object> openApplication(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String strgurl = (String)inputParameters[0];
		driver.get(strgurl);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:Open Application,Input Given:"+inputParameters[0].toString());
		
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Open Application,Input Given:"+inputParameters[0].toString());
			
		}
		return outputParameters;
	}
		

	// clik
	public static Hashtable<String,Object> clickOnElement(Object[] inputParameters) throws InterruptedException
	{
		try {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String locator = (String) inputParameters[0];

		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(5000);
		
		outputParameters.put("STATUS", "Pass");
		outputParameters.put("MESSAGE", "Action:Click on Element,Input Given:"+inputParameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Click on Element,Input Given:"+inputParameters[0].toString());
			
		}
		return outputParameters;
	}

	// mouse over
	public static Hashtable<String,Object> mouseOverAction(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String locator = (String) inputParameters[0];
		Actions act = new Actions(driver);
		WebElement abc = driver.findElement(By.xpath(locator));
		act.moveToElement(abc).build().perform();

		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:Mouse over on Element,Input Given:"+inputParameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Mouse over on Element,Input Given:"+inputParameters[0].toString());
			
		}
		return outputParameters;
	}

	// sendkeys
	public static Hashtable<String,Object> sendText(Object[] inputParameters)
	{
		try {
		String locator = (String) inputParameters[0];
		String sendText = (String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath(locator)).sendKeys(sendText);
	
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:Sendtext on Element,Input Given:"+inputParameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Sendtext on Element,Input Given:"+inputParameters[0].toString());
			
		}
		return outputParameters;
	}

	public static Hashtable<String,Object> validation(Object[]inputParameters)
	{
		try {
		 String xpath=(String) inputParameters[0];
		String giventext=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	String findText =driver.findElement(By.xpath(xpath)).getText();
	if(findText.equalsIgnoreCase(giventext))
	{
		System.out.println("Test case pass");
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:Validation,Input Given:"+inputParameters[0].toString());
		
		
	}
	else
	{
		System.out.println("test case fail");
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action:Validation,Input Given:"+inputParameters[0].toString());
		
	}
	
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Validation,Input Given:"+inputParameters[0].toString());
			
		}
		return outputParameters;
	
	}
	
	/*
	
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
	
	public static void validationForInvaid(Object[]inputParameters)
	{
		try {
		 String xpath=(String) inputParameters[0];
		String giventext=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	String findText =driver.findElement(By.xpath(xpath)).getText();
	if(findText.equalsIgnoreCase(giventext))
	{
		System.out.println("Test case fail");
		
	}
	else
	{
		System.out.println("test case pass");
		
	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
*/	
}
