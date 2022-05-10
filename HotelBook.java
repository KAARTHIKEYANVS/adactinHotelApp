package adactinHotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HotelBook {

	@FindBy(name="location")
	public static WebElement location;
	
	@FindBy(id="hotels")
	public static WebElement hotel;
	
	@FindBy(id="room_type")
	public static WebElement roomtype;
	
	@FindBy(id="datepick_out")
	public static WebElement checkout;
	
	@FindBy(id="Submit")
	public static WebElement submit;
	
	
	

}
