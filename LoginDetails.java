package adactinHotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginDetails {
	
	
	@FindBy(id="username")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="login")
	public static WebElement login;
	
	
	

}
