package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
    public static  WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        //instance

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }


        // goto facebook.com
        driver.get(url);
        //        maximize the window
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        driver.quit();
    }

}