package assignmentweek3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement search=driver.findElementByName("searchVal");
	search.sendKeys("bags");
	search.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='Men']/following::label")).click();
	driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following::label")).click();
	Thread.sleep(10000);
	String total=driver.findElementByClassName("length").getText();
	System.out.println("Count of the items Found : "+total);
	System.out.println("\n  *****List of Brands are*****  \n");
	List<WebElement> bname = driver.findElements(By.className("brand"));
	 for (WebElement webElement : bname) {
		String val = webElement.getText();
		System.out.println(val);
	 }
		List<WebElement> bagN= driver.findElementsByClassName("name");
		System.out.println("\n  ****Names of the bags are*****  \n");
		for  (WebElement webElement1 : bagN) {
			System.out.println(webElement1.getText());
		}
	}

}
