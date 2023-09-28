package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //finding the text box element using xpath and sending username
        WebElement textBox1=driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch17");

        //finding the text box element using xpath and sending display name
        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("Avis");

        //finding the text box element using xpath and sending security question
        WebElement textBox3=driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        textBox3.sendKeys("what is your high school name?");

        //finding the text box element using xpath and printing some text
        WebElement text=driver.findElement(By.xpath("//label[contains(text(),'aspernatur')]"));
        System.out.println(text.getText());

        //finding the text box
        WebElement apiBox=driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        apiBox.sendKeys("testing");

        //finding the text box
        WebElement email1=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("email1");

        //finding the text box
        WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("email2");

        //finding the text box
        WebElement email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("email3");

        //finding the text box
        WebElement field1=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("field1");

        //finding the text box
        WebElement field2=driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("field2");
    }
}
