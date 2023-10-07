package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        //maximize window
        driver.manage().window().maximize();
        //slow down to observer the process
        Thread.sleep(2000);

        //go to google.com. navigate method allows is to move back and forth
        driver.navigate().to("https://facebook.com");

        //go back to google.com
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

        //closing the browser
        driver.close();


    }
}
