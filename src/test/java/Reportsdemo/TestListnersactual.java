package Reportsdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestListnersactual {

	
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Google"),"Test failed");
		System.out.println("Test passed");
	}
	
	@Test
	public void test2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Googleapp"),"Test failed");
		System.out.println("Test passed");
	}
}
