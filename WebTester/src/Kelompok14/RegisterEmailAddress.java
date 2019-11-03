package Kelompok14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterEmailAddress {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://store.steampowered.com/join") ;
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("alfalah190299@gmail.com");
		String at = driver.getTitle() ;
		String et = "steam" ;
		driver.close() ;
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Berhasil") ;
		} else {
			System.out.println("Test Gagal") ;
		}

	}

	}


