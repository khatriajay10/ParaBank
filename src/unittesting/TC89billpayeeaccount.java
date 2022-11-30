package unittesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC89billpayeeaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();
		driver.findElement(By.cssSelector("#leftPanel > ul > li:nth-child(4) > a")).click();
		driver.findElement(By.name("payee.name")).sendKeys("Rogers");
		driver.findElement(By.name("payee.address.street")).sendKeys("333 Bloor St E");
		driver.findElement(By.name("payee.address.city")).sendKeys("Toronto");
		driver.findElement(By.name("payee.address.state")).sendKeys("Ontario");
		driver.findElement(By.name("payee.address.zipCode")).sendKeys("M4W1G9");
		driver.findElement(By.name("payee.phoneNumber")).sendKeys("4169358080");
		driver.findElement(By.name("payee.accountNumber")).sendKeys("102346");
		driver.findElement(By.name("verifyAccount")).sendKeys("102346");
		driver.findElement(By.name("amount")).sendKeys("35.45");
		Select obj= new Select(driver.findElement(By.name("fromAccountId")));
		obj.selectByVisibleText("13344");
		driver.findElement(By.cssSelector("#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(14) > td:nth-child(2) > input")).click();
		
		String expectd = "ParaBank | Bill Payment Complete";
		String actual = driver.getTitle();
		if (expectd.equals(actual)) {
			System.out.println("Test Failed");
			}else {
				System.out.println("Test Successful");
		
			}

	}

}
