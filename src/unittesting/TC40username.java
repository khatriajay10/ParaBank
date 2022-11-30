package unittesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC40username {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.name("username")).sendKeys("KH@578");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();
		
		String expectd = "ParaBank | Accounts Overview";
		String actual = driver.getTitle();
		if (expectd.equals(actual)) {
			System.out.println("Test Successful");
			}else {
				System.out.println("Test failed");
				
			}

	}

}
