package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooktesting {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.name("firstname")).sendKeys("ram");
		driver.findElement(By.name("lastname")).sendKeys("nayak");
		driver.findElement(By.name("reg_email__")).sendKeys("wapewa9441@saeoil.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("wapewa9441@saeoil.com");

		
		driver.findElement(By.name("reg_passwd__")).sendKeys("ynkama");
		Select dropdown =  new Select(driver.findElement(By.id("day")));
		//dropdown.selectByVisibleText("20");
		dropdown.selectByValue("28");
		Select dropdown1=new Select(driver.findElement(By.id("month")));
		dropdown1.selectByValue("11");
		Select dropdown2=new Select(driver.findElement(By.id("year")));
		dropdown2.selectByValue("2002");
		WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
        radio.click();
		//WebElement signup=driver.findElement(By.name("websubmit"));
		//signup.click();
		driver.findElement(By.name("websubmit")).click();
		//driver.close();
		// TODO Auto-generated method stub

	}

}
