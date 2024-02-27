package seleniumproject;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeleniumProject {
	@Test
	public void register () {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dreams\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("submit")).click();
		

		// TODO Auto-generated method stub

	}}


