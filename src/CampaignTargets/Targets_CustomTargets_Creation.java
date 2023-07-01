package CampaignTargets;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;
import CampaignDataCreation.AllTextInputs;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.awt.Robot;
import CampaignSettings.Elements;

public class Targets_CustomTargets_Creation {

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
		driver.get(_browser._browserLive);

		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");

		Thread.sleep(7000);
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
		Thread.sleep(12000);

		WebElement _clickPublishedData = driver.findElement
		(By.cssSelector(_campaign._petition_ClickDataPublishedStatusEditButton));
		_clickPublishedData.click();
		Thread.sleep(6000);

		//System.out.println("=====================================================");
		System.out.println("Navigate to Targets Tab..");
		System.out.println("=====================================================");
		Thread.sleep(3000);
		WebElement _gotoTargetsTab = driver.findElement
		(By.cssSelector(_elements._gotoTargetsTab));
		Thread.sleep(3000);
		_gotoTargetsTab.click();
		Thread.sleep(500);
		_gotoTargetsTab.click();
		Thread.sleep(500);
		_gotoTargetsTab.click();
		Thread.sleep(4000);
		File _congressMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot - Targets Congress Page..");
								System.out.println("=====================================================");	
								Thread.sleep(3000);					
								FileUtils.copyFile(_congressMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CustomTargets_Creation/CongressMainPage.png"));   	           
								Thread.sleep(2000);												
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}
				Thread.sleep(500);
				//System.out.println("=====================================================");
				System.out.println("Click Custom targets Tab..");
				System.out.println("=====================================================");
				WebElement _gotoCustomTargtesTab = driver.findElement
				(By.cssSelector(_elements._customTargetsTab));
				Thread.sleep(1000);
				_gotoCustomTargtesTab.click();
				Thread.sleep(9000);

							//System.out.println("=====================================================");
							System.out.println("Click Manage Custom Targets..");
							System.out.println("=====================================================");
							WebElement _clickManageCustomTargets = driver.findElement
							(By.cssSelector(_elements._manageCustomTargets));
							Thread.sleep(1000);
							_clickManageCustomTargets.click();
							Thread.sleep(4000);
		
				//System.out.println("=====================================================");
				System.out.println("Click Create Custom Targets Button..");
				System.out.println("=====================================================");
				WebElement _clickCreate = driver.findElement
				(By.cssSelector(_elements._createButton));
				Thread.sleep(500);
				_clickCreate.click();
				Thread.sleep(2000);

							File jah = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screeshot - Fill up all fields Area..");
								System.out.println("=====================================================");	
								Thread.sleep(3000);					
								FileUtils.copyFile(jah, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CustomTargets_Creation/Fill_Up_Area.png"));   	           
								Thread.sleep(2000);												
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}

				WebElement _constituency = driver.findElement
				(By.cssSelector(_elements._creationConstituency));
				Thread.sleep(500);
				_constituency.click();							
				Thread.sleep(100);

				WebElement _city = driver.findElement
				(By.cssSelector(_elements._creationCity));
				Thread.sleep(500);
				_city.click();
				_city.clear();
				_city.sendKeys(_allText._customCreationCity);
				Thread.sleep(500);

							WebElement _state = driver.findElement
							(By.cssSelector(_elements._creationState));
							Thread.sleep(500);
							_state.click();							
							Thread.sleep(100);					

										WebElement _name = driver.findElement
										(By.cssSelector(_elements._creationName));
										Thread.sleep(500);
										_name.click();		
										_name.clear();
										_name.sendKeys(_allText._customCreationName);			
										Thread.sleep(100);	

												WebElement _position = driver.findElement
												(By.cssSelector(_elements._creationPosition));
												Thread.sleep(500);
												_position.click();		
												_position.clear();
												_position.sendKeys(_allText._customCreationPosition);			
												Thread.sleep(100);	

														WebElement _creationEmail = driver.findElement
														(By.cssSelector(_elements._creationEmail));
														Thread.sleep(500);
														_creationEmail.click();		
														_creationEmail.clear();
														_creationEmail.sendKeys(_allText._customCreationEmail);			
														Thread.sleep(100);	

																// WebElement _creationPhone= driver.findElement
																// (By.cssSelector(_elements._creationPhone));
																// Thread.sleep(500);
																// _creationPhone.click();		
																// _creationPhone.clear();
																// _creationPhone.sendKeys(_allText._customCreationPhone);			
																// Thread.sleep(100);	

																		WebElement _createButton = driver.findElement
																		(By.cssSelector(_elements._customCreateButton));
																		Thread.sleep(500);
																		_createButton.click();							
																		Thread.sleep(5000);	
							
							File jah1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot Contact Created..");
								System.out.println("=====================================================");	
								Thread.sleep(3000);					
								FileUtils.copyFile(jah1, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CustomTargets_Creation/ContactsCreated.png"));   	           
								Thread.sleep(2000);												
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}
						
												
	}
		

}
