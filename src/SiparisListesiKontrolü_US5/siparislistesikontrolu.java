package SiparisListesiKontrolü_US5;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

public class siparislistesikontrolu extends BaseDriver {

   @Test
    public void Test1() {
       driver.get("https://www.akakce.com/");

       WebElement login= driver.findElement(By.xpath("//*[text()='Giriş Yap']"));
       Actions aksiyonDriver = new Actions(driver);

       Action action = aksiyonDriver.moveToElement(login).click().build();
       wait.until(ExpectedConditions.visibilityOf(login));
       action.perform();

       WebElement eposta= driver.findElement(By.xpath("//input[@id='life']"));
       new Actions(driver).moveToElement(eposta).click().sendKeys("SeleniumProjectTeam@gmail.com").build().perform();

       WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
       new Actions(driver).moveToElement(sifre).click().sendKeys("Bugfighters1234!").build().perform();

       WebElement girisyap= driver.findElement(By.xpath("//input[@id='lfb']"));
      new Actions(driver).moveToElement(girisyap).click().build().perform();

       WebElement username= driver.findElement(By.linkText("Selen"));
       Action action1 = aksiyonDriver.moveToElement(username).click().build();
      wait.until(ExpectedConditions.elementToBeClickable(username));
       action1.perform();

       WebElement siparisler= driver.findElement(By.linkText("Siparişlerim"));
       Action action2 = aksiyonDriver.moveToElement(siparisler).click().build();
       wait.until(ExpectedConditions.visibilityOf(siparisler));
       action2.perform();

       WebElement siparistext= driver.findElement(By.xpath("//*[text()='Kayıtlı siparişiniz bulunmuyor.']"));
      Assert.assertTrue("Siparis Listeniz Bulunmuyor", siparistext.getText().equals("Kayıtlı siparişiniz bulunmuyor."));


      BekleKapat();














    }
}
