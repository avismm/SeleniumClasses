package Class03.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework2_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        //maximize windoww
        driver.manage().window().maximize();

        //finding the list of checkboxes and storing them
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        Thread.sleep(3000);

            //iterating over the list of checkboxes to find checkbox1
        for(WebElement e1:checkBoxes){
            String checkBox1 =e1.getAttribute("value");

            /*After finding checkbox1, checking whether it is currently disabled and performing some operations
            as per instructions*/
            if(checkBox1.equalsIgnoreCase("Checkbox-1")){
                boolean isEnabledState1=e1.isEnabled();
                if(!isEnabledState1) {
                    System.out.println("Checkbox1 is currently disabled");
                    WebElement enableCheckboxes = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    Thread.sleep(3000);
                    enableCheckboxes.click();
                }
              boolean isEnabledState2 =e1.isEnabled();
                if(isEnabledState2){
                    System.out.println("Checkbox1 is now enabled");
                }else{
                    System.out.println("Checkbox1 is not enabled");
                }

                Thread.sleep(3000);
                e1.click();
                boolean isEnabledState3 =e1.isSelected();
                if(isEnabledState3){
                    System.out.println("Checkbox1 is now selected");
                }else{
                    System.out.println("Checkbox1 is not selected");
                }

            }
        }

    }

}
