package CampaignDisplay;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import CampaignSettings.Elements;

public class Display_CampaignTitleAndBody {

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
		Thread.sleep(1000);
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
								System.out.println("Input Campaign Page Title ..");
								System.out.println("=====================================================");
								Thread.sleep(3000);
								WebElement _inputCampaignPageTitle = driver.findElement
								(By.cssSelector(_elements._inputCampaignPageTitle));
								Thread.sleep(50);
								_inputCampaignPageTitle.click();
								_inputCampaignPageTitle.clear();
								_inputCampaignPageTitle.sendKeys(_allText._campaignPageTitle);
								Thread.sleep(500);
								
										//System.out.println("=====================================================");
										System.out.println("Input Campaign Page Body ..");
										System.out.println("=====================================================");
										Thread.sleep(1000);
										WebElement _inputCampaignPageBody = driver.findElement
										(By.cssSelector(_elements._inputCampaignPageBody));
										Thread.sleep(50);
										_inputCampaignPageBody.click();
										_inputCampaignPageBody.clear();
										_inputCampaignPageBody.sendKeys(_allText._campaignPageBody);
										Thread.sleep(500);
						
								WebElement _clickSaveButton = driver.findElement
								(By.cssSelector(_elements._clickSaveButton));
								Thread.sleep(50);
								_clickSaveButton.click();
								Thread.sleep(4000);	
								
								JavascriptExecutor jah4 = (JavascriptExecutor) driver;
								jah4.executeScript("window.scrollBy(0,-1300)", "");
								Thread.sleep(1000);	
																			
										//System.out.println("=====================================================");
										System.out.println("Navigate to WidgetLink..");
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
												
										            FileUtils.copyFile(screenshotMid, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/DisplayTitleAndBody/TitleAndBody.png"));   	           
										            Thread.sleep(2000);
										                 	            
										        } catch (IOException j) {
										            System.out.println(j.getMessage());
										        }
										}
																				
																																			
	}
	
	
	

}
