package hw1;
//import utility.Utility;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class FirstTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		driver.findElement(By.linkText("Order")).click();
		
		int quantity = Utility.randomQuantity(100);
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(String.valueOf(quantity));
		
		String middleName = Utility.randomName(4);
		
		String zip = Utility.randomNum(5);
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + middleName + " Doe" + 
		Keys.TAB + "8607 Westwood Center Dr" + Keys.TAB + "Vienna" + Keys.TAB + "Virginia" + Keys.TAB + zip);
		
		int radioButton = Utility.randomQuantity(3);
		
		switch (radioButton) {
		
		case 0: {driver.findElement(By.xpath("//input[@value='Visa']")).click();
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(Utility.randomNum(16));
			break;
		}
		case 1: {driver.findElement(By.xpath("//input[@value='MasterCard']")).click();
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(Utility.randomNum(16));
			break;
		}
		case 2: {driver.findElement(By.xpath("//input[@value='American Express']")).click();
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(Utility.randomNum(15));
			break;
		}
		    }
		
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("11/25");
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		
		String expected = "New order has been successfully added";
		
		String actual = driver.findElement(By.tagName("strong")).getText();
		
		Utility.containsText(expected, actual);
		
		
		
		
		
	}
	
	
    
}
