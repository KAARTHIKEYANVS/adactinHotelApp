package adactinHotelApp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class EmailLogin {
	WebDriver driver;
	@Test
	public void emaillogin() throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SPARTEN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();                       
	driver.get("https://mail.tm/en/");
	
	driver.findElement(By.xpath("//*[@id=\"accounts-menu\"]/img")).click();
	
	driver.findElement(By.xpath("//*[@id=\"accounts-list\"]/div/div[4]/a")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div[2]/div[2]/span/form/div[1]/span/div/input")).sendKeys("oaazwefw@candassociates.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("]=XMGsT1");
	
	
	driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div/div[2]/div[2]/span[1]/button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div[2]/ul/li/a/div/div[1]")).click();
	
	System.out.println("VERIFY THE EMAIL");
	
	}
	
}
