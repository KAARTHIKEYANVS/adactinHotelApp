package adactinHotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccount {
	
	@FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")
	public static WebElement registerclick;
	
	@FindBy(id="username")
	public static WebElement firstname;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="re_password")
	public static WebElement repassword;
	
	@FindBy(id="full_name")
	public static WebElement fullname;
	
	@FindBy(id="email_add")
	public static WebElement email;
	
	@FindBy(id="tnc_box")
	public static WebElement agreebutton;
	
	@FindBy(id="Submit")
	public static WebElement submit;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")
	public static WebElement loginredir;
	

}
