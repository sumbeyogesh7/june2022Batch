package utility;

public class Calling
{
	public static void main(String[] args) throws InterruptedException {
		// browserLaunch
		Object[] input = new Object[2];
		input[0] = "chrome";
		input[1] = "E:\\testing\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);

		// openApplication
		Object[] input1 = new Object[1];
		input1[0] = "https://www.flipkart.com/";
		SeleniumOperations.openApplication(input1);

		// clickElement
		Object[] input2 = new Object[1];
		input2[0] = "//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);

		// mouseOver
		Object[] input3 = new Object[1];
		input3[0] = "//*[text()='Login']";
		SeleniumOperations.mouseOverAction(input3);

		// clickElement("(//*[@class='_2NOVgj'])[1]");
		Object[] input4 = new Object[1];
		input4[0] = "(//*[@class='_2NOVgj'])[1]";
		SeleniumOperations.clickOnElement(input4);

		Thread.sleep(5000);

		// enter username
		Object[] input5 = new Object[2];
		input5[0] = "//*[@class='_2IX_2- VJZDxU']";
		input5[1] = "8999663205";
		SeleniumOperations.sendText(input5);

		// enter password
		Object[] input6 = new Object[2];
		input6[0] = "//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1] = "yoges";
		SeleniumOperations.sendText(input6);
		// enter login
		Object[] input7 = new Object[1];
		input7[0] = "(//*[@type='submit'])[2]";
		SeleniumOperations.clickOnElement(input7);

		//error msg
		//Object[] input7 = new Object[1];
			//input7[0]="//*[text()='Your username or password is incorrect']";
			//input7[1]="Your username or password is incorrect\r\n";		
			//SeleniumOperations.
		//input7[0]= 
	}
}