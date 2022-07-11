package script1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Practi {
	WebDriver driver ;

      @Test
	public  void laucnhinginpen() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//opening URL
		//driver.get("https://www.google.co.in/");
		driver.navigate().to("https://uat.diabetes.shop");
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		TakesScreenshot Scrnshot = (TakesScreenshot) driver;
		File Capture = Scrnshot.getScreenshotAs(OutputType.FILE);
		File location = new File("C://Users//373316//Automation//Inpen//url.png");
		FileHandler.copy(Capture, location);
		WebElement prompt = driver.findElement(By.id("consent_prompt_submit"));
		prompt.click();
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement user = driver.findElement(By.id("user"));
		user.sendKeys("ctsblueadap2");
		WebElement fname= driver.findElement(By.xpath("//*[@id='Login']/div/div[2]/div/a")); 
		System.out.println("Color of a button " + fname.getCssValue("color"));
		//String CSS = driver.findElement(By.xpath("//*[@id='Login']/div/div[2]/div/a")).getCssValue(null);
		//System.out.println("Color"+CSS);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("minimed12");
		TakesScreenshot Scrnshot1 = (TakesScreenshot) driver;
		File Capture1 = Scrnshot1.getScreenshotAs(OutputType.FILE);
		File location1 = new File("C://Users//373316//Automation//Inpen//login.png");
		FileHandler.copy(Capture1, location1);
		JavascriptExecutor mous = (JavascriptExecutor)driver;
		mous.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		WebElement signin1 = driver.findElement(By.id("signin"));
		signin1.click();
		//product search
		Thread.sleep(5000);
		WebElement productsearch = driver.findElement(By.id("productSearch"));
		//productsearch.click();
		productsearch.sendKeys("MMT-105ELBLNA"+Keys.ENTER);
		Thread.sleep(5000);
		WebElement Inpenclick = driver.findElement(By.xpath("//*[@id='j_id0:formId']/div[1]/div/div[2]/div/div/div[2]/div[1]/a"));
		Inpenclick.click();
		WebElement Selecttype = driver.findElement(By.xpath("//div[@id='siblingsForm2']/div/select"));
		Selecttype.sendKeys("N"+Keys.ENTER);
		Thread.sleep(6000);
		WebElement Color = driver.findElement(By.xpath("(//div[@class='form__row']/div/div/div/ul/li/label)[3]"));
		Color.click();
		Thread.sleep(6000);
		JavascriptExecutor mous1 = (JavascriptExecutor)driver;
		mous1.executeScript("window.scrollBy(0,300)");
		WebElement addtocart = driver.findElement(By.id("addToCartInPen"));
		addtocart.click();
		Thread.sleep(8000);
		WebElement emailChange = driver.findElement(By.xpath("//div[@class='upgrd_email']/div/div/div[2]/a"));
		emailChange.click();
		WebElement changeemailadd = driver.findElement(By.xpath("//div[@class='card-body']/div/div/div/div/span/input"));
		changeemailadd.clear(); 
		changeemailadd.sendKeys("aarathyj.jagadeesh@cognizant.com");
		WebElement saveemail = driver.findElement(By.id("saveEmailButton"));
		saveemail.click();
		Thread.sleep(6000);
		Thread.sleep(6000);
      }
}
//      @Test
//      public void addaddress() {
//		
//	
//		WebElement shippingadd = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:ShippingOutPanel']/div/div/div[1]/div/div[2]/a[1]"));
//		shippingadd.click();
//		//Add new address
//		Thread.sleep(3000);
//		WebElement Addnewaddress = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id305"));
//		Addnewaddress.click();
//		Thread.sleep(5000);
//		//JavascriptExecutor mous2 = (JavascriptExecutor)driver;
//		//mous2.executeScript("window.scrollBy(0,700)");
//		WebElement savebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='checkoutAddressBtnMain']/div/a")));
//		savebutton.click();
//		Thread.sleep(3000);
//		WebElement cancelbutton = driver.findElement(By.xpath("//*[@id='checkoutAddressBtnMain']/div/button"));
//		cancelbutton.click();
//		Thread.sleep(3000);
//		WebElement Leavebutton = driver.findElement(By.xpath("//*[@id='cancelShippingAddress']/div/div/div[2]/div/div/input"));
//		Leavebutton.click();
//		//Add new address with details
//		Thread.sleep(20000);
//		WebElement Addnewaddress1 = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id305"));
//		Addnewaddress1.click();
//		Thread.sleep(20000);
//		WebElement Contacttypeadd = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:contact1_type"));															
//		Select Type = new Select(Contacttypeadd);
//		Type.selectByVisibleText("Friend");
//		WebElement Fnaddnewadd = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newFirstName"));
//		Fnaddnewadd.sendKeys("Test");
//		WebElement lnaddnewadd = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newLastName"));
//		lnaddnewadd.sendKeys("Last");
//		WebElement phone = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newPhoneNumber"));
//		phone.sendKeys("6699003474");
//		WebElement dd = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:addedNewPhoneType"));
//		Select Addtype = new Select(dd);
//		Addtype.selectByVisibleText("CELL");
//		WebElement emailadd = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newEmailAddress"));
//		emailadd.sendKeys("aarathy.minu@gmail.com");
//		WebElement addline1 = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newStreet"));
//		addline1.sendKeys("143 E 13TH AVE"+Keys.TAB);
//		Thread.sleep(3000);
//		WebElement City = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newCity"));
//		City.sendKeys("ANCHORAGE");
//		Thread.sleep(3000);
//		WebElement State = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newState"));
//		State.sendKeys("AK");
//		WebElement Zip = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:newZip"));
//		Zip.sendKeys("99501");
//		Thread.sleep(40000);
//		WebElement clickdefadd1 = driver.findElement(By.xpath("//*[@id='checkoutAddressAddForm']/div[2]/div[7]/div[3]/div/div/div/div/label/span"));
//		clickdefadd1.click();
//		WebElement clickdefaddconfirm1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id313:j_id314:j_id361']/div[2]/button[1]"));
//		clickdefaddconfirm1.click();
//		WebElement savebut = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='checkoutAddressBtnMain']/div/a")));
//		savebut.click();
//}
//		Thread.sleep(20000);
//		driver.navigate().refresh();
//		Thread.sleep(10000);
//		WebElement shippingadd1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:ShippingOutPanel']/div/div/div[1]/div/div[2]/a[1]"));
//		shippingadd1.click();
//		Thread.sleep(15000);
//		//Edit address
//		WebElement editaddress = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id303"));
//		editaddress.click();
//		Thread.sleep(15000);
//		Wait<WebDriver> wait4 = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(40))
//				.pollingEvery(Duration.ofSeconds(3))
//				.ignoring(ElementClickInterceptedException.class)
//				.ignoring(ElementNotInteractableException.class);
//
//				WebElement editfn1 = wait4.until(new Function<WebDriver, WebElement>() {
//				public WebElement apply(WebDriver driver) {
//
//				return driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:firstNameEdit']"));
//				}
//				});
//		//WebDriverWait wait1 = new WebDriverWait(driver, 30);
//		//WebElement editfn1 = wait1.until(ExpectedConditions.elementToBeClickable(By.id("j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:firstNameEdit")));
//		//WebElement editfn1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:1:firstNameEdit']"));
//		editfn1.clear();
//		editfn1.sendKeys("My"+Keys.TAB);
//		WebElement editln = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:lastNameEdit']"));
//		editln.clear();
//		editln.sendKeys("dundoo");
//		WebElement contactno = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:phoneNumber1Edit']"));
//		contactno.clear();
//		contactno.sendKeys("6699003474");
//		WebElement dd1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:contact1_type_edit']"));
//		Select Type1 = new Select(dd1);
//		Type1.selectByVisibleText("Child");
//		WebElement Emailaddress = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:editEmaiAddress']"));
//		Emailaddress.clear();
//		Emailaddress.sendKeys("aarathy.minu@gmail.com");
//		WebElement Addressline1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:editAddressLine1']"));
//		Addressline1.clear();
//		Addressline1.sendKeys("1234 HARWICH RD"+Keys.TAB);
//		Thread.sleep(3000);
//		WebElement City1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:editCity']"));
//		City1.clear();
//		City1.sendKeys("BREWSTER");
//		Thread.sleep(7000);
//		WebElement State1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:editState']"));
//		State1.sendKeys("MA");
//		WebElement Zip1 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:editZip']"));
//		Zip1.clear();
//		Zip1.sendKeys("02631");
//		Thread.sleep(50000);
//		//WebElement clickdefadd = driver.findElement(By.xpath("//*[@id='editContact0']/div[2]/div[7]/div[1]/div/div/div/div/label/span"));
//		//clickdefadd.click();
//		//WebElement clickdefaddconfirm = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:j_id371:j_id372:j_id458:0:j_id504']/div[2]/input"));
//		//clickdefaddconfirm.click();
//		WebElement savebutton1 = driver.findElement(By.xpath("//*[@id='checkoutAddressBtnEdit']/div/a"));
//		savebutton1.click();
//		Thread.sleep(10000);
//		
//		//Delete address
//		driver.navigate().refresh();
//		Thread.sleep(10000);
//		WebElement shippingadd2 = driver.findElement(By.xpath("//*[@id='j_id0:ShippingForm:j_id181:j_id182:ShippingOutPanel']/div/div/div[1]/div/div[2]/a[1]"));
//		shippingadd2.click();
//		Thread.sleep(5000);
//		JavascriptExecutor mous3 = (JavascriptExecutor)driver;
//		mous3.executeScript("window.scrollBy(0,300)");
//		WebElement delete = driver.findElement(By.id("j_id0:ShippingForm:j_id181:j_id182:deleteThisAddress"));
//		delete.click();
//		Thread.sleep(10000);
//		WebElement confbutton1 = driver.findElement(By.xpath("//*[@id='deleteAddressModal']/div/div/div[2]/div/button"));
//		confbutton1.click();
//		Thread.sleep(4000);
//		
//		//*[@id="j_id0:ShippingForm:j_id181:j_id182:ShippingOutPanel"]/div/div/div[1]/div/div[2]/a[2]
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		//driver.quit();
//		
//	}
//
//}
