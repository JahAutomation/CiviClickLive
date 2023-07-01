package CampaignTargets;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;
import CampaignDataCreation.AllTextInputs;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import CampaignSettings.Elements;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Targets_CustomTargets_BulkCreation {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		//AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		Robot robot = new Robot();
				
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browserLive);

		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");

		Thread.sleep(6000);
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
				System.out.println("Click Bulk Upload Custom Targets Button..");
				System.out.println("=====================================================");
				WebElement _clickBulkUpload = driver.findElement
				(By.cssSelector(_elements._bulkUploadCustomTargets));
				Thread.sleep(1000);
				_clickBulkUpload.click();
				Thread.sleep(5000);

				//System.out.println("=====================================================");
				System.out.println("Click Browse Button..");
				System.out.println("=====================================================");
				WebElement _clickBrowse = driver.findElement
				(By.cssSelector(_elements._browseFile));
				//Thread.sleep(1000);
				_clickBrowse.click();
				Thread.sleep(3000);

				//driver.get("/Users/jahsavaged/Downloads/Bulktargets.xlsx");
	
								System.out.println("Upload logo..");
								System.out.println("=====================================================");								
								robot.keyPress(KeyEvent.VK_TAB);
								Thread.sleep(100);
								robot.keyRelease(KeyEvent.VK_TAB);
								Thread.sleep(100);							
								robot.keyPress(KeyEvent.VK_B);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_B);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_U);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_U);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_L);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_L);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_K);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_K);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_T);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_T);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_A);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_A);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_R);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_R);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_G);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_G);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_E);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_E);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_T);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_T);
									Thread.sleep(50);
								robot.keyPress(KeyEvent.VK_S);
								Thread.sleep(50);
									robot.keyRelease(KeyEvent.VK_S);
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
							
						
												
	}
		

}
