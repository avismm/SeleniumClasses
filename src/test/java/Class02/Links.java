package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://atlassian.com/");
        driver.manage().window().maximize();

        //get all the links and print them on the console
        driver.findElements(By.tagName("a"));
        List<WebElement> list=driver.findElements(By.tagName("a"));
        for(WebElement link:list){
            String nameOfLink=link.getText();
            System.out.println(nameOfLink);
            String linkVal=link.getAttribute("alex");
            System.out.println(linkVal);
        }

    }
}
