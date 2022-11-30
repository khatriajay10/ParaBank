package unittesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24zipcode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.id("customer.firstName")).sendKeys("Ajay");
		driver.findElement(By.id("customer.lastName")).sendKeys("Kumar");
		driver.findElement(By.id("customer.address.street")).sendKeys("52 Fahey Dr");
		driver.findElement(By.id("customer.address.city")).sendKeys("Brampton");
		driver.findElement(By.id("customer.address.state")).sendKeys("Ontario");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("L6Y0N88");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("2269664696");
		driver.findElement(By.id("customer.ssn")).sendKeys("9 4 5 8 3 7 9 0 4");
		driver.findElement(By.id("customer.username")).sendKeys("KH@578");
		driver.findElement(By.id("customer.password")).sendKeys("123456");
		driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
		driver.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).click();
		
		String expectd = "ParaBank | Register for Free Online Account Access";
		String actual = driver.getTitle();
		if (expectd.equals(actual)) {
			System.out.println("Test Successful");
			}else {
				System.out.println("Test failed");
				
			}

	}

}
