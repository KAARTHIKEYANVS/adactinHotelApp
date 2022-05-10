package adactinHotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel {
	
	@FindBy(id="radiobutton_0")
	public static WebElement hotel;
	
	@FindBy(id="continue")
	public static WebElement submit;
	

}
