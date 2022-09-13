package crm.com.aws.createContact;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactCreate {

	@Test 
	public void accountCreate() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	 driver.findElement(By.xpath("//a[text()='Mobiles']")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//span[text()='Brands']/ancestor::div[@class='a-section a-spacing-none']/ul/li//span[text()='Oppo']")).click();
		driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();
	List<WebElement> phoneList = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']/ancestor::div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']/descendant::span[@class='a-price-whole']"));
	
	for(int i=0;i<=phoneList.size();i++)
	{
		System.out.println(phoneList.get(i).getText()+" "+priceList.get(i).getText());
		//sopln;
		//new
	}
		}
	//new items
	//smruti done

	}


