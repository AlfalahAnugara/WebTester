package Kelompok14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement ;


public class LoginSteam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://store.steampowered.com/login/") ;
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("username")) ;
		WebElement password=driver.findElement(By.name("password")) ;
		username.sendKeys("newcadel"); password.sendKeys("password") ;
		String at = driver.getTitle() ;
		String et = "gmail" ;
		driver.close() ;
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Berhasil") ;
		} else {
			System.out.println("Test Gagal") ;
		}
		
		
	}
		


}
