package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //maximize windoww
        driver.manage().window().maximize();
        WebElement creatAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        creatAccount.click();
        Thread.sleep(2000);
        //fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");
        System.out.println(driver.getTitle());





    }
}
