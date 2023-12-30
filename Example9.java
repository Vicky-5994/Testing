 package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9 {

	public static void main(String[] args) {
	              WebDriver driver =new ChromeDriver();
	              driver.get("https://www.swiggy.com");
	              driver.manage().window().maximize();
	              WebElement btnsign=driver.findElement(By.xpath("//a[@class='r2iyh']"));
	              btnsign.click();
	              WebElement txtphno=driver.findElement(By.name("mobile"));
	              txtphno.sendKeys("8903422139");
	              WebElement txtname=driver.findElement(By.xpath("//input[@id='name']"));
	              txtname.sendKeys("vignesh");
	              WebElement txtemail=driver.findElement(By.id("email"));
	              txtemail.sendKeys("visnu12345");
	             
	              
	              

	}

}
