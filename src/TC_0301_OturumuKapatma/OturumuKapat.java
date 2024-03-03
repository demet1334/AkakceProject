package TC_0301_OturumuKapatma;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OturumuKapat extends BaseDriver {
    @Test
    public void Test3() {
        driver.get("https://www.akakce.com/");
        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));
        MyFunc.Bekle(2);
        Actions aksiyonDriver = new Actions(driver);

        WebElement girisYap = driver.findElement(By.xpath("(//header[@id='Marvin']//a)[4]"));
        wait.until(ExpectedConditions.visibilityOf(girisYap));
        girisYap.click();

        WebElement emailGir = driver.findElement(By.xpath("//form[@id='FrmLi']//input[@type='email']"));
        Action aksiyon1 = aksiyonDriver.moveToElement(emailGir).click().sendKeys("SeleniumProjectTeam@gmail.com").build();
        wait.until(ExpectedConditions.visibilityOf(emailGir));
        aksiyon1.perform();

        WebElement sifreGir = driver.findElement(By.xpath("//form[@id='FrmLi']//input[@type='password']"));
        Action aksiyon2 = aksiyonDriver.moveToElement(sifreGir).click().sendKeys("Bugfighters1234!").build();
        wait.until(ExpectedConditions.visibilityOf(sifreGir));
        aksiyon2.perform();

        WebElement girisYapButton = driver.findElement(By.xpath("(//form[@id='FrmLi']//input)[6]"));
        girisYapButton.click();

        wait.until(ExpectedConditions.titleContains("Akakçe"));

        //(//header[@id='Marvin']//a[@href='/akakcem/'])[4]  (//header[@id='Marvin']//a)[4]     [id='H_a_v8']       //header[@id='Marvin']//a[@title='Hesabım']
        WebElement hesabim = driver.findElement(By.xpath("//header[@id='Marvin']//a[@title='Hesabım']"));
        Action aksion3 = aksiyonDriver.moveToElement(hesabim).build();
        wait.until(ExpectedConditions.visibilityOf(hesabim));
        aksion3.perform();

        ////header[@id='Marvin']//a[@href='#Çık']   //a[@rel='nofollow']/..//li[6]/a)[1]    (//div[starts-with(@id,'HM')]//li)[6]/a
        WebElement cikis = driver.findElement(By.xpath("(//div[starts-with(@id,'HM')]//li)[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(cikis));
        Action aksiyon4 = aksiyonDriver.moveToElement(cikis).click().build();
        wait.until(ExpectedConditions.visibilityOf(cikis));
        aksiyon4.perform();

        WebElement cikisGor = driver.findElement(By.xpath("(//header[@id='Marvin']//a)[3]"));
        wait.until(ExpectedConditions.visibilityOf(cikisGor));

        wait.until(ExpectedConditions.titleContains("En Ucuz"));

        WebElement anaSayfaYonlendir = driver.findElement(By.xpath("(//header[@id='Marvin']//a)[1]"));

        String yonlendirme = anaSayfaYonlendir.getAttribute("title");
        Assert.assertEquals(yonlendirme, "Anasayfaya gitmek için tıklayın");
        System.out.println("yonlendirme = " + yonlendirme);


        BekleKapat();
    }
}
