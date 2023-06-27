package CampaignDisplay;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;

import CampaignDataCreation.AllTextInputs;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import CampaignSettings.Elements;

public class Display_ImageBackgroud_Style {

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
						jah.executeScript("window.scrollBy(0,1200)", "");
						//System.out.println("=====================================================");
						System.out.println("Upload Image Backgroud..");
						System.out.println("=====================================================");
						Thread.sleep(1200);
						WebElement _clickBrowseButton = driver.findElement
						(By.cssSelector(_elements._browseButton));
						Thread.sleep(50);
						_clickBrowseButton.click();
						Thread.sleep(1500);
						
						//System.out.println("=====================================================");
								System.out.println("Upload Background picture..");
								System.out.println("=====================================================");								
								robot.keyPress(KeyEvent.VK_TAB);
								Thread.sleep(100);
								robot.keyRelease(KeyEvent.VK_TAB);
								Thread.sleep(100);						
														
						robot.keyPress(KeyEvent.VK_D);
						Thread.sleep(50);
						robot.keyRelease(KeyEvent.VK_D);
						Thread.sleep(50);

								robot.keyPress(KeyEvent.VK_E);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_E);
								Thread.sleep(50);

						robot.keyPress(KeyEvent.VK_M);
						Thread.sleep(50);
						robot.keyRelease(KeyEvent.VK_M);
						Thread.sleep(50);

								robot.keyPress(KeyEvent.VK_O);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_O);
								Thread.sleep(50);

						robot.keyPress(KeyEvent.VK_N);
						Thread.sleep(50);
						robot.keyRelease(KeyEvent.VK_N);
						Thread.sleep(50);

								robot.keyPress(KeyEvent.VK_ENTER);
								Thread.sleep(50);
								robot.keyRelease(KeyEvent.VK_ENTER);
								Thread.sleep(1000);
								//System.out.println("=========================================================");
								System.out.println("Mouse move to Background pciture and Click to Upload..");
								System.out.println("=======================================================");	
								robot.mouseMove(800, 385);
								robot.mousePress(KeyEvent.BUTTON1_MASK); 
								robot.delay(1000);
								robot.mousePress(KeyEvent.BUTTON1_MASK); 
								robot.delay(1000);
								robot.mouseRelease(KeyEvent.BUTTON1_MASK);
								robot.delay(1000);
								robot.mouseRelease(KeyEvent.BUTTON1_MASK);
								robot.delay(4000);

								robot.keyPress(KeyEvent.VK_ENTER);
								Thread.sleep(2000);		
								
												
						WebElement _clickUploadButton = driver.findElement
						(By.cssSelector(_elements._uploadButton));
						Thread.sleep(50);
						_clickUploadButton.click();
						Thread.sleep(2000);
						
						JavascriptExecutor jah2 = (JavascriptExecutor) driver;
						jah2.executeScript("window.scrollBy(0,-500)", "");
						//System.out.println("=====================================================");
						System.out.println("Searching BackGround Uploaded..");
						System.out.println("=====================================================");
						Thread.sleep(1200);
						WebElement _searchBackgroundTextBox = driver.findElement
						(By.cssSelector(_elements._searchTextArea));
						Thread.sleep(50);
						_searchBackgroundTextBox.click();
						_searchBackgroundTextBox.sendKeys(_allText._imageBackground);
						Thread.sleep(1500);
						JavascriptExecutor jah3 = (JavascriptExecutor) driver;
						jah3.executeScript("window.scrollBy(0,700)", "");

						robot.mouseMove(480, 600);
						robot.mousePress(KeyEvent.BUTTON1_MASK);
						robot.delay(500); // Click one second
						robot.mouseRelease(KeyEvent.BUTTON1_MASK);
						
						JavascriptExecutor jah4 = (JavascriptExecutor) driver;
						jah4.executeScript("window.scrollBy(0,-500)", "");
						//System.out.println("=====================================================");
						System.out.println("Set Background Style..");
						System.out.println("=====================================================");
						Thread.sleep(500);
						WebElement _clickImageBackgroundStyle = driver.findElement
						(By.cssSelector(_elements._clickImageBackgroundStyle));
						Thread.sleep(50);
						_clickImageBackgroundStyle.click();
						Thread.sleep(600);
						
								WebElement _clickSaveButton = driver.findElement
								(By.cssSelector(_elements._clickSaveButton));
								Thread.sleep(50);
								_clickSaveButton.click();
								Thread.sleep(4000);	
								
								JavascriptExecutor var = (JavascriptExecutor) driver;
								var.executeScript("window.scrollBy(0,-500)", "");
								Thread.sleep(500);	
																			
										//System.out.println("=====================================================");
										System.out.println("Checking BackGround Image in WidgetLink..");
										System.out.println("=====================================================");
										WebElement _clickWidgetLink = driver.findElement
										(By.cssSelector(_elements._clickCampaignHostagePageLink));
										Thread.sleep(50);
										_clickWidgetLink.click();
										Thread.sleep(13000);	
										
										//======================SWITCH TO NEW WINDOW==================================//			
										Set <String> handles = driver.getWindowHandles();		
										Iterator<String> it = handles.iterator();		
										String parentID = (String) it.next();
										String childID = (String) it.next();		
										driver.switchTo().window(childID);
										//=========================================================================//
										if(!handles.equals(parentID)) {	
											Thread.sleep(5000);	
												File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
												try {
													//System.out.println("=====================================================");
													System.out.println("Taking Screenshot..");
													System.out.println("=====================================================");
												
										            FileUtils.copyFile(screenshotMid, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/DisplayImageBackground/ImageBackground.png"));   	           
										            Thread.sleep(2000);
										                 	            
										        } catch (IOException j) {
										            System.out.println(j.getMessage());
										        }
										}
																				
																																			
	}
	
	
	

}
