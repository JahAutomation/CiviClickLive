package CampaignSettings;

import org.apache.commons.io.FileUtils;
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
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class DeliverySettings_PetitionMode {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();

		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browserLive);

		// ==============================================================
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
		Thread.sleep(14000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(6000);

		WebElement _gotoSettingsTab = driver.findElement
		(By.cssSelector(_campaign._gotoSettingsTab));
		Thread.sleep(500);
		_gotoSettingsTab.click();
		Thread.sleep(500);
		
		WebElement _gotoDeliverySettingsTab = driver.findElement
		(By.cssSelector(_elements._gotoDeliverySettingsTab));
		Thread.sleep(100);
		_gotoDeliverySettingsTab.click();
		Thread.sleep(700);
				
		WebElement _clickPetitionModeButton = driver.findElement
		(By.cssSelector(_elements._clickPetitionModeButton));
		Thread.sleep(200);
		//_clickPetitionModeButton.click();
		Thread.sleep(1000);
										
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollBy(0,400)", "");
			
		WebElement _settings_SaveButton = driver.findElement
		(By.cssSelector(_campaign._settings_SaveButton));
		_settings_SaveButton.click();
		Thread.sleep(8000);
		WebElement _gotoPublishTab = driver.findElement
		(By.cssSelector(_campaign._gotoPublishTab));
		_gotoPublishTab.click();
		Thread.sleep(1000);

		JavascriptExecutor jah = (JavascriptExecutor) driver;
		jah.executeScript("window.scrollBy(0,2200)", "");
		
			File targets = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				System.out.println("=====================================================");
				System.out.println("Taking Screenshots..");
				System.out.println("=====================================================");
				Thread.sleep(500);		
	            FileUtils.copyFile(targets, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/DeliverySettings/PetitionTargets.png"));   									  
	            Thread.sleep(2000);
	                 	            
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }

		Thread.sleep(1000);
		WebElement _clickWidgetLink = driver.findElement
		(By.cssSelector(_campaign._clickWidgetLink));
		_clickWidgetLink.click();
		Thread.sleep(13000);

		//======================SWITCH TO NEW WINDOW==================================//			
		Set <String> handles = driver.getWindowHandles();		
		Iterator it = handles.iterator();		
		String parentID = (String) it.next();
		String childID = (String) it.next();		
		driver.switchTo().window(childID);
		//=========================================================================//			

		
		
		//===================================================W I D G E T   N E W   T A B =====================================================//		
		
		if(!handles.equals(parentID)) {			
			Thread.sleep(6000);
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
			
						WebElement _phoneNumber = driver.findElement
						(By.cssSelector(_campaign._phoneTextArea));
						_phoneNumber.click();
						_phoneNumber.sendKeys(_allText._constituentPhone);
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
			_emailTextArea.sendKeys(_allText._email);
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
			
							WebElement _stateButton = driver.findElement
							(By.cssSelector(_elements._constituentStateButton));
							_stateButton.click();			
							Thread.sleep(500);
			
								WebElement _stateButtonValue = driver.findElement
								(By.cssSelector(_elements._petitionStateButtonValue));
								_stateButtonValue.click();
								Thread.sleep(500);
			
									WebElement _ZIPTextArea = driver.findElement
									(By.cssSelector(_campaign._ZIPTextArea));
									_ZIPTextArea.click();
									_ZIPTextArea.sendKeys(_allText._ZIP);
									Thread.sleep(500);
			
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollBy(0,1000)", "");
									
			Thread.sleep(1000);			
			WebElement _clickSendMeTextMessageCheckbox = driver.findElement
			(By.cssSelector(_elements._sendMeTextMessageCheckbox));
			_clickSendMeTextMessageCheckbox.click();
			Thread.sleep(2000);
			
			System.out.println("=====================================================");
			System.out.println("Checking Petition Mode..");					
			System.out.println("=====================================================");
			Thread.sleep(500);
			
			String _checkSendMailButton = driver.findElement
			(By.cssSelector(_campaign._sendMailButton)).getAttribute("style");
			System.out.println(_checkSendMailButton);		
			Thread.sleep(5000);		

			// String _sendMailStyle1 = "background: none rgb(214, 36, 60); cursor: pointer;";
			 String _sendMailStyle2 = "background-color: rgb(144, 144, 144);";	
			if(!_checkSendMailButton.equals(_sendMailStyle2)){
					System.out.println("=====================================================");
					System.out.println("Send Email Button is enabled..");
					System.out.println("=====================================================");
					System.out.println("Peition mode is enabled..");
					System.out.println("=====================================================");
					System.out.println("Clicking Send Email Button..");
					System.out.println("=====================================================");	
					Thread.sleep(2000);		
					WebElement _clickSendMailButton = driver.findElement
					(By.cssSelector(_campaign._sendMailButton));
					Thread.sleep(1000);		
					_clickSendMailButton.click();
					Thread.sleep(8000);																																		
					WebElement _getSendEmailConfirmationMessage = driver.findElement
					(By.xpath(_elements._sendEmailConfirmationMessage));
					Thread.sleep(2000);		
					System.out.println("=====================================================");
					System.out.println(_getSendEmailConfirmationMessage.getText());
					System.out.println("=====================================================");

					File _petitonON = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					try {
						System.out.println("=====================================================");
						System.out.println("Taking Screenshots..");
						System.out.println("=====================================================");
						Thread.sleep(500);		
						FileUtils.copyFile(_petitonON, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotlive/DeliverySettings/Petition_ON.png"));   									  
						Thread.sleep(2000);
											
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
			}else {
					System.out.println("=====================================================");	
					System.out.println("Send Email Button is disabled..");
					System.out.println("=====================================================");
					System.out.println("Peition mode is disabled..");
					System.out.println("=====================================================");
					File _petitonOFF = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					try {
						System.out.println("=====================================================");
						System.out.println("Taking Screenshots..");
						System.out.println("=====================================================");
						Thread.sleep(500);		
						FileUtils.copyFile(_petitonOFF, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/DeliverySettings/Petition_OFF.png"));   									  
						Thread.sleep(2000);
											
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
			}
			
			
																																	
		}
					
	}

}
