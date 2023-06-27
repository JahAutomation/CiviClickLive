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

import CampaignDataCreation.AllTextInputs;
import CampaignDataCreation.Browser;
import CampaignDataCreation.CampaignElements;
import CampaignDataCreation.LoginElements;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import CampaignSettings.Elements;

public class Targets_AllSearchFunctions {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws InterruptedException, AWTException {

		// ========================================================================//
		// AccountDetails account = new AccountDetails();
		CampaignElements _campaign = new CampaignElements();
		LoginElements _login = new LoginElements();
		Browser _browser = new Browser();
		AllTextInputs _allText = new AllTextInputs();
		Elements _elements = new Elements();
		//Robot robot = new Robot(); 
				
		System.setProperty(_browser._browserPath, _browser._chromeDriver);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browser);

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
		Thread.sleep(1000);
		WebElement _gotoTargetsTab = driver.findElement
		(By.cssSelector(_elements._gotoTargetsTab));
		Thread.sleep(1000);
		_gotoTargetsTab.click();
		Thread.sleep(1000);
		_gotoTargetsTab.click();
		Thread.sleep(5000);
		File _congressMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
							try {
								//System.out.println("=====================================================");
								System.out.println("Taking Screenshot - Targets Congress Page..");
								System.out.println("=====================================================");	
								Thread.sleep(3000);					
								FileUtils.copyFile(_congressMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/TargetsAllSearchFunction/CongressMainpage.png"));   	           
								Thread.sleep(2000);												
							} catch (IOException e) {
								System.out.println(e.getMessage());
							}						
								//System.out.println("=====================================================");
								System.out.println("Search Congress..");
								System.out.println("=====================================================");	
								WebElement _clickCongressSearchArea = driver.findElement
								(By.cssSelector(_elements._targets_SearhArea));
								Thread.sleep(500);
								_clickCongressSearchArea.click();
								_clickCongressSearchArea.clear();
								_clickCongressSearchArea.sendKeys(_allText._searchCongress);
								Thread.sleep(2000);
			
								//System.out.println("=====================================================");
								System.out.println("Click Search Button..");
								System.out.println("=====================================================");	
								WebElement _clickSearchButton = driver.findElement
								(By.cssSelector(_elements._searchButton));									
								_clickSearchButton.click();
								Thread.sleep(5000);
										File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
										try {
											//System.out.println("=====================================================");
											System.out.println("Taking Screenshot - Congress Search Result..");
											System.out.println("=====================================================");	
											Thread.sleep(3000);					
											FileUtils.copyFile(image, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/TargetsAllSearchFunction/Congress_SearchResults.png"));   	           
											Thread.sleep(2000);												
										} catch (IOException e) {
											System.out.println(e.getMessage());
										}
											//System.out.println("=====================================================");
											System.out.println("Click States Tab..");
											System.out.println("=====================================================");
											WebElement _gotoStatesTab = driver.findElement
											(By.cssSelector(_elements._statesTab));
											Thread.sleep(1000);
											_gotoStatesTab.click();
											Thread.sleep(8000);

											//System.out.println("=====================================================");
											System.out.println("Search States..");
											System.out.println("=====================================================");	
											WebElement _clickStateSearchArea = driver.findElement
											(By.cssSelector(_elements._targets_SearhArea));
											Thread.sleep(500);
											_clickStateSearchArea.click();
											_clickStateSearchArea.clear();
											_clickStateSearchArea.sendKeys(_allText._searchState);
											Thread.sleep(2000);
						
											//System.out.println("=====================================================");
											System.out.println("Click Search Button..");
											System.out.println("=====================================================");	
											WebElement _clickSearchButtonState = driver.findElement
											(By.cssSelector(_elements._searchButton));									
											_clickSearchButtonState.click();
											Thread.sleep(5000);
													File jah = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
													try {
														//System.out.println("=====================================================");
														System.out.println("Taking Screenshot - States Search Result..");
														System.out.println("=====================================================");	
														Thread.sleep(3000);					
														FileUtils.copyFile(jah, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/TargetsAllSearchFunction/States_SearchResults.png"));   	           
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
														System.out.println("Search States..");
														System.out.println("=====================================================");	
														WebElement _clickCustomSearchArea = driver.findElement
														(By.cssSelector(_elements._targets_SearhArea));
														Thread.sleep(500);
														_clickCustomSearchArea.click();
														_clickCustomSearchArea.clear();
														_clickCustomSearchArea.sendKeys(_allText._customState);
														Thread.sleep(2000);
									
														//System.out.println("=====================================================");
														System.out.println("Click Search Button..");
														System.out.println("=====================================================");	
														WebElement _clickSearchButtonCustom = driver.findElement
														(By.cssSelector(_elements._searchButton));									
														_clickSearchButtonCustom.click();
														Thread.sleep(5000);
																File jah1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																try {
																	//System.out.println("=====================================================");
																	System.out.println("Taking Screenshot - Custom Search Result..");
																	System.out.println("=====================================================");	
																	Thread.sleep(3000);					
																	FileUtils.copyFile(jah1, new File("/Users/jahsavaged/Desktop/CiviTestScreenshot/TargetsAllSearchFunction/Custom_SearchResults.png"));   	           
																	Thread.sleep(2000);												
																} catch (IOException e) {
																	System.out.println(e.getMessage());
																}

				}		

}
