package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Homework1
{

    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);

        driver.manage().window(); //maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click();
        driver.findElement(By.xpath("//ul[@class='sublist']/li[1]/a ")).click();
        String regMsg1 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[1]//h2/a"))).getText();
        //System.out.println("Item no.1:"+regMsg1);
        String regMsg2 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[2]//h2/a"))).getText();

        String regMsg3 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[3]//h2/a"))).getText();
        //System.out.println("Item no.3:"+regMsg3);
        driver.close();
        System.out.println("Item no.1:"+regMsg1);
        System.out.println("Item no.2:"+regMsg2);
        System.out.println("Item no.3:"+regMsg3);

    }




}
