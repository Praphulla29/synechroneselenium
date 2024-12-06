package Synechron.SeleniumTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelEx {
	
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	@Test
	public void login() throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		File src = new File("C:\\Users\\Kiosk_User\\eclipse-workspace\\Selenium_Excel testing.xlsx");
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		for (int i = 1; i<=sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(cell.getStringCellValue());
			cell =sheet.getRow(i).getCell(1);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			
			//write to excel sheet
			
			FileOutputStream fos = new FileOutputStream(src);
			String title =driver.getTitle();
			sheet.getRow(i).createCell(2).setCellValue(title);
			workbook.write(fos);
			fos.close();
			
			
			
		}
	}

}
