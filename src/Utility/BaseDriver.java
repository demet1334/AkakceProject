package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    static {// public static void DriverBaslat() varmış gibi davranıp extend
        // edilen yerde ilk başta buy method direkt olarak çalışır

        // uyarıları gizleme
        Logger logger = Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE);             // sadece ERROR ları göster

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public static void BekleKapat() {
        MyFunc.Bekle(2);
        driver.quit();
    }

}
