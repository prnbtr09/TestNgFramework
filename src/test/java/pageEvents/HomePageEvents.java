package pageEvents;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basePackage.BaseTest;

import static basePackage.BaseTest.driver;
import  basePackage.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;


public class HomePageEvents {
	ElementFetch fetch=new ElementFetch();
	public void clickHomePageOption() {

		fetch.getWebElement("xpath", HomePageElements.HOMEPAGEICON).click();
	}

	/*
	 * public void actionFunctions() {
	 * 
	 * 
	 * }
	 */



	public void pageFunctions() {
		//		//select one Radio button
		//		if(!(fetch.getWebElement("ID",HomePageElements.RADIOBUTTONID).isSelected())) {
		//			System.out.println("test");
		//			fetch.getWebElement("ID",HomePageElements.RADIOBUTTONID).click();		
		//		}else {
		//			System.out.println("already selected");
		//		}
		//		
		//		//select radio button one by one
		//		List<WebElement> carRadioButtons=fetch.getWebElements("xpath", HomePageElements.CARRADIOBUTTONSLIST);
		//		for(WebElement element: carRadioButtons) {
		//			element.click();
		//		}


		//		//handle window
		//		String parentWindowHandle=BaseTest.driver.getWindowHandle();
		//		fetch.getWebElement("xpath", HomePageElements.OPENWINDOWXPATH).click();
		//		Set<String> windowHandles=BaseTest.driver.getWindowHandles();
		//		
		//		for(String windowHandle:windowHandles) {
		//			
		//			
		//			if(!windowHandle.equals(parentWindowHandle)) {
		//				BaseTest.driver.switchTo().window(windowHandle);
		//				System.out.println(driver.getTitle());
		//				driver.close();
		//			}
		//		}



		//handle tabs
		/*
		 * String parentTabHandle=driver.getWindowHandle(); fetch.getWebElement("xpath",
		 * HomePageElements.OPENTABXPATH).click();
		 * 
		 * Set<String> windowTabHandles=driver.getWindowHandles();
		 * 
		 * 
		 * for(String windowTabHandle:windowTabHandles) {
		 * 
		 * 
		 * if(!windowTabHandle.equals(parentTabHandle)) {
		 * BaseTest.driver.switchTo().window(windowTabHandle);
		 * System.out.println(driver.getTitle()); driver.close(); } }
		 */


		/*
		 * //web table handle int rows= fetch.getWebElements("xpath",
		 * HomePageElements.WEBTABLEFIXROWS).size(); int
		 * columns=fetch.getWebElements("xpath",
		 * HomePageElements.WEBTABLEFIXCOLUMNS).size();
		 * 
		 * 
		 * 
		 * for(int row=2;row<=rows+1;row++) {
		 * 
		 * for(int column=1;column<=columns;column++) {
		 * System.out.println("cell value for row"+row+" and column "+column+"is "+fetch
		 * .getWebElement("xpath",
		 * String.format(HomePageElements.cellValues,row,column)).getText()); }
		 * 
		 * 
		 * }
		 */
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 5); //mousehover
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * 
		 * 
		 * WebElement mouseHover=fetch.getWebElement("xpath",
		 * HomePageElements.MOUSEHOVERELEMENT); WebElement
		 * elementVisibleAfterHOver=fetch.getWebElement("xpath", "//a[text()='Top']");
		 * 
		 * js.executeScript("arguments[0].scrollIntoView();", mouseHover); Actions
		 * action=new Actions(driver);
		 * 
		 * action.moveToElement(mouseHover).perform();
		 * System.out.println(wait.until(ExpectedConditions.visibilityOf(
		 * elementVisibleAfterHOver)).getText());
		 * wait.until(ExpectedConditions.visibilityOf(elementVisibleAfterHOver)).click()
		 * ;
		 * 
		 * System.out.println("test");
		 * 
		 */
		
			
		Dimension d = new Dimension(521,628);
		driver.manage().window().setSize(d);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
//		driver.switchTo().frame(fetch.getWebElement("xpath", "//iframe[@class='demo-frame lazyloaded']"));
//		WebElement sourceElement=fetch.getWebElement("xpath", "//*[text()='High Tatras 2']");
//		WebElement targetElement=fetch.getWebElement("xpath", "//div[@id='trash']");
//		
//		Actions action=new Actions(driver);
//		
//		Action builder=action.clickAndHold(sourceElement)
//							 .moveToElement(targetElement)
//							 .release(targetElement).build();
//
//		
//		
//		
//		builder.perform();
//		System.out.println("test");
//		
//		driver.switchTo().defaultContent();
		
//		Assert.assertTrue(fetch.getWebElement("xpath", "//img[@alt='GlobalSQA']").isDisplayed());
		System.out.println("test");
		js.executeScript("window.scrollBy(0,-500)");
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(-250,0)");
		
	}










}
