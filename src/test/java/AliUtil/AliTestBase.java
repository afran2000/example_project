package AliUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class AliTestBase {
	public static WebDriver driver;
	public static Properties pro;
	
    public AliTestBase() {
	
    pro=new Properties();
	
	    try {
		FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ConfigAli\\Ali.properties");
		pro.load(fls);
	   } catch (FileNotFoundException e) {
		System.out.println("Please check your Constructor");
		e.printStackTrace();
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	public void initalize() {
	String browserName =pro.getProperty("browser");
	
	if (browserName.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe"); //Setting up Browser
        driver= new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(AliUtility.implicity_wait,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(AliUtility.pageLoadTimeout, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
        System.out.println("This is Chrome Browser");
	    }else if(browserName.equals("IE"));
}
		
	    public static void getURL(String URL) {
	    driver.get(pro.getProperty("URL"));
		
		
}




}

	
		

