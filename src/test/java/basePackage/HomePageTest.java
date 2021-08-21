package basePackage;

import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import static basePackage.BaseTest.driver;

import com.beust.jcommander.Parameter;

import pageEvents.HomePageEvents;

public class HomePageTest extends BaseTest{
	HomePageEvents homePage=new HomePageEvents();
//	@Test
//	public void landingOnHomePage() throws InterruptedException {
//			driver.navigate().refresh();
//		  Thread.sleep(3000);
//			
//	}
	
//	@Test
//	public void actionClassFunction() {
//		 homePage.actionFunctions(); 
//		
//	}
	
	@Test
	public void pageRelatedFunction() {
		homePage.pageFunctions();
		Configuration config=null;
		try {
			config=new Configurations().properties(Thread.currentThread().getContextClassLoader().getResource("application.properties").getPath());
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(config.getProperty("browser"));
	}
	
	
	
}
