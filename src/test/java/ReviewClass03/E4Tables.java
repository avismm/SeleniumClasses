package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class E4Tables extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/table-search-filter-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //finding the changetext button to click on
        List<WebElement> statusElements=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int i=0;
        for(WebElement status:statusElements){
            if(status.getText().equalsIgnoreCase("In progress")){
               // String text=status.getText();
                System.out.println("The row number is "+i);
                WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr/td["+i+"]"));
                System.out.println(row.getText());
                break;
            }
            i++;
        }

    }
}
