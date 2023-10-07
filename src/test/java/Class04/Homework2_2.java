package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        //maximize windoww
        driver.manage().window().maximize();

        //find the Female checkbox
        WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@value='gender-female' and contains(@name,'ident')]"));

        //Checking if the female radio button is displayed and writing something in the console
        boolean femaleBtnDisplayState = femaleRadioButton.isDisplayed();
        if(femaleBtnDisplayState){
            System.out.println("the radio button is displayed");
        }
        else{
            System.out.println("the radio button is not displayed");
        }

//Finding the show button and clicking on it
        Thread.sleep(3000);
        WebElement showButton=driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        showButton.click();

//Finding the female radio button again and checking if it is now displayed and writing something in the console
        Thread.sleep(3000);
        femaleBtnDisplayState = femaleRadioButton.isDisplayed();
        if(femaleBtnDisplayState){
            System.out.println("the radio button is displayed");
        }
        else{
            System.out.println("the radio button is not displayed");
        }


    }

}
