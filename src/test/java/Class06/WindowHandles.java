package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AYZoVhewZXrUKX2W7x_nZfskqGRw6uabZr91SroGOiGGCKCcT-hZJw63FYTlZS56O4CkrcjbpbYCCg&osid=1&passive=1209600&service=mail&theme=glif");
        //maximize window
        driver.manage().window().maximize();

        //click on the help and privacy buttons
        WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpBtn.click();
        privacyBtn.click();

      //Task1: get the handle of the current page
        System.out.println(driver.getWindowHandle());

        //Task2: get handles of all open tabs. This returns a set of handles which are unique with no particular order.
       Set<String> allHandles=driver.getWindowHandles();
      //looping through the handles elements to find the address
        for(String handle:allHandles){
            driver.switchTo().window(handle);
          //  check if the title of current handle matches desired title. If true, break loop.
            if(driver.getTitle().equalsIgnoreCase("Privacy Policy – Privacy &amp; Terms – Google"))
                break;
        }
        System.out.println(driver.getCurrentUrl());

    }
}
