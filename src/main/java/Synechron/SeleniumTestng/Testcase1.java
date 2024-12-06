package Synechron.SeleniumTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	@Test
	//@Test(groups ={"Regression"})
	public void radio() {
		
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	WebElement radio =driver.findElement(By.xpath("//input[@name='radioButton'][1]"));
	radio.click();
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1'][1]"));
	checkbox.click();
	//for loop for clicking on check boxes
	List<WebElement>checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
	int size =checkboxes.size();
	System.out.println(size);
	for(int i= 0; i<=size; i++ ) {
		checkboxes.get(i).click();
		if(radio.isDisplayed()) {
			radio.click();
		}
		
	}
	
	

}

}



