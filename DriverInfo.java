package adactinHotelApp;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DriverInfo {
	@Test

	public void driverInfo() throws InterruptedException, AWTException, IOException
	{
		WebDriver driver = null;
		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);	
		String browser = properties.getProperty("browser");
		String Driverlocation = properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",Driverlocation);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Driverlocation);
			driver = new FirefoxDriver();
		}
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");


//				PageFactory.initElements(driver, RegisterAccount.class);
//				RegisterAccount.registerclick.click();
//				RegisterAccount.firstname.sendKeys("Micheldavidro");
//				RegisterAccount.password.sendKeys("Asdfgh@2");
//				RegisterAccount.repassword.sendKeys("Asdfgh@2");
//				RegisterAccount.fullname.sendKeys("Michel David");
//				RegisterAccount.email.sendKeys("cihcjwado@candassociates.com");
//				Thread.sleep(20000);
//				RegisterAccount.agreebutton.click();
//				RegisterAccount.submit.click();
//				RegisterAccount.loginredir.click();

		PageFactory.initElements(driver, LoginDetails.class);
		LoginDetails.username.sendKeys("Micheldavidrok");
		LoginDetails.password.sendKeys("Asdfgh@2");
		LoginDetails.login.click();

		PageFactory.initElements(driver, HotelBook.class);
		HotelBook.location.sendKeys("London");
		HotelBook.hotel.sendKeys("Hotel Sunshine");
		HotelBook.roomtype.sendKeys("Standard");
		HotelBook.checkout.sendKeys("10/05/2022");
		HotelBook.submit.click();

		PageFactory.initElements(driver, SelectHotel.class);
		SelectHotel.hotel.click();
		SelectHotel.submit.click();


		PageFactory.initElements(driver, UserDetails.class);
		UserDetails.firstname.sendKeys("Michel");
		UserDetails.lastname.sendKeys("david");
		UserDetails.address.sendKeys("Street 3983");
		UserDetails.card.sendKeys("4525636598752365");
		UserDetails.cardtype.sendKeys("VISA");
		UserDetails.ccmonth.sendKeys("March");
		UserDetails.ccyear.sendKeys("2022");
		UserDetails.cvv.sendKeys("852");
		UserDetails.book.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String total = UserDetails.totalprice.getAttribute("value");
		System.out.println("Total Price is: " + total);
		String Gst = UserDetails.GST.getAttribute("value");
		System.out.println("GST: " + Gst);
		String Final = UserDetails.finalprice.getAttribute("value");
		System.out.println("Final Price: " + Final);
		String order = UserDetails.orderno.getAttribute("value");
		System.out.println("Order Number: " + order);





	}

}
