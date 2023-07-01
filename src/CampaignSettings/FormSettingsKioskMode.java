package CampaignSettings;

import org.apache.commons.io.FileUtils;
import ScreenShot.ScreenShotTestCompare_Top;
import ScreenShot.ScreenShotTestCompare_Mid;
import ScreenShot.ScreenShotTestCompare_Bot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import CampaignDataCreation.AllTextInputs;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class FormSettingsKioskMode {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ======================================================================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		Robot robot = new Robot();
		ScreenShotTestCompare_Top screenShot = new ScreenShotTestCompare_Top();
		ScreenShotTestCompare_Mid screenShotMid = new ScreenShotTestCompare_Mid();
		ScreenShotTestCompare_Bot screenShotBot = new ScreenShotTestCompare_Bot();
		
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browserLive);

		// ============================================================== L O G I N
		System.out.println("=====================================================");
		System.out.println("          K I O S K   M O D E   O N / O F F ");
		System.out.println("=====================================================");
		Thread.sleep(7000);
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
		Thread.sleep(5000);

		// robot.mouseMove(65, 330);
		// Thread.sleep(10000);

		WebElement _gotoSettingsTab = driver.findElement
		(By.cssSelector(_campaign._gotoSettingsTab));
		Thread.sleep(1000);
		_gotoSettingsTab.click();
		Thread.sleep(1000);
				
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,400)", "");
	
		WebElement _kioskModeButton = driver.findElement
		(By.cssSelector(_elements._kioskButton));
		_kioskModeButton.click();
		Thread.sleep(200);
				
		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(5000);
				
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-1400)", "");		
		
		WebElement _gotoDeliverySettingsTab = driver.findElement
		(By.cssSelector(_elements._gotoDeliverySettingsTab));
		Thread.sleep(100);
		_gotoDeliverySettingsTab.click();
		Thread.sleep(700);		
		
		WebElement _gotoPublishTab = driver.findElement
		(By.cssSelector(_campaign._gotoPublishTab));
		_gotoPublishTab.click();
		Thread.sleep(1000);

		JavascriptExecutor jah = (JavascriptExecutor) driver;
		jah.executeScript("window.scrollBy(0,1800)", "");
		
		Thread.sleep(1000);
		//System.out.println("=====================================================");
		System.out.println("Navigate to Widget Link..");
		System.out.println("=====================================================");
		Thread.sleep(1000);
		WebElement _clickWidgetLink = driver.findElement
		(By.cssSelector(_campaign._clickWidgetLink));
		_clickWidgetLink.click();
		Thread.sleep(13000);

		//======================SWITCH TO NEW WINDOW==================================//			
		Set <String> handles = driver.getWindowHandles();		
		Iterator<String> it = handles.iterator();		
		String parentID = (String) it.next();
		String childID = (String) it.next();		
		driver.switchTo().window(childID);
		//=========================================================================//			
				
		//===================================================W I D G E T   N E W   T A B =====================================================//		
		
		if(!handles.equals(parentID)) {
			
			Thread.sleep(4000);
			WebElement _widgetFirstName = driver.findElement
			(By.cssSelector(_campaign._widgetFirstname));
			_widgetFirstName.click();
			_widgetFirstName.sendKeys(_allText._widgetFirstName);
			
				Thread.sleep(500);
				WebElement _widgetLastName = driver.findElement
				(By.cssSelector(_campaign._widgetLastname));
				_widgetLastName.click();
				_widgetLastName.sendKeys(_allText._widgetLastName);
				Thread.sleep(500);
			
					Thread.sleep(500);
					WebElement _phoneNumber = driver.findElement
					(By.cssSelector(_campaign._phoneTextArea));
					_phoneNumber.click();
					_phoneNumber.sendKeys(_allText._phone);
					Thread.sleep(500);
			
						WebElement _testTextarea1 = driver.findElement
						(By.cssSelector(_campaign._testTextArea1));
						_testTextarea1.click();
						_testTextarea1.sendKeys(_allText._test);
						Thread.sleep(500);
												
							WebElement _testTextarea2 = driver.findElement
							(By.cssSelector(_campaign._testTextArea2));
							_testTextarea2.click();
							Thread.sleep(500);
			
								WebElement _testTextarea2_DropdownValue = driver.findElement
								(By.cssSelector(_campaign._testTextArea2_DropdownValue));
								_testTextarea2_DropdownValue.click();
								Thread.sleep(500);
						
			WebElement _emailTextArea = driver.findElement
			(By.cssSelector(_campaign._emailTextArea));
			_emailTextArea.click();
			_emailTextArea.sendKeys(_allText._kioskEmail);
			Thread.sleep(500);
			
				WebElement _addressTextArea = driver.findElement
				(By.cssSelector(_campaign._addressTextArea));
				_addressTextArea.click();
				_addressTextArea.sendKeys(_allText._address);
				Thread.sleep(500);
		
					WebElement _cityTextArea = driver.findElement
					(By.cssSelector(_campaign._cityTextArea));
					_cityTextArea.click();
					_cityTextArea.sendKeys(_allText._city);
					Thread.sleep(500);
			
						WebElement _stateTextArea = driver.findElement
						(By.cssSelector(_campaign._stateTextArea));
						_stateTextArea.click();
						_stateTextArea.sendKeys(_allText._state);
						Thread.sleep(500);
			
							WebElement _ZIPTextArea = driver.findElement
							(By.cssSelector(_campaign._ZIPTextArea));
							_ZIPTextArea.click();
							_ZIPTextArea.sendKeys(_allText._ZIP);
							Thread.sleep(500);
			
								JavascriptExecutor js5 = (JavascriptExecutor) driver;
								js5.executeScript("window.scrollBy(0,1000)", "");
									
									Thread.sleep(1000);			
									WebElement _clickSendMeTextMessageCheckbox = driver.findElement
									(By.cssSelector(_elements._sendMeTextMessageCheckbox));
									//_clickSendMeTextMessageCheckbox.click();
									Thread.sleep(5000);		
									
										WebElement _clickSendMailButton = driver.findElement
										(By.cssSelector(_campaign._sendMailButton));
										_clickSendMailButton.click();
										Thread.sleep(10000);
									
			//WebElement _sendEmailConfirmationMessage = driver.findElement(By.xpath(_elements._sendEmailConfirmationMessage));
			WebElement _getSendEmailConfirmationMessage = driver.findElement
			(By.xpath(_elements._sendEmailConfirmationMessage));
			Thread.sleep(1000);
			
				if(_getSendEmailConfirmationMessage.isEnabled()) {
					Thread.sleep(1000);
					String _confirmationMessage = _getSendEmailConfirmationMessage.getText();
					System.out.println("=====================================================");
					System.out.println("Email successfully sent..");
					System.out.println("=====================================================");
					System.out.println(_confirmationMessage);
					System.out.println("=====================================================");
					Thread.sleep(2000);
					WebElement _flag2 = driver.findElement
					(By.cssSelector(_campaign._flag2));
					_flag2.click();
					Thread.sleep(2000);
					}else {
						System.out.println("=====================================================");
						System.out.println("Please fill up the required fields..");
						System.out.println("=====================================================");
					}						
						
							System.out.println("Checking above details for KIOSK Mode activation..");
							System.out.println("=====================================================");
							String var = _widgetFirstName.getText();		
							JavascriptExecutor jah1 = (JavascriptExecutor) driver;
							jah1.executeScript("window.scrollBy(0,-600)", "");
							System.out.println(var);
							System.out.println("=====================================================");
							 Thread.sleep(2000);
							File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
							try {			                  
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot..");
								System.out.println("=====================================================");      
								FileUtils.copyFile(screenshot, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/FormSettings/KioskScreenshot1.png"));   
					            //screenShot.main(args);
					            Thread.sleep(2000);
					                 	            
					        } catch (IOException e) {
					            System.out.println(e.getMessage());
					        }
				
									// Thread.sleep(4000);
									// JavascriptExecutor jah2 = (JavascriptExecutor) driver;
									// jah2.executeScript("window.scrollBy(0,2400)", "");
									// WebElement _flag3 = driver.findElement
									// (By.cssSelector(_campaign._emailTextArea));
									// _flag3.click();
									// Thread.sleep(2000);
									// File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
									// try {
							                       
							        //     FileUtils.copyFile(screenshotMid, new File("C:\\CiviTestScreenshot\\MidScreenshot_ActualImage.png"));   
							        //     //screenShotMid.main(args);
							        //     Thread.sleep(2000);
							                 	            
							        // } catch (IOException e) {
							        //     System.out.println(e.getMessage());
							        // }
				
											Thread.sleep(4000);
											JavascriptExecutor jah3 = (JavascriptExecutor) driver;
											jah3.executeScript("window.scrollBy(0,2400)", "");
											WebElement _flag5 = driver.findElement
											(By.cssSelector(_campaign._ZIPTextArea));
											_flag5.click();
											Thread.sleep(2000);
											File screenshotBot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
											try {
									        	 //System.out.println("=====================================================");
												System.out.println("Taking Screenshot..");
												System.out.println("=====================================================");             
									            FileUtils.copyFile(screenshotBot, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/FormSettings/KioskScreenshot2.png"));   
									            //screenShotBot.main(args);
									            Thread.sleep(2000);
									                 	            
									        } catch (IOException e) {
									            System.out.println(e.getMessage());
									        }
				
				
			}
					
				
		}
		
			

	}


