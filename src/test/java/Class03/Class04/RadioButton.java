package Class03.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        //maximize windoww
        driver.manage().window().maximize();

        //finding the radio button Male
        WebElement radioButonMale=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioButonMale.click();

        //Check if we were able to select the radio button or not
        boolean btnIsSelected=radioButonMale.isSelected();
        if(btnIsSelected){
            System.out.println("The radion button was selected");
        }else{
            System.out.println("The radio button was not selected");
        }

        //check if the radio button is enabled
         boolean btnIsEnabled=radioButonMale.isEnabled();
        System.out.println("Is the radio button is enabled: "+btnIsEnabled);

        //check if the radio button is displayed
        boolean btnIsDisplayed=radioButonMale.isDisplayed();
        System.out.println("Is the radio button is displayed: "+btnIsDisplayed);

        //From the age range, select 5-15
       List<WebElement> ageRanges =driver.findElements(By.xpath("//input[@name= 'ageGroup']"));

       //for each element ageRange in a list of ageRanges
       for(WebElement ageRange:ageRanges){
           //get the value of the webElement's attribute "value"
           String option =ageRange.getAttribute("value");
           if(option.equalsIgnoreCase("5 - 15")){
               ageRange.click();
           }
       }
/*
        //find profileName text box using the shortcut tagname#value. Works for the attribute name ID. # stands for ID
        WebElement profileName=driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("avismuhwerane");

        //find feedback text box using the class attribute
        WebElement feedbackJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
                feedbackJenny.sendKeys("avismuhwerane");

        //find feedback text box using the clas attribute with spaces in it
        WebElement feedbackFromRej=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackFromRej.sendKeys("not working");

        //find profileID text box using the class attribute with spaces in it
        WebElement courseTopic=driver.findElement(By.cssSelector("input[name*='contentInp']"));
        courseTopic.sendKeys("CSS Selenium");

        //find profileID text box using the CSS starts with command
        WebElement introToAdv=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introToAdv.sendKeys("CSS Selenium");

        //find profileID text box using the CSS ends with command
        WebElement conclusionOfCss=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusionOfCss.sendKeys("end of CSS");*/

    }

}
