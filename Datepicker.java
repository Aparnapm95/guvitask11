package taskselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();
        WebElement date = driver.findElement(By.xpath("//a[text()='15']"));
        date.click();
        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected date: " + selectedDate);
		driver.quit();		
		
		
	}

}
