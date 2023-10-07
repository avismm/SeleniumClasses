package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //go to facebool
        driver.get("http://35.175.58.98/cssSelector.php");
        //maximize windoww
        driver.manage().window().maximize();

        //find profileID text box
        WebElement profileID=driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("amuhwerane");

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
        conclusionOfCss.sendKeys("end of CSS");

    }

}
