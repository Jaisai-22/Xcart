package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowserTest {
    public static void main(String[] args) {


        String baseUrl= "https://www.x-cart.com/";
        WebDriver driver;
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String title= driver.getTitle();
        System.out.println(title);

        driver.close();

    }
}
