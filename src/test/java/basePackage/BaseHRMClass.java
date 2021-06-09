package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class BaseHRMClass {
public static WebDriver driver;
public static Properties prop=new Properties();

public BaseHRMClass() {
	try {
	FileInputStream file=new FileInputStream("C:\\Users\\cheen\\HRManagement\\src\\test\\java\\environmentvariable\\Config.properties");
            prop.load(file);
	
	}
catch(FileNotFoundException e) {
	e.printStackTrace();

}
	catch (IOException a) {
		a.printStackTrace();
	}}
	 public static void initiate() {
		String Browsername= prop.getProperty("browser");
		if (Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
		 
	 }
		else if(Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	 }
	
		
		public static void screenshots(String Filename) {
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			FileUtils.copyFile(file, new File("C:\\Users\\cheen\\HRManagement\\src\\test\\java\\screenshots\\Screenshots" +Filename+".jpg"));
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
	

