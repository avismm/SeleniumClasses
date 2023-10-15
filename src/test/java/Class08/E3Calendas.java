package Class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E3Calendas extends CommonMethods {
    public static void main(String[] args) {

        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        find the username
        WebElement usrName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usrName.sendKeys("Admin");
//        find the password
        WebElement paswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        paswrd.sendKeys("Hum@nhrm123");

//        find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        loginBtn.click();
//        click on leave
        WebElement PIM = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIM.click();

       // open calenda
        WebElement calenda = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        PIM.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selMonth=new Select(month);
        selMonth.selectByVisibleText("Aug");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selyear=new Select(month);
        selyear.selectByVisibleText("2023");

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date:dates){
            String text= date.getText();
            if(text.equals("4")){
                date.click();
                break;
            }

        }

            }
        }


