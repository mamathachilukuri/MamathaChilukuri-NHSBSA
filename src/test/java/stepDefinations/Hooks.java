package stepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilis.EnvReader;

import java.io.IOException;

public class Hooks {
    public static WebDriver driver;
    public static String browser;

    @Before
    public void startUp() throws IOException {
        browser = System.getProperty("browser_name");
        System.out.println("browser" + System.getProperty("browser_name"));
            if (browser.equalsIgnoreCase("chrome")) {
               WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("firefox")) {
               WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
    }

    @After
    public void after(Scenario scenario){
        scenario.write("Current page url" + driver.getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");

        driver.quit();
    }

}

