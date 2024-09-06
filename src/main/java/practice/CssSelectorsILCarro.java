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

        WebElement btnSearch = driver.findElement(By.cssSelector("a[ng-reflect-router-link='search']"));
        System.out.println(btnSearch.getText());

        WebElement btnLetCarWork = driver.findElement(By.cssSelector("div[class='header']>a:nth-child(2)"));
        System.out.println(btnSearch.getText());

       // WebElement spanCity = driver.findElement(By.cssSelector("form[class='ng-pristine ng-invalid ng-touched'] label[for='city']>span"));
       // System.out.println(spanCity.getAttribute("class"));


        WebElement inputCity = driver.findElement(By.cssSelector("[formcontrolname='city']"));

        WebElement inputDates = driver.findElement(By.cssSelector("[formcontrolname='dates']"));

        WebElement btnYalla = driver.findElement(By.cssSelector("[type='submit']"));

        WebElement btnJoinNow = driver.findElement(By.cssSelector("[href='login']"));
        btnJoinNow.click();


        pause(5);
        driver.quit();



    }

    public void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
