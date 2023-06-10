package base;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;

public class BookTicket {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	/*driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
	Set<String> a = driver.getWindowHandles();
	System.out.println(a);
	driver.findElement(By.xpath("//input[@formcontrolname='userid']")).sendKeys("ayesh1996");
	driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Aup12345");
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//button)[3]")).click();
*/
	driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input")).sendKeys("BHUBANESWAR - BBS");
 Actions action = new Actions(driver);
 action.moveToElement(driver.findElement(By.xpath("//*[@id='pr_id_1_list']/li[2]/span"))).click().perform();
 WebElement areaSelect = driver.findElement(By.xpath("//p-autocomplete[@aria-label='Enter To station. Input is Mandatory.']/span/input"));//.sendKeys("DHENKANAL - DNKL");
areaSelect.sendKeys("dhenkanal");
areaSelect.sendKeys(Keys.ENTER);
 action.moveToElement(driver.findElement(By.xpath("//*[text()='DHENKANAL - DNKL']/../../.."))).click().perform();
driver.findElement(By.xpath("//*[text()='Search']")).click();
}
}
