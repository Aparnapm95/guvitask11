package seleniumtask12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropOperation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0); 
        driver.findElement(By.id("draggable"));
        driver.findElement(By.id("droppable"));
     
        Actions actions = new Actions(driver);

        //  Verify CSS change (background-color or class)
        ((WebElement) driver).getCssValue("background-color");
        System.out.println("Target background color after drop: " + bgColor);

        // Verify text has changed to "Dropped!"
        String textAfterDrop = target.getText();
        if (textAfterDrop.equals("Dropped!")) {
            System.out.println("✅ Drag and Drop successful: Text changed to 'Dropped!'");
        } else {
            System.out.println("❌ Drag and Drop failed: Text is '" + textAfterDrop + "'");
        }

        // Pause to observe before closing browser (optional)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

	}

}
