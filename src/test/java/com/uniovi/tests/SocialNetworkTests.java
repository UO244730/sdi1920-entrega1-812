package com.uniovi.tests;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SocialNetworkTests {
	
	static String PathFirefox65="";
	static String Geckdriver024="";
	
	static WebDriver driver=getDriver(PathFirefox65, Geckdriver024);
	static String URL = "http://localhost:8090";
	
	public static WebDriver getDriver(String PathFirefox, String Geckdriver) {
		System.setProperty("webdriver.firefox.bin", PathFirefox);
		System.setProperty("webdriver.gecko.driver", Geckdriver);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	@Before
	public void setUp() throws Exception{
		driver.navigate().to(URL);
	}
	@After
	public void tearDown() throws Exception{
		driver.manage().deleteAllCookies();
	}
	
	@BeforeClass
	static public void begin() {
		
	}
	
	@AfterClass
	static public void end() {
		driver.quit();
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
