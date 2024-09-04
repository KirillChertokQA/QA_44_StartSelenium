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
        inputCity.click();
        inputCity.sendKeys("Tel Aviv, Israel");

        WebElement inputDates = driver.findElement(By.cssSelector("[formcontrolname='dates']"));
        inputDates.click();

        WebElement btnYalla = driver.findElement(By.cssSelector("[type='submit']"));
        btnYalla.click();

        WebElement btnJoinNow = driver.findElement(By.cssSelector("[href='login']"));
        btnJoinNow.click();



    }
}
