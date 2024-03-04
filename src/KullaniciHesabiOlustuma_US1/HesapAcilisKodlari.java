package KullaniciHesabiOlustuma_US1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HesapAcilisKodlari extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.xpath("(//header[@id='Marvin']//div)[5]//a[1]"));
        Actions aksiyonDriver = new Actions(driver);

        Action action = aksiyonDriver.moveToElement(hesapAc).click().build();
        wait.until(ExpectedConditions.visibilityOf(hesapAc));
        action.perform();


        wait.until(ExpectedConditions.urlContains("giris"));

        WebElement kullaniciAdi = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[1]//input"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//form[@id='FrmRnuS']//span)[1]//input")));

        kullaniciAdi.sendKeys("Selen");
        // new Actions(driver).moveToElement(kullaniciAdi).click().sendKeys("Selen").build().perform();


        WebElement soyad = driver.findElement(By.cssSelector("[id='rnufs']"));
        soyad.sendKeys("Project");

        WebElement email = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[3]//input\n"));
        new Actions(driver).moveToElement(email).click().sendKeys("SeleniumProjectTeam@gmail.com").build().perform();

        WebElement email2 = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[4]//input\n"));
        new Actions(driver).moveToElement(email2).click().sendKeys("SeleniumProjectTeam@gmail.com").build().perform();

        WebElement sifre = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[5]//input\n"));
        new Actions(driver).moveToElement(sifre).click().sendKeys("Bugfighters1234!").build().perform();

        WebElement sifre2 = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[6]//input\n"));
        new Actions(driver).moveToElement(sifre2).click().sendKeys("Bugfighters1234!").build().perform();

        WebElement cinsiyet = driver.findElement(By.xpath("((//form[@id='FrmRnuS']//span)[7]//input)[1]\n"));
        cinsiyet.click();

        WebElement sehir = driver.findElement(By.cssSelector("[id='locpr']"));
        sehir.click();

        Select sehirMenu = new Select(sehir);
        sehirMenu.selectByValue("85");

        WebElement ilce = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[9]//select"));
        ilce.click();
        Select ilceMenu = new Select(ilce);
        //ilceMenu.selectByValue("426");
        ilceMenu.selectByIndex(3);
        //ilceMenu.selectByVisibleText("Beykoz");

        WebElement gun = driver.findElement(By.xpath("((//form[@id='FrmRnuS']//span)[10]//select)[1]"));
        gun.click();
        Select gunMenu = new Select(gun);
        gunMenu.selectByValue("17");

        WebElement ay = driver.findElement(By.xpath("((//form[@id='FrmRnuS']//span)[10]//select)[2]"));
        gun.click();
        Select ayMenu = new Select(ay);
        ayMenu.selectByValue("8");


        WebElement yil = driver.findElement(By.xpath("((//form[@id='FrmRnuS']//span)[10]//select)[3]"));
        yil.click();
        Select yilMenu = new Select(yil);
        yilMenu.selectByValue("2003");


        WebElement checkBox1 = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[14]//input"));
        checkBox1.click();


        WebElement checkBox2 = driver.findElement(By.xpath("(//form[@id='FrmRnuS']//span)[15]//input"));
        checkBox2.click();

        WebElement hesapAcBtn = driver.findElement(By.xpath("((//form[@id='FrmRnuS'])//input)[17]"));
        hesapAcBtn.click();

        BekleKapat();


    }
}
