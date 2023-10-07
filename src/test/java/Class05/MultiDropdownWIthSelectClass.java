package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiDropdownWIthSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize windoww
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement dd=driver.findElement(By.xpath("//select[@id='multi-select']"));

        //create an object of select class and pass in the dd element
        Select sel=new Select(dd);
        Thread.sleep(3000);
        //Using the methods from the Select class
        sel.selectByVisibleText("Texas");
        Thread.sleep(3000);
        sel.selectByValue("Florida");
        Thread.sleep(3000);
        sel.selectByValue("Texas");
        System.out.println(sel.isMultiple());//returns true of the dropdown is multi-select
        List<WebElement> options=sel.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());//printing out the text on all options
            Thread.sleep(2000);
            option.click();//printing out the text on all options
        }

    }
}
