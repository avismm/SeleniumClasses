package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlesHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/challenge/pwd?TL=AJeL0C4jBw2zqlDY7M3MwckVovojqExMsjKNxNKdQppiQMdk2-s1erRODxqIkcE_&checkConnection=youtube%3A962%3A0&checkedDomains=youtube&cid=2&continue=https%3A%2F%2Fmail.google.com&dsh=S-636570080%3A1696517864586786&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en&ifkv=AYZoVhephW46EOG7Ji8vRoCJmUpQ4YIX-XVL_Bl5K4ihMawHUvKsaSaNvWzwNF-ktJ8426Glk7oEMQ&pstMsg=1&theme=glif");
        //maximize window
        driver.manage().window().maximize();

        //click on the help and privacy buttons
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();

        //Task1: get the handle of the current page
        System.out.println(driver.getWindowHandle());
        String text=driver.getTitle();

        //Task2: get handles of all open tabs. This returns a set of handles which are unique with no particular order.
        Set<String> allHandles = driver.getWindowHandles();
        //looping through the handles elements to find the address
        for (String handle : allHandles) {
            //get selenium to point to the handle variable for each iteration.
            driver.switchTo().window(handle);
            //  check if the title of current handle matches desired title. If true, break loop.
            if (driver.getTitle().equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")) {
                System.out.println(driver.getTitle());
                break;
            }
        }
        // Switch focus back to the Gmail page and print page title
            driver.switchTo().defaultContent();
            System.out.println(text);
    }
}
