package adactinHotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetails {
	
	@FindBy(id="first_name")
	public static WebElement firstname;
	
	@FindBy(id="last_name")
	public static WebElement lastname;
	
	@FindBy(id="address")
	public static WebElement address;
	
	@FindBy(id="cc_num")
	public static WebElement card;
	
	@FindBy(id="cc_type")
	public static WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	public static WebElement ccmonth;
	
	@FindBy(id="cc_exp_year")
	public static WebElement ccyear;
	
	@FindBy(id="cc_cvv")
	public static WebElement cvv;
	
	@FindBy(id="book_now")
	public static WebElement book;
	
	@FindBy(id="total_price")
	public static WebElement totalprice;
	
	@FindBy(id="gst")
	public static WebElement GST;
	
	@FindBy(id="final_price")
	public static WebElement finalprice;
	
	@FindBy(id="order_no")
	public static WebElement orderno;



	

}
