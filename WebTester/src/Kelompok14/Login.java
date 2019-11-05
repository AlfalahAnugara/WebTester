package Kelompok14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://store.steampowered.com/login/") ;
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username")) ;
		username.sendKeys("newcadel");
		WebElement password=driver.findElement(By.id("input_password")) ;
		password.sendKeys("password") ;
		WebElement loginbtn=driver.findElement(By.id("login_btn_signin"));
		loginbtn.click();
		String at = driver.getTitle() ;
		String et = "steam" ;
	
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Berhasil") ;
		} else {
			System.out.println("Test Gagal") ;
		}
		driver.close() ;
		
	}
	

}
