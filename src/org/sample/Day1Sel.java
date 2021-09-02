package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day1Sel {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Thenmozhi\\JavaProject\\drivers\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://en-gb.facebook.com/");
    	 driver.manage().window().maximize();
    	 String currentUrl=driver.getCurrentUrl();
    	 System.out.println(currentUrl);
    	 String title=driver.getTitle();
    	 System.out.println(title);
    	 driver.close();
    	 
    	 
    	 
    	  
    	 
    	 
	}

}
