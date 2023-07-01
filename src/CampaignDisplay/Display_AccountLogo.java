package CampaignDisplay;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import CampaignSettings.Elements;

public class Display_AccountLogo {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		Elements _elements = new Elements();
		Robot robot = new Robot(); 
				
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new FirefoxDriver();
		//ebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browserLive);

		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");
	
		Thread.sleep(8000);		
		WebElement _email = driver.findElement
		(By.cssSelector(_login._email));
		Thread.sleep(200);
		_email.click();
		_email.sendKeys(_login._emailAccount);
		WebElement _password = driver.findElement
		(By.cssSelector(_login._password));
		_password.click();
		_password.sendKeys(_login._passwordAccount);
		WebElement _loginButton = driver.findElement
		(By.cssSelector(_login._loginButton));
		_loginButton.click();
		Thread.sleep(13000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(6000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Display Tab..");
		System.out.println("=====================================================");
		Thread.sleep(1500);
		WebElement _gotoDisplayTab = driver.findElement
		(By.cssSelector(_elements._gotoDisplayTab));
		Thread.sleep(1000);
		_gotoDisplayTab.click();
		
						//System.out.println("=====================================================");
						System.out.println("Navigate to Campagin Hosted Page ..");
						System.out.println("=====================================================");
						Thread.sleep(1500);
						WebElement _clickCampaignHostagePageLink = driver.findElement
						(By.cssSelector(_elements._clickCampaignHostagePageLink2));
						Thread.sleep(50);
						_clickCampaignHostagePageLink.click();
						Thread.sleep(3000);
						
						JavascriptExecutor jah = (JavascriptExecutor) driver;
						jah.executeScript("window.scrollBy(0,3000)", "");
						Thread.sleep(500);
						JavascriptExecutor jah1= (JavascriptExecutor) driver;
						jah1.executeScript("window.scrollBy(0,3000)", "");
						
								WebElement _clickBrowseFileLogoButton = driver.findElement
								(By.cssSelector(_elements._clickBrowseFileLogoButton));
								Thread.sleep(50);
								_clickBrowseFileLogoButton.click();
								Thread.sleep(3000);
								
								//System.out.println("=====================================================");
								System.out.println("Upload logo..");
								System.out.println("=====================================================");								
								robot.keyPress(KeyEvent.VK_TAB);
								Thread.sleep(100);
								robot.keyRelease(KeyEvent.VK_TAB);
								Thread.sleep(100);																			
								robot.keyPress(KeyEvent.VK_L);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_L);
								Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_O);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_O);
								Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_G);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_G);
								Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_O);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_O);
								Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_ENTER);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_ENTER);
								Thread.sleep(1000);
								//System.out.println("=====================================================");
								System.out.println("Mouse move to Logo and Click to Upload..");
								System.out.println("=====================================================");	
								robot.mouseMove(800, 320);
								robot.mousePress(KeyEvent.BUTTON1_MASK); 
								robot.delay(1000);
								robot.mouseRelease(KeyEvent.BUTTON1_MASK);
								robot.delay(4000);
								robot.keyPress(KeyEvent.VK_ENTER);
								Thread.sleep(2000);			
								
													WebElement _clickUploadImageButton = driver.findElement
													(By.cssSelector(_elements._clickUploadImageButton));
													Thread.sleep(50);
													_clickUploadImageButton.click();
													Thread.sleep(3000);
													
													WebElement _clickShowAccountLogoOnPageButton = driver.findElement
													(By.cssSelector(_elements._clickShowAccountLogoOnPageButton));
													Thread.sleep(50);
													_clickShowAccountLogoOnPageButton.click();
													Thread.sleep(2000);
												
								WebElement _clickSaveButton = driver.findElement
								(By.cssSelector(_elements._clickSaveButton));
								Thread.sleep(50);
								_clickSaveButton.click();
								Thread.sleep(5000);									
								JavascriptExecutor jah4 = (JavascriptExecutor) driver;
								jah4.executeScript("window.scrollBy(0,-2000)", "");
								Thread.sleep(1000);	
																			
										//System.out.println("=====================================================");
										System.out.println("Navigate to WidgetLink..");
										System.out.println("=====================================================");
										WebElement _clickWidgetLink = driver.findElement
										(By.cssSelector(_elements._clickCampaignHostagePageLink));
										Thread.sleep(200);
										_clickWidgetLink.click();
										Thread.sleep(10000);	
										
										//======================SWITCH TO NEW WINDOW==================================//			
										Set <String> handles = driver.getWindowHandles();		
										Iterator<String> it = handles.iterator();		
										String parentID = (String) it.next();
										String childID = (String) it.next();		
										driver.switchTo().window(childID);
										//=========================================================================//
										if(!handles.equals(parentID)) {	
											Thread.sleep(5000);	
											try{
												WebElement _acountLogo = driver.findElement
														(By.cssSelector(_elements._accountLogo));
														Thread.sleep(1000);
														System.out.println("=====================================================");
														System.out.println("Account Logo is Enabled..");
														System.out.println("=====================================================");
														File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
														try {
															//System.out.println("=====================================================");
															System.out.println("Taking Screenshot..");
															System.out.println("=====================================================");
														
												            FileUtils.copyFile(screenshotMid, 
															new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/DisplayAccountlogo/AccountlogoEnabled.png"));   	           
												            Thread.sleep(2000);
												                 	            
												        } catch (IOException e) {
												            System.out.println(e.getMessage());
												        }
											} 
											catch(NoSuchElementException e)
											{
												System.out.println("=====================================================");
												System.out.println("Account Logo is Disabled..");
												System.out.println("=====================================================");
												File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
												try {
													//System.out.println("=====================================================");
													System.out.println("Taking Screenshot..");
													System.out.println("=====================================================");
												
										            FileUtils.copyFile(screenshotMid, 
													new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/DisplayAccountlogo/AccountlogoDisabled.png"));   	           
										            Thread.sleep(2000);
										                 	            
										        } catch (IOException j) {
										            System.out.println(j.getMessage());
										        }
											} 
										}
																				
																																			
	}
	
	
	

}
