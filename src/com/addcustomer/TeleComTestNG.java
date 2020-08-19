package com.addcustomer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TeleComTestNG extends AddCustomer {
	static  WebDriver driver;	
@BeforeClass
	public void driver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\TestNG.AddCustomer\\File\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/telecom/");
		handling();
		WebElement element=driver.findElement(By.xpath("//*[@id='one']/div/div[1]/div[1]/h3/a"));
		element.click();
	PageFactory.initElements(driver,AddCustomer.class);	
	AddCustomer.check.click();
	AddCustomer.firstname.sendKeys("soundar");
	AddCustomer.lastname.sendKeys("murugan");
	AddCustomer.Email.sendKeys("soundar@gmail.com");
	AddCustomer.Address.sendKeys("chennai");
	AddCustomer.PhoneNumber.sendKeys("1234512345");
	AddCustomer.submit.click();
}
@AfterClass
public void close(){
	//driver.quit();
}
@Test
public static void handling() throws InterruptedException {
	Thread.sleep(10000);
	driver.switchTo().frame("flow_close_btn_iframe");
	driver.findElement(By.id("closeBtn")).click();
	driver.switchTo().defaultContent();



}


}
