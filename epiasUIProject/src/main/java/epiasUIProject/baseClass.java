package epiasUIProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class baseClass extends locators{
	public static WebDriver driver = null;
	
	@BeforeClass
	public void navigate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void epias() throws InterruptedException {
		driver.findElement(By.cssSelector(uretim)).click();
		driver.findElement(By.cssSelector("li#menuform\\3a j_idt59 > a")).click();
		driver.findElement(By.cssSelector("li#menuform\\3a j_idt60 > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#j_idt202\\3a date1_input")).sendKeys("30032020");
		driver.findElement(By.cssSelector("div#ui-datepicker-div td.ui-datepicker-days-cell-over.ui-datepicker-current-day > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#j_idt202\\3a date2_input")).sendKeys("30032020");
		driver.findElement(By.cssSelector("div#ui-datepicker-div td.ui-datepicker-days-cell-over.ui-datepicker-current-day > a")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button#j_idt202\\3a goster > span")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img#j_idt202\\3a dt\\3a j_idt252")).click();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
	}

}
