package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        //maximize windoww
        driver.manage().window().maximize();

        //select checkbox
        WebElement checkBox1=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();

        //if it is selected after click
        boolean selectState = checkBox1.isSelected();
        if(selectState){
            System.out.println("the checkbox is selected");
        }
        else{
            System.out.println("the checkbox isn't selected");
        }


        //select all options
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        Thread.sleep(3000);
        for(WebElement e1:checkBoxes){
            e1.click();
        }

        // for each element e2 in a list of checkBoxes, we want to check and deselect option 3
        for(WebElement e2:checkBoxes){
            //check the attribute value to verify the option to uncheck
            String option3 =e2.getAttribute("value");
            if(option3.equalsIgnoreCase("Option-3")){
                e2.click();
            }
        }
    }
}
