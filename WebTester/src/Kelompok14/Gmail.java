package Kelompok14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("http://www.gmail.com/") ;
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("alfalah190299@gmail.com");
		driver.findElement(By.className("CwaK9")).click() ;
		String at = driver.getTitle() ;
		String et = "gmail" ;

	}

}
