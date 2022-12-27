package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login
{
	@Given ("^user provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
	public void bLaunch(String name,String location)
	{
		Object[] input = new Object[2];
		input[0]=name;
		input[1]=location;
		SeleniumOperations.browserLaunch(input);
	}
	@Given ("^user enter url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1 = new Object[1];
		input1[0] = url;
		SeleniumOperations.openApplication(input1);
	}
	@Given ("^user cancel initial  login window$")
	public void clickone() throws InterruptedException
	{
		Object[] input2 = new Object[1];
		input2[0] = "//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	}
	@When ("^user naviagte on login tab$")
	public void login()
	{
		Object[] input3 = new Object[1];
		input3[0] = "//*[text()='Login']";
		Hashtable<String,Object> output3=SeleniumOperations.mouseOverAction(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user naviagte on login tab$",output3.get("MESSAGE").toString());

	}
	@When ("^user click on my profile$")
	public void clickProfile() throws InterruptedException
	{
		Object[] input4 = new Object[1];
		input4[0] = "(//*[@class='_2NOVgj'])[1]";
		Hashtable<String,Object>output4=SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on my profile$",output4.get("MESSAGE").toString());

	}
	@When ("^user enter \"(.*)\" as username$")
	public void enterUname(String number)
	{
		Object[] input5 = new Object[2];
		input5[0] = "//*[@class='_2IX_2- VJZDxU']";
		input5[1] = number;
		Hashtable<String,Object>output5=SeleniumOperations.sendText(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$",output5.get("MESSAGE").toString());

	}
	@When ("^user enter \"(.*)\" as password$")
	public void enterPassword(String key)
	{
		Object[] input6 = new Object[2];
		input6[0] = "//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1] = key;
		Hashtable<String,Object>output6=SeleniumOperations.sendText(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$",output6.get("MESSAGE").toString());

	}
	@When ("^user click on login button$")
	public void clickLogin() throws InterruptedException
	{
		Object[] input7 = new Object[1];
		input7[0] = "(//*[@type='submit'])[2]";
		Hashtable<String,Object>output7=SeleniumOperations.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$",output7.get("MESSAGE").toString());

	}
	@Then ("^Applicaton shows user profile to user$")
	public void valid()
	{
		Object[] input8=new Object[2];
		input8[0]="//*[text()='yogesh sumbe']";
		input8[1]="yogesh sumbe";	
		Hashtable<String,Object>output8=SeleniumOperations.validation(input8);

		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Applicaton shows user profile to user$",output8.get("MESSAGE").toString());

	}
}
