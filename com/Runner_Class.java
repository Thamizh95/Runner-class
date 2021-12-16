package Mini_Project.com;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.sdp.Page_Object_Manager1;

public class Runner_Class extends Base_class {

	public static WebDriver s =getBrowser("chrome");
	
	public static Page_Object_Manager1 pom = new Page_Object_Manager1(s);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		url("http://adactinhotelapp.com/index.php");
		
		inputvalueElement(pom.getInstance_A().getA(), "imthamizh");
		
		inputvalueElement(pom.getInstance_A().getA1(), "3631tamil3631");
		
		clickonElement(pom.getInstance_A().getA2());
		
		dropdown("value",pom.getInstance_B().getLocation(),"Melbourne");
			
		dropdown("value",pom.getInstance_B().getHotel(),"Hotel Sunshine");
		
		dropdown("value",pom.getInstance_B().getRoom(),"Super Deluxe");
		
		dropdown("value",pom.getInstance_B().getType(), "2");
		
		inputvalueElement(pom.getInstance_B().getDate(),"13/12/2021");
		
		inputvalueElement(pom.getInstance_B().getDate1(), "14/12/2021");
		
		dropdown("value",pom.getInstance_B().getNum(), "2");
		
		dropdown("value",pom.getInstance_B().getChild(), "1");
		
		clickonElement(pom.getInstance_B().getButton());
		
		sleep(3000);
		
		clickonElement(pom.getInstance_C().getRadio());
		
		clickonElement(pom.getInstance_C().getC_button());
		
		sleep(3000);
		
		inputvalueElement(pom.getInstance_D().getName1(), "thamizh");
		
		inputvalueElement(pom.getInstance_D().getLastname(),"maran");
		
		inputvalueElement(pom.getInstance_D().getAddress(),"5th cross street,samapuram,porur,608112");
		
		inputvalueElement(pom.getInstance_D().getCread(), "1234567891234567");
		
		dropdown("value", pom.getInstance_D().getA3(), "AMEX");
		
		dropdown("value", pom.getInstance_D().getA4(), "2");
			
		dropdown("value", pom.getInstance_D().getA5(), "2021");
		
		inputvalueElement(pom.getInstance_D().getA6(), "008");
		
		sleep(3000);
		
		clickonElement(pom.getInstance_D().getA7());
		
		sleep(5000);
		
		screenShort("C:\\Users\\Thamizh\\workspace\\Testing\\Screenshorts\\new2.png");
			
		clickonElement(pom.getInstance_E().getLast());
		
		screenShort("C:\\Users\\Thamizh\\workspace\\Testing\\Screenshorts\\new3.png");
		
		
		
		
		
		
		
	}

}
