package taskselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        String backgroundColor = target.getCssValue("background-color");
        System.out.println("Background color after drop: " + backgroundColor);
        String textAfterDrop = target.getText();
        if (textAfterDrop.equals("Dropped!")) {
            System.out.println("Drag and drop successful! Text changed to: " + textAfterDrop);
        } else {
            System.out.println("Drag and drop failed. Text is: " + textAfterDrop);
        }
        driver.quit();
		
	}

}
