package Kelompok14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SteamMarket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://steamcommunity.com/market/search?q=") ;
		driver.manage().window().maximize();
		
		driver.findElement(By.id("findItemsSearchBox")).sendKeys("CS20 Case");
		driver.findElement(By.className("market_search_submit_button")).click() ;
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


