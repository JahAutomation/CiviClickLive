package CampaignDataCreation;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import CampaignSettings.Elements;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 

public class CampaginDuplicateData {

	public static void main(String args[]) throws InterruptedException, AWTException {
		
		//======================================================================================================================//		
		LoginElements _login = new LoginElements();
		CampaignElements _campaign = new CampaignElements();
		//AllTextInputs _allTextInputs = new AllTextInputs();
		Browser _browser = new Browser();
		Elements _elements = new Elements();

		System.setProperty(_browser._browserPath, _browser._chromeDriver);			
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get(_browser._browserLive);
		
		// ==============================================================
		System.out.println("=====================================================");
		System.out.println("Log In..");
		System.out.println("=====================================================");
		//============================================================== L O G I N =================================================//
		Thread.sleep(9000);
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
				File _campaignMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						try {
							//System.out.println("=====================================================");
							System.out.println("Taking Screenshot ..");
							System.out.println("=====================================================");
							FileUtils.copyFile(_campaignMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/MainPage.png"));   	           
							Thread.sleep(2000);			
						} catch (IOException j) {
							System.out.println(j.getMessage());
						}
							//System.out.println("=====================================================");
							System.out.println("ClickData ..");
							System.out.println("=====================================================");
								WebElement _clickPublishedData = driver.findElement
								(By.cssSelector(_campaign._clickDataPublishedStatusEditButton));
								_clickPublishedData.click();
								Thread.sleep(5000);
									File _basicPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
											try {
												//System.out.println("=====================================================");
												System.out.println("Taking Screenshot ..");
												System.out.println("=====================================================");
												FileUtils.copyFile(_basicPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/BasicPage.png"));   	           
												Thread.sleep(2000);					
											} catch (IOException j) {
												System.out.println(j.getMessage());
											}

										//System.out.println("=====================================================");
										System.out.println("Navigate to Content Tab..");
										System.out.println("=====================================================");
										WebElement _clickContentTab = driver.findElement
										(By.cssSelector(_elements._gotoContentTab));
										Thread.sleep(1000);
										_clickContentTab.click();
										Thread.sleep(2000);		
											File _contentMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
													try {
														//System.out.println("=====================================================");
														System.out.println("Taking Screenshot ..");
														System.out.println("=====================================================");
														FileUtils.copyFile(_contentMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/Content_MainPage.png"));   	           
														Thread.sleep(2000);			
													} catch (IOException j) {
														System.out.println(j.getMessage());
													}
										
												//System.out.println("=====================================================");
												System.out.println("Next Button..");
												System.out.println("=====================================================");
												WebElement _clickNextButton = driver.findElement
												(By.cssSelector(_elements._nextButton));
												Thread.sleep(500);
												_clickNextButton.click();
												Thread.sleep(6000);		
													File _widgetMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
															try {
																//System.out.println("=====================================================");
																System.out.println("Taking Screenshot ..");
																System.out.println("=====================================================");
																FileUtils.copyFile(_widgetMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/WidgetContent_MainPage.png"));   	           
																Thread.sleep(2000);				
															} catch (IOException j) {
																System.out.println(j.getMessage());
															}

														//System.out.println("=====================================================");
														System.out.println("Next Button..");
														System.out.println("=====================================================");
														WebElement _clickNextButton2 = driver.findElement
														(By.cssSelector(_elements._nextButton));
														Thread.sleep(500);
														_clickNextButton2.click();
														Thread.sleep(4000);		
															File _emailContentMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																	try {
																		//System.out.println("=====================================================");
																		System.out.println("Taking Screenshot ..");
																		System.out.println("=====================================================");
																		FileUtils.copyFile(_emailContentMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/EmailContent_MainPage.png"));   	           
																		Thread.sleep(2000);				
																	} catch (IOException j) {
																		System.out.println(j.getMessage());
																	}

																//System.out.println("=====================================================");
																System.out.println("Next Button..");
																System.out.println("=====================================================");
																WebElement _clickNextButton3= driver.findElement
																(By.cssSelector(_elements._nextButton));
																Thread.sleep(500);
																_clickNextButton3.click();
																Thread.sleep(6000);	
																	File _settingsMainPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																		try {
																			//System.out.println("=====================================================");
																			System.out.println("Taking Screenshot ..");
																			System.out.println("=====================================================");
																			FileUtils.copyFile(_settingsMainPage, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/Settings_MainPage.png"));   	           
																			Thread.sleep(2000);				
																		} catch (IOException j) {
																			System.out.println(j.getMessage());
																		}

																		//System.out.println("=====================================================");
																		System.out.println("Back to Dashboard ..");
																		System.out.println("=====================================================");
																		WebElement _backToDashboard= driver.findElement
																		(By.cssSelector(_campaign._backToDashboardButton));
																		Thread.sleep(500);
																		_backToDashboard.click();
																		Thread.sleep(500);	

																				//System.out.println("=====================================================");
																				System.out.println("Yes button..");
																				System.out.println("=====================================================");
																				WebElement _yesButton= driver.findElement
																				(By.cssSelector(_campaign._backToDashboardYesNoButton));
																				Thread.sleep(500);
																				_yesButton.click();
																				Thread.sleep(13000);	
														
																						//System.out.println("=====================================================");
																						System.out.println("Click Duplicate Button..");
																						System.out.println("=====================================================");
																						WebElement _clickPublishedData_DuplicateButton = driver.findElement
																						(By.cssSelector(_campaign._duplicateDataButton));
																						_clickPublishedData_DuplicateButton.click();
																						Thread.sleep(13000);	
																						File _duplicateData = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																					try {
																						//System.out.println("=====================================================");
																						System.out.println("Taking Screenshot ..");
																						System.out.println("=====================================================");
																						FileUtils.copyFile(_duplicateData, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/MainPage_With_DuplicatedData_MainPage.png"));   	           
																						Thread.sleep(2000);						
																					} catch (IOException j) {
																						System.out.println(j.getMessage());
																					}
																
																				//System.out.println("=====================================================");
																				System.out.println("Clicking Duplicated Data ..");
																				System.out.println("=====================================================");
																				WebElement _clickDuplicateData = driver.findElement
																				(By.cssSelector(_campaign._clickDataPublishedStatusEditButton));
																				_clickDuplicateData.click();				
																				Thread.sleep(5000);
																					File _basicPage_DuplicatedData = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																							try {
																								//System.out.println("=====================================================");
																								System.out.println("Taking Screenshot ..");
																								System.out.println("=====================================================");																	
																								FileUtils.copyFile(_basicPage_DuplicatedData, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/BasicPage_DuplicatedData.png"));   	           
																								Thread.sleep(2000);						
																							} catch (IOException j) {
																								System.out.println(j.getMessage());
																							}

																		//System.out.println("=====================================================");
																		System.out.println("Navigate to Duplicated Data Content Tab..");
																		System.out.println("=====================================================");
																		WebElement _clickContentTab_Duplicated = driver.findElement
																		(By.cssSelector(_elements._gotoContentTab));
																		Thread.sleep(1000);
																		_clickContentTab_Duplicated.click();
																		Thread.sleep(2000);		
																			File _contentMainPage_Duplicated = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																					try {
																						//System.out.println("=====================================================");
																						System.out.println("Taking Screenshot ..");
																						System.out.println("=====================================================");																					
																						FileUtils.copyFile(_contentMainPage_Duplicated, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/DuplicatedDataContent_MainPage.png"));   	           
																						Thread.sleep(2000);																											
																					} catch (IOException j) {
																						System.out.println(j.getMessage());
																					}								

															//System.out.println("=====================================================");
															System.out.println("Next Button..");
															System.out.println("=====================================================");
															WebElement _clickNextButton_Duplicated = driver.findElement
															(By.cssSelector(_elements._nextButton));
															Thread.sleep(500);
															_clickNextButton_Duplicated.click();
															Thread.sleep(6000);		
																File _widgetMainPage_Duplicated = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																		try {
																			//System.out.println("=====================================================");
																			System.out.println("Taking Screenshot ..");
																			System.out.println("=====================================================");																		
																			FileUtils.copyFile(_widgetMainPage_Duplicated, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/DuplicatedWidgetContent_MainPage.png"));   	           
																			Thread.sleep(2000);																						
																		} catch (IOException j) {
																			System.out.println(j.getMessage());
																		}

											//System.out.println("=====================================================");
											System.out.println("Next Button..");
											System.out.println("=====================================================");
											WebElement _clickNextButton2_Duplicated = driver.findElement
											(By.cssSelector(_elements._nextButton));
											Thread.sleep(500);
											_clickNextButton2_Duplicated.click();
											Thread.sleep(4000);		
												File _emailContentMainPage_Duplicated = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
														try {
															//System.out.println("=====================================================");
															System.out.println("Taking Screenshot ..");
															System.out.println("=====================================================");													
															FileUtils.copyFile(_emailContentMainPage_Duplicated, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/DuplicatedEmailContent_MainPage.png"));   	           
															Thread.sleep(2000);																				
														} catch (IOException j) {
															System.out.println(j.getMessage());
														}

							//System.out.println("=====================================================");
							System.out.println("Next Button..");
							System.out.println("=====================================================");
							WebElement _clickNextButton3_Duplicated= driver.findElement
							(By.cssSelector(_elements._nextButton));
							Thread.sleep(500);
							_clickNextButton3_Duplicated.click();
							Thread.sleep(6000);	
								File _settingsMainPage_Duplicated = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
									try {
										//System.out.println("=====================================================");
										System.out.println("Taking Screenshot ..");
										System.out.println("=====================================================");									
										FileUtils.copyFile(_settingsMainPage_Duplicated, new File("/Users/jahsavaged/Desktop/CiviTestScreenshotLive/CampaignsDuplicateData/DuplicatedSettings_MainPage.png"));   	           
										Thread.sleep(2000);															
									} catch (IOException j) {
										System.out.println(j.getMessage());
									}	

				//System.out.println("=====================================================");
				System.out.println("Back to Dashboard ..");
				System.out.println("=====================================================");
				WebElement _backToDashboard_DuplicatedData = driver.findElement
				(By.cssSelector(_campaign._backToDashboardButton));
				Thread.sleep(500);
				_backToDashboard_DuplicatedData.click();
				Thread.sleep(500);	

//System.out.println("=====================================================");
System.out.println("Yes button..");
System.out.println("=====================================================");
WebElement _yesButton_DuplicatedData = driver.findElement
(By.cssSelector(_campaign._backToDashboardYesNoButton));
Thread.sleep(500);
_yesButton_DuplicatedData.click();
Thread.sleep(13000);	






			}
	

}
