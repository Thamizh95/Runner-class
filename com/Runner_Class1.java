package Mini_Project.com;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.logger.Property_File;
import com.sdp.Page_Object_Manager;
public class Runner_Class1 extends Base_class {
		
	public static WebDriver s=getBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(s);
	
	static Logger log = Logger.getLogger(Property_File.class);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");

		url("http://automationpractice.com/index.php");
		
		clickonElement(pom.getInstanceHp().getSign());
		
		log.info("login page successfully open");
		
		String particular_data = particular_data("C:\\Users\\Thamizh\\workspace\\com\\Test Case.xlsx", 2, 5);
		
		inputvalueElement(pom.getInstanceLogin().getEmail(),particular_data);
		
		String particular_data2 = particular_data("C:\\Users\\Thamizh\\workspace\\com\\Test Case.xlsx", 7, 5);
				
		inputvalueElement(pom.getInstanceLogin().getPasswd(),particular_data2);
		
		clickonElement(pom.getInstanceLogin().getSignin_btn());
		
		log.info("page1 succesfully open");
		
		clickonElement(pom.getInstancePage1().getClick());
		
		clickonElement(pom.getInstancePage2().getClick());
		
		log.info("page2 succesfully open");
		
		frames("element", null, pom.getInstancePage3().getFrame());
		
		clickonElement(pom.getInstancePage4().getClick());
		
		log.info("page4 succesfully open");

		frames("defaultcontent", null, null);

		sleep(5000);
		
		clickonElement(pom.getInstancePage5().getClick());
		
		sleep(3000);
		
		clickonElement(pom.getInstancePage6().getClick());
		
		sleep(3000);

		clickonElement(pom.getInstancePage7().getClick());
		
		sleep(3000);
	    	    
	    clickonElement(pom.getInstancePage8().getClick());

		sleep(5000);
		
		clickonElement(pom.getInstancePage9().getClick());
		
		log.info("page9 succesfully open");
		
		clickonElement(pom.getInstancePage10().getClick());
		
		clickonElement(pom.getInstancePagefp().getButton());
		
		clickonElement(pom.getInstancePagefp().getClick());
		
		Scroll("scrolldown");
		
		Scroll("scrollup");
		
		sleep(3000);
		
		screenShort("C:\\Users\\Thamizh\\workspace\\Testing\\Screenshorts\\h2.png");
		
		log.info("screenshort");
		
	}





}
