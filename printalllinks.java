package random;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printalllinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./\\browser_resources\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();	
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.get("https://www.rediff.com/");

List<WebElement >alllinks =   driver.findElements(By.xpath("//a"));
	System.out.println(alllinks.size());
	for (int l=0;l<=alllinks.size();l++)
	{
		System.out.println(((WebElement) alllinks).getText());
	}
	Thread.sleep(2000);
	driver.close();
	}

}
