package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWIthSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize windoww
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement dropDownByDay=driver.findElement(By.xpath("//select[@id='multi-select']"));

        //create an object of select class and pass in the dd element
        Select sel=new Select(dropDownByDay);
        Thread.sleep(3000);
        //Using the methods from the Select class
        sel.deselectByVisibleText("Friday");
        Thread.sleep(3000);
        sel.deselectByValue("Tuesday");

    }
}
