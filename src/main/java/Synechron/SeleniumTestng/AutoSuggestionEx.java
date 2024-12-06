package Synechron.SeleniumTestng;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionEx {
	String expectedtext = "lamdatest";
	@Test
	public void autosugg() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchbox.sendKeys("lamda");
		Thread.sleep(2000);
		
				List<WebElement> autosugesstionslist = searchbox.findElements(By.xpath(".//li"));
				for (WebElement listtext : autosugesstionslist) {
					WebElement term = listtext.findElement(By.xpath(".//span"));
					System.out.println(term.getText());
				}
				
		
		
	}

}
