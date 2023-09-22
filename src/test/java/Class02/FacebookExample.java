package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();

        //locate the web element
        WebElement email=driver.findElement(By.id("email"));

        //write text into the element
        email.sendKeys("mpavis4@yahoo.co.uk");

        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("tuet)(345545");

        WebElement clickBtn=driver.findElement(By.name("login"));
        clickBtn.click();
/*
//locate the web element second name
        WebElement lastName =driver.findElement(By.name("last_name"));
        lastName.sendKeys("Muhwerane");

        //locate the web element second name
        WebElement email =driver.findElement(By.className("form-control-01"));
        email.sendKeys("amuhwerane@gmail.com");*/

    }
}
