package CampaignDataCreation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 
public class CampaginDataCreation {

	public static void main(String args[]) throws InterruptedException, AWTException {
		
		//======================================================================================================================//		
		// AccountDetails account = new AccountDetails();
		LoginElements _login = new LoginElements();
		CampaignElements _campaign = new CampaignElements();
		AllTextInputs _allTextInputs = new AllTextInputs();
		Browser _browser = new Browser();
		Robot robot = new Robot(); 

		System.setProperty(_browser._browserPath, _browser._chromeDriver);			
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);
		String _var1 = "";
		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");
		//============================================================== L O G I N =================================================//
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
		Thread.sleep(11000);	
		
		// robot.keyPress(KeyEvent.VK_ESCAPE);
		// Thread.sleep(50);
		// robot.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(50);
		// WebElement _loginXButton = driver.findElement
		// (By.cssSelector(_login._loginXButton));
		// _loginXButton.click();
		// Thread.sleep(15000);	

		
		//================================================= C A M P A I G N   C R E A T I O N ==============================================//		
		WebElement _createCampaign = driver.findElement
		(By.cssSelector(_campaign._createCampaign));
		_createCampaign.click();
		Thread.sleep(5000);

			WebElement _campaignNameTextArea = driver.findElement
			(By.xpath(_campaign._campaignNameTextArea));
			_campaignNameTextArea.click();
			_campaignNameTextArea.sendKeys(_allTextInputs._campaignName_Value);
			Thread.sleep(3000);
		
				WebElement _campaignType_Regulatory = driver.findElement
				(By.cssSelector(_campaign._campaignType_Regulatory));
				_campaignType_Regulatory.click();
				Thread.sleep(300);
		
					WebElement _campaignType_Legislative = driver.findElement
					(By.cssSelector(_campaign._campaignType_Legislative));
					_campaignType_Legislative.click();
					Thread.sleep(200);
		
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,250)", "");
						JavascriptExecutor js1 = (JavascriptExecutor) driver;
						js1.executeScript("window.scrollBy(0,250)", "");
						Thread.sleep(300);

							WebElement _clickSide = driver.findElement
							(By.cssSelector(_campaign._campaignType_ClickWhitePortion));
							_clickSide.click();
							System.out.println("=====================================================");
							System.out.println("Clicking Any white");
							System.out.println("=====================================================");
							Thread.sleep(300);
							System.out.println("checking create button if visible");
							System.out.println("=====================================================");
							System.out.println("Clicking create button");
							System.out.println("=====================================================");
							Thread.sleep(200);
							WebElement _campaignCreateButton = driver.findElement
							(By.cssSelector(_campaign._createButton));
							_campaignCreateButton.click();
							Thread.sleep(6000);

								WebElement _widgetTextArea = driver.findElement
								(By.cssSelector(_campaign._basic_Content_WdigetTitle_TextArea));
								Thread.sleep(200);
								_widgetTextArea.click();
								_widgetTextArea.sendKeys(_allTextInputs._basic_Content_WdigetTitle_TextAreaInput);
								Thread.sleep(2000);
								WebElement _nextButton = driver.findElement
								(By.cssSelector(_campaign._nextButton));
								Thread.sleep(100);
								_nextButton.click();

								Thread.sleep(5000);
								WebElement _widgetQ_UseQuestionButton = driver.findElement
								(By.cssSelector(_campaign._widgetQ_UseQ));
								_widgetQ_UseQuestionButton.click();
								Thread.sleep(1000);
		
								WebElement _widgetQ_UseQ_CancelButton = driver.findElement
								(By.cssSelector(_campaign._widgetQ_UseQ_CancelButton));
								Thread.sleep(300);
								_widgetQ_UseQ_CancelButton.click();
								Thread.sleep(2700);
		
		//=================================================== S H O R T   T E X T ===================================================//		
		WebElement _widgetQ_CreateQ = driver.findElement
		(By.cssSelector(_campaign._widgetQ_CreateQ));
		_widgetQ_CreateQ.click();
		Thread.sleep(200);
		
			WebElement _CreateQ_Input = driver.findElement
			(By.cssSelector(_campaign._createQ_TextArea));
			_CreateQ_Input.click();
			_CreateQ_Input.sendKeys(_allTextInputs._createQ_Input);
			Thread.sleep(6000);
		
				WebElement _CreateQ_Input_CreateButton = driver.findElement
				(By.cssSelector(_campaign._createQ_TextArea_CreateButton));
				_CreateQ_Input_CreateButton.click();
				Thread.sleep(200);

		//=================================================== D R O P D O W N =====================================================//			
					Thread.sleep(4000);
					WebElement _widgetQ_CreateQ_Dropdown= driver.findElement
					(By.cssSelector(_campaign._widgetQ_CreateQ_Dropdown));
					_widgetQ_CreateQ_Dropdown.click();
					Thread.sleep(200);
			
						WebElement _widgetQ_CreateQ_Dropdown_Button = driver.findElement
						(By.cssSelector(_campaign._widgetQ_CreateQ_Dropdown_Button));
						_widgetQ_CreateQ_Dropdown_Button.click();
						Thread.sleep(200);
		
							WebElement _CreateQ_Input_Dropdown = driver.findElement
							(By.cssSelector(_campaign._widgetQ_CreateQ_Dropdown_TextArea));
							_CreateQ_Input_Dropdown.click();
							_CreateQ_Input_Dropdown.sendKeys(_allTextInputs._createQ_Input);
							Thread.sleep(200);
		
								WebElement _dropdownAddOptionTextArea = driver.findElement
								(By.cssSelector(_campaign._dropdownAddOption_TextArea));
								_dropdownAddOptionTextArea.click();
								_dropdownAddOptionTextArea.sendKeys(_allTextInputs._createQ_Input);
								Thread.sleep(200);
			
									WebElement _dropdownAddNewOption = driver.findElement
									(By.cssSelector(_campaign._dropdownAddNewOption_Button));
									_dropdownAddNewOption.click();
									Thread.sleep(3000);
		
										WebElement _dropdownAddNewOption_TextArea = driver.findElement
										(By.cssSelector(_campaign._dropdownAddNewOption_TextArea));
										_dropdownAddNewOption_TextArea.click();
										_dropdownAddNewOption_TextArea.sendKeys(_allTextInputs._createQ_Input);
										Thread.sleep(200);
		
											WebElement _CreateQ_Input_Dropdown_CreateButton = driver.findElement
											(By.cssSelector(_campaign._createQ_TextArea_CreateButton));
											_CreateQ_Input_Dropdown_CreateButton.click();
											Thread.sleep(2000);		
			
		//=================================================== R A D I O =====================================================//			
		Thread.sleep(2000);
		WebElement _widgetQ_CreateQ_Radio= driver.findElement
		(By.cssSelector(_campaign._widgetQ_CreateQ));
		_widgetQ_CreateQ_Radio.click();
		Thread.sleep(200);
			
			Thread.sleep(1500);
			WebElement _widgetQ_CreateQ_RadioButton= driver.findElement
			(By.cssSelector(_campaign._widgetQ_CreateQ_RadioButton));
			_widgetQ_CreateQ_RadioButton.click();
			Thread.sleep(200);
		
				WebElement _radioTextArea = driver.findElement
				(By.cssSelector(_campaign._radio_TextArea));
				_radioTextArea.click();
				_radioTextArea.sendKeys(_allTextInputs._createQ_Input);
				Thread.sleep(200);
		
					WebElement _radioAddOptionTextArea = driver.findElement
					(By.cssSelector(_campaign._radio_AddOptionTextArea));
					_radioAddOptionTextArea.click();
					_radioAddOptionTextArea.sendKeys(_allTextInputs._createQ_Input);
					Thread.sleep(200);
		
						WebElement _radioAddNewOptionButton = driver.findElement
						(By.cssSelector(_campaign._radio_AddNewOptionButton));
						_radioAddNewOptionButton.click();
						Thread.sleep(4500);
		
							WebElement _radioAddNewOptionTextArea = driver.findElement
							(By.cssSelector(_campaign._radio_AddNewOptionTextArea));
							_radioAddNewOptionTextArea.click();
							_radioAddNewOptionTextArea.sendKeys(_allTextInputs._createQ_Input);
							Thread.sleep(200);
			
								WebElement _CreateQ_Input_Radio_CreateButton = driver.findElement
								(By.cssSelector(_campaign._createQ_TextArea_CreateButton));
								_CreateQ_Input_Radio_CreateButton.click();
								Thread.sleep(200);	
		
		//=================================================== C H E C K B O X =====================================================//				
		Thread.sleep(2000);
		WebElement _widgetQ_CreateQ_CheckBox= driver.findElement
		(By.cssSelector(_campaign._widgetQ_CreateQ));
		_widgetQ_CreateQ_CheckBox.click();
		Thread.sleep(200);
		
			Thread.sleep(1500);
			WebElement _widgetQ_CreateQ_CheckBoxButton= driver.findElement
			(By.cssSelector(_campaign._widgetQ_CreateQ_CheckBoxButton));
			_widgetQ_CreateQ_CheckBoxButton.click();
			Thread.sleep(200);
		
				WebElement _checkBoxTextArea = driver.findElement
				(By.cssSelector(_campaign._checkBox_TextArea));
				_checkBoxTextArea.click();
				_checkBoxTextArea.sendKeys(_allTextInputs._createQ_Input);
				Thread.sleep(200);
		
					WebElement _checkBoxAddOptionTextArea = driver.findElement
					(By.cssSelector(_campaign._checkBox_AddOptionTextArea));
					_checkBoxAddOptionTextArea.click();
					_checkBoxAddOptionTextArea.sendKeys(_allTextInputs._createQ_Input);
					Thread.sleep(200);
		
						WebElement _checkBoxAddNewOptionButton = driver.findElement
						(By.cssSelector(_campaign._checkBox_AddNewOptionButton));
						_checkBoxAddNewOptionButton.click();
						Thread.sleep(3000);
		
							WebElement _checkBoxAddNewOptionTextArea = driver.findElement
							(By.cssSelector(_campaign._checkBox_AddNewOptionTextArea));
							_checkBoxAddNewOptionTextArea.click();
							_checkBoxAddNewOptionTextArea.sendKeys(_allTextInputs._createQ_Input);
							Thread.sleep(500);
		
								WebElement _CreateQ_Input_CheckBox_CreateButton = driver.findElement
								(By.cssSelector(_campaign._createQ_TextArea_CreateButton));
								_CreateQ_Input_CheckBox_CreateButton.click();
								Thread.sleep(3000);	
		
									JavascriptExecutor js3 = (JavascriptExecutor) driver;
									js3.executeScript("window.scrollBy(0,220)", "");
									Thread.sleep(1000);	
			
										WebElement _content_nextButton = driver.findElement
										(By.cssSelector(_campaign._contentNextButton));
										Thread.sleep(100);
										_content_nextButton.click();
		
		//=================================================== E M A I L   C O N T E N T =====================================================//				
		Thread.sleep(3500);
		WebElement _emailSubjectCheckBox = driver.findElement
		(By.cssSelector(_campaign._emailSubjectCheckBox));
		Thread.sleep(500);
		_emailSubjectCheckBox.click();
		Thread.sleep(200);
		
			WebElement _emailBodyCheckBox = driver.findElement
			(By.cssSelector(_campaign._emailBodyCheckBox));
			Thread.sleep(500);
			_emailBodyCheckBox.click();
			Thread.sleep(200);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,230)", "");
		
				WebElement _addSectionButton = driver.findElement
				(By.cssSelector(_campaign._addSectionButton));
				Thread.sleep(200);
				_addSectionButton.click();
				Thread.sleep(2000);
		
					JavascriptExecutor js7 = (JavascriptExecutor) driver;
					js7.executeScript("window.scrollBy(0,230)", "");
			
						WebElement _generateAlternate = driver.findElement
						(By.cssSelector(_campaign._generateAlternate));
						Thread.sleep(200);
						_generateAlternate.click();
						Thread.sleep(3000);
		
							JavascriptExecutor js6 = (JavascriptExecutor) driver;
							js6.executeScript("window.scrollBy(0,230)", "");
							Thread.sleep(200);
							WebElement _generateAlternateButton = driver.findElement
							(By.cssSelector(_campaign._generateAlternateButton));
							Thread.sleep(200);
							_generateAlternateButton.click();
							Thread.sleep(5000);
		
								JavascriptExecutor js8 = (JavascriptExecutor) driver;
								js8.executeScript("window.scrollBy(0,-250)", "");
		
									Thread.sleep(200);
									WebElement _generateAlternateCloseButton = driver.findElement
									(By.cssSelector(_campaign._generateAlternateCloseButton));
									_generateAlternateCloseButton.click();
									Thread.sleep(1000);
										
										WebElement _emailContent_SaveButton = driver.findElement
										(By.cssSelector(_campaign._emailContentSaveButton));
										Thread.sleep(100);
										_emailContent_SaveButton.click();
										Thread.sleep(7000);
										WebElement _clickFlag = driver.findElement
										(By.cssSelector(_campaign._flag));
										Thread.sleep(200); 
										_clickFlag.click();
										Thread.sleep(6000);
										WebElement _emailContent_PreviewCloseButton = driver.findElement
										(By.cssSelector(_campaign._emailContentPreviewButton));
										_emailContent_PreviewCloseButton.click();
										Thread.sleep(6000);
		
		WebElement _gotoEmailLegislatorArea1 = driver.findElement
		(By.xpath(_campaign._gotoSubjectArea));
		_gotoEmailLegislatorArea1.click();		
		 _var1 = _gotoEmailLegislatorArea1.getAttribute("placeholder");

			WebElement _gotoDearOfficialTextArea = driver.findElement
			(By.xpath(_campaign._gotoSubjectArea));
			_gotoDearOfficialTextArea.click();

				System.out.println("Subject Value: " +_var1);	
				System.out.println("=====================================================");
				Thread.sleep(1000);
		
					WebElement _backToDashboard = driver.findElement
					(By.cssSelector(_campaign._backToDashboardButton));
					_backToDashboard.click();
					Thread.sleep(1000);
						
						WebElement _backToDashboardYesNoButton = driver.findElement
						(By.cssSelector(_campaign._backToDashboardYesNoButton));
						_backToDashboardYesNoButton.click();
						Thread.sleep(15000);
		
							File screenshotMid = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot..");
								System.out.println("=====================================================");
							
					            FileUtils.copyFile(screenshotMid, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/CampaignCreation/NewCampaignCreated.png"));   	           
					            Thread.sleep(2000);
					                 	            
					        } catch (IOException j) {
					            System.out.println(j.getMessage());
					        }
		
	}
	
	

}
