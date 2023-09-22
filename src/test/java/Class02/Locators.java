package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();

        //locate the web element
        WebElement firstName=driver.findElement(By.id("first_name"));

        //write text into the element
        firstName.sendKeys("Avis");

//locate the web element second name
        WebElement lastName =driver.findElement(By.name("last_name"));
        lastName.sendKeys("Muhwerane");

        //locate the web element second name
        WebElement email =driver.findElement(By.className("form-control-01"));
        email.sendKeys("amuhwerane@gmail.com");

        //locate the button and click on it
        WebElement submitButton =driver.findElement(By.tagName("button"));
        submitButton.click();

        //locate the web element LINK
        WebElement linkBtn =driver.findElement(By.linkText("Link"));
        linkBtn.click();

        WebElement linkText =driver.findElement(By.partialLinkText("Here."));
        linkText.click();
    }
}
