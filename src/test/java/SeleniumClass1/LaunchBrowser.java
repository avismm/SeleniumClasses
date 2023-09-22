package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//In case the dependencies are not automatically fetched, press on the error and then Alt+Enter
//or you can add the dependencies by manually typing them.

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

//creating an object of WebDriver
        WebDriver driver = new ChromeDriver();
        /*driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.close();*/
        driver.get("https://google.com");// navigates you to a particular url
        //driver.get("https://facebook.com");// navigates you to a particular url
        System.out.println(driver.getTitle());

        //maximizing the window
        driver.manage().window().maximize();

        //getting the url of the website
       String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url is "+currentUrl);
if(currentUrl.equals("https://amazon.com")){
    System.out.println("Current url is correct");
}else{
    System.out.println("Current url is incorrect");

    //get current Title
    String title = driver.getTitle();
    System.out.println("The current title of the page is "+title);

    //added a wait of two seconds before closing the browser/
    //this should be deleted after you are done with the script
    Thread.sleep(2000);
    //close browser
    driver.quit();
}
        //driver.quit();
    }
}
