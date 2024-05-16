package org.alr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alertclass {

		public static void main(String[] args)  {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kavin\\eclipse-workspace\\alert\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alretbtn = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
        alretbtn.click();
		
        Alert a = driver.switchTo().alert();
		
        String info = a.getText();
        System.out.println(info); 
        WebElement alretwithtext= driver.findElement(By.xpath("//a[text()= 'Alert with Textbox ']"));
        alretwithtext.click();
        WebElement promptbox = driver.findElement(By.xpath("//button[contains(text)(),'prompt')]"));
        promptbox.click();
        Alert b = driver.switchTo().alert();
        b.sendKeys("inmakes infoetch");
        b.accept();
      
        
}
}
