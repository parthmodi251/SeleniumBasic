package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class RadioButton {
    public WebDriver driver;
    String url = "https://www.letskodeit.com/practice";
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test

    public void testRadioButton() throws InterruptedException {
        driver.findElement(By.id("bmwradio")).click();
        boolean ans = driver.findElement(By.id("bmwradio")).isSelected();
        assertEquals(true,ans);
        Thread.sleep(3000);
    }
    @After

        public void teardown (){
    driver.close();
    }


}
