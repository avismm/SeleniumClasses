package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utils.CommonMethods;
import java.util.List;

public class E4Tables extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/table-search-filter-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        List<WebElement> statusElements=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int i=0;

        for(WebElement status:statusElements){
            if(status.getText().equalsIgnoreCase("In progress")){
                System.out.println("The row number is "+i);
                WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr ["+ (i+1) +"]"));
                System.out.println(row.getText());
            }
            i++;
        }
    }
}
