package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsILCarro {
    WebDriver driver = new ChromeDriver();

    @Test
    public void CssSelectors(){
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();


        WebElement inputCity = driver.findElement(By.cssSelector("[formcontrolname='city']"));

        WebElement inputDates = driver.findElement(By.cssSelector("[formcontrolname='dates']"));

        WebElement btnYalla = driver.findElement(By.cssSelector("[type='submit']"));

        WebElement btnJoinNow = driver.findElement(By.cssSelector("[href='login']"));
        btnJoinNow.click();



    }
}
