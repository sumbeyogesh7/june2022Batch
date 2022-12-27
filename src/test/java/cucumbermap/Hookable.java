package cucumbermap;

import java.net.UnknownHostException;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;

public class Hookable {
	
	
	 @Before
	  public void before(Scenario scenario) throws UnknownHostException
	  {
		  HTMLReportGenerator.TestSuiteStart("E:\\Report\\flipkart.html", "Flipkart");
		  HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus().toString());
		  
		  System.out.println("-----------------------------Scenario Start------------------------");
	  }
	
	
	  @After
	  public void after(Scenario scenario)
	  {
		  System.out.println("-----------------------------Scenario End------------------------");
		  
		  HTMLReportGenerator.TestCaseEnd();
		  HTMLReportGenerator.TestSuiteEnd();
	  }
	

}
