package appiumDemo;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDemo {
	
	public static AppiumDriver driver;
	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");//这句不是必须的
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", ".Calculator");
		
		try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
				 
	     driver.findElement(By.id("com.android.calculator2:id/digit9")).click();
		
    
	}

}
