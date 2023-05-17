package com.youtube.amazonselenium.steps;

import com.youtube.amazonselenium.pages.AmazonHomePage;
import com.youtube.amazonselenium.pages.AmazonResultsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HookStep {
    public static WebDriver driver;
    public static AmazonHomePage homePage;
    public static AmazonResultsPage resultsPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new AmazonHomePage(driver);
        resultsPage = new AmazonResultsPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
