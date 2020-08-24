package selenium_form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enuqiry_Form6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_form\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("sujeet rajput");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("sujeet@gmail.com");
		WebElement formSubmitButton = driver.findElement(By.id("submit"));
		formSubmitButton.click();
		
		
		
		WebElement outputName = driver.findElement(By.id("name"));
		String nameActual = outputName.getText();
		System.out.println(nameActual);
		WebElement outputEmail = driver.findElement(By.id("email"));
		String emailActual = outputEmail.getText();
		System.out.println(emailActual);
		
		if(nameActual.equals(fullName) && emailActual.equals(email)) {
			System.out.println("input & output is same");
		}
		else {
			System.out.println("input doesn't match with output");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
