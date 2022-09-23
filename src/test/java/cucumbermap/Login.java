package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
		SeleniumOperations.mouseOverAction(input3);

	}
	@When ("^user click on my profile$")
	public void clickProfile() throws InterruptedException
	{
		Object[] input4 = new Object[1];
		input4[0] = "(//*[@class='_2NOVgj'])[1]";
		SeleniumOperations.clickOnElement(input4);

	}
	@When ("^user enter \"(.*)\" as username$")
	public void enterUname(String number)
	{
		Object[] input5 = new Object[2];
		input5[0] = "//*[@class='_2IX_2- VJZDxU']";
		input5[1] = number;
		SeleniumOperations.sendText(input5);

	}
	@When ("^user enter \"(.*)\" as password$")
	public void enterPassword(String key)
	{
		Object[] input6 = new Object[2];
		input6[0] = "//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1] = key;
		SeleniumOperations.sendText(input6);
	}
	@When ("^user click on login button$")
	public void clickLogin() throws InterruptedException
	{
		Object[] input7 = new Object[1];
		input7[0] = "(//*[@type='submit'])[2]";
		SeleniumOperations.clickOnElement(input7);
	}
	@Then ("^Applicaton shows user profile to user$")
	public void valid()
	{
		Object[] input8=new Object[2];
		input8[0]="//*[text()='yogesh sumbe']";
		input8[1]="yogesh sumbe";	
	}

}
