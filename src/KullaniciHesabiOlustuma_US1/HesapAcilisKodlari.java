package KullaniciHesabiOlustuma_US1;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HesapAcilisKodlari extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");

        WebElement hesapAc= driver.findElement(By.xpath("(//header[@id='Marvin']//div)[5]//a[1]"));











    }

}
