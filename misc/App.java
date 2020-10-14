package abc.pqr;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String linkText = "Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    	//System.setProperty("webdriver.chrome.driver","D:\\edureka\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-debugging-port=9222");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://34.71.187.137:8080");
		driver.findElement(By.linkText("About Us")).click();
		System.out.println(driver.getPageSource().contains(linkText));
		Assert.assertTrue(driver.getPageSource().contains(linkText));
		driver.close();
    }
}