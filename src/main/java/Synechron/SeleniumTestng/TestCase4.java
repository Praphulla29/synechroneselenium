package Synechron.SeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {
	//@Test
	@Test(groups ={"Sanity"})
	public void endToEnd() throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/v1/");
	Thread.sleep(2000);
	WebElement  username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	WebElement  password = driver.findElement(By.xpath("//input[@id='password']"));
	 password.sendKeys("secret_sauce");
	 WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		 WebElement addtocart = driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		 addtocart.click();	
		 
		 WebElement addtocart1 = driver.findElement(By.cssSelector("path[fill='currentColor']"));
		 addtocart1.click();	
		 
		 WebElement checkout = driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']"));
		 checkout.click();
		 WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		 firstname.sendKeys("pups");
		 WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		 lastname.sendKeys("M");
		 WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		 zipcode.sendKeys("560077");
		 WebElement addtocart11 = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		 addtocart11.click();
		 WebElement finish = driver.findElement(By.xpath("//a[normalize-space()='FINISH']"));
		 finish.click();
		 WebElement text = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']"));
			if(text.isDisplayed()) {
				System.out.println("THANK YOU FOR YOUR ORDER");
				
			}
			else {
				System.out.println("THANK YOU FOR YOUR ORDER not displayed");
			}
}

}



