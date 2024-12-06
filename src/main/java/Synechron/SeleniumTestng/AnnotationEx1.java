package Synechron.SeleniumTestng;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationEx1 {
	@Test
	public void Testcase1() {
		System.out.println("Execution test case 1");
	}
	@Test
	
	public void Testcase2() {
		System.out.println("Execution test case 2");
	}
	@Test
	public void Testcase3() {
		System.out.println("Execution test case 3");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("launching browser");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("closing browser");
		
		
		
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Db connection");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("Db connection close");
		
		
		
	}
}



