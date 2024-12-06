package Synechron.SeleniumTestng;

import org.testng.annotations.Test;

public class Prioritysetting {
	@Test(priority = 0)
	
	public void  launchbrowser() {
		System.out.println("launch browser");
	}
	@Test(priority = 1)
		public void  login() {
			System.out.println("login");
		}
	//@Test(priority = 2)
	//@Test(enabled = false)
	@Test(groups ={"Regression"})
			
			public void  productselected() {
				System.out.println("selected");
			}
		
		
	}


