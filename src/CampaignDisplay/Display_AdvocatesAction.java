package CampaignDisplay;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import CampaignDataCreation.AllTextInputs;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import CampaignSettings.Elements;

public class Display_AdvocatesAction {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		Robot robot = new Robot(); 
				
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");

		Thread.sleep(8000);
		WebElement _email = driver.findElement
		(By.cssSelector(_login._email));
		_email.click();
		_email.sendKeys(_login._emailAccount);
		WebElement _password = driver.findElement
		(By.cssSelector(_login._password));
		_password.click();
		_password.sendKeys(_login._passwordAccount);
		WebElement _loginButton = driver.findElement
		(By.cssSelector(_login._loginButton));
		_loginButton.click();
		Thread.sleep(12000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(6000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Display Tab..");
		System.out.println("=====================================================");
		WebElement _gotoDisplayTab = driver.findElement
		(By.cssSelector(_elements._gotoDisplayTab));
		Thread.sleep(1000);
		_gotoDisplayTab.click();
		Thread.sleep(2000);		
		
		WebElement _clickAdvocatesActionTextArea = driver.findElement
		(By.cssSelector(_elements._advocatesActionTextArea));
		Thread.sleep(1000);
		_clickAdvocatesActionTextArea.click();

				new Actions(driver)
                .keyDown(Keys.COMMAND)
                .sendKeys("a")
                .keyUp(Keys.COMMAND)
                .perform();	
				robot.keyPress(KeyEvent.VK_DELETE);
				Thread.sleep(50);
				 robot.keyRelease(KeyEvent.VK_DELETE);
			 	Thread.sleep(50);
					
				_clickAdvocatesActionTextArea.sendKeys(_allText._advocatesActionCounts);
				Thread.sleep(1000);				
				WebElement _clickShowProgressGoalCircle = driver.findElement
				(By.cssSelector(_elements._clickShowProgressGoalCircle));
				Thread.sleep(1000);
				_clickShowProgressGoalCircle.click();
				Thread.sleep(50);		
				
						WebElement _clickSaveButton = driver.findElement
						(By.cssSelector(_elements._clickSaveButton));
						Thread.sleep(50);
						_clickSaveButton.click();
						Thread.sleep(4000);	
					
							WebElement _clickFlag = driver.findElement
							(By.cssSelector(_elements._advocatesActionTextArea));
							Thread.sleep(500);
							_clickFlag.click();
							Thread.sleep(500);
							WebElement _clickCampaignHostagePage = driver.findElement
							(By.cssSelector(_elements._clickCampaignHostagePage));
							Thread.sleep(50);
							_clickCampaignHostagePage.click();
							Thread.sleep(1000);	
							
									WebElement _clickCampaignHostagePageLink = driver.findElement
									(By.cssSelector(_elements._clickCampaignHostagePageLink));
									Thread.sleep(50);
									_clickCampaignHostagePageLink.click();
									Thread.sleep(10000);	
									
									//======================SWITCH TO NEW WINDOW==================================//			
									Set <String> handles = driver.getWindowHandles();		
									Iterator<String> it = handles.iterator();		
									String parentID = (String) it.next();
									String childID = (String) it.next();		
									driver.switchTo().window(childID);
									//=========================================================================//			
									
									//===================================================W I D G E T   N E W   T A B =====================================================//												
									if(!handles.equals(parentID)) {	
										Thread.sleep(5000);	
										JavascriptExecutor jah = (JavascriptExecutor) driver;
										jah.executeScript("window.scrollBy(0,2200)", "");
										Thread.sleep(3000);													
												try{
													WebElement _checkGoalCircle_ONorOFF2 = driver.findElement
															(By.xpath(_elements._checkGoalCircle_ONorOFF));
															Thread.sleep(1000);
															System.out.println("=====================================================");
															System.out.println("Goal Circle is Enabled..");
															System.out.println("=====================================================");
															File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
															try {
																//System.out.println("=====================================================");
																System.out.println("Taking Screenshot..");
																System.out.println("=====================================================");
															
																FileUtils.copyFile(screenshotMid, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/DisplayAdvocatesAction/GoalCircleEnabled.png"));   	           
																Thread.sleep(2000);
																					
															} catch (IOException e) {
																System.out.println(e.getMessage());
															}
												} 
												catch(NoSuchElementException e)
												{
													System.out.println("=====================================================");
													System.out.println("Goal Circle is Disabled..");
													System.out.println("=====================================================");
													File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
													try {
														//System.out.println("=====================================================");
														System.out.println("Taking Screenshot..");
														System.out.println("=====================================================");
													
														FileUtils.copyFile(screenshotMid, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/DisplayAdvocatesAction/GoalCircleDisabled.png"));   	           
														Thread.sleep(2000);
																			
													} catch (IOException j) {
														System.out.println(j.getMessage());
													}
												} 
																																																									
													
									}
		
	}
	

}
