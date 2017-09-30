
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class ContactUs extends Hooks {
    @Test
    public void contactUs_testcase1() throws InterruptedException {
        System.out.println("OPENING THE CONTACT US PAGE");
        driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[4]/a")).click();
        Wait();
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[1]/div[1]/div/input")).sendKeys("krishna");
        Wait();
        Random r = new Random();
        int random = r.nextInt();
        driver.findElement(By.name("email")).sendKeys("km.nilla" + random + "@gmail.com");
        // assertEquals("Invalid Email Format",driver.findElement(By.xpath("//*[@id='contact-form']/div[1]/div[2]/div/span[2]")).getText());
        Wait();////*[@id="contact-form"]/div[1]/div[2]/div/span[2]
        driver.findElement(By.name("subject")).sendKeys("Hello");
        Wait();
        driver.findElement(By.name("message")).sendKeys("its a nice product");
        Wait();
        driver.findElement(By.name("btnSubmit")).click();
       // assertEquals("Your message successfully sent, Thank You", driver.findElement(By.xpath("//*[@id=\"mytrm\"]/div/div/div[1]/font")).getText());
        Alert alert=driver.switchTo().alert();
        System.out.println(alert);
        boolean textPresent = driver.getPageSource().contains("Your message successfully sent, Thank You");
        Assert.assertTrue(textPresent);
        System.out.println(textPresent);
        driver.findElement(By.xpath("//*[@id='mytrm']/div/div/div[2]/a/button")).click();
    }

    @Test
    public void contactus_assert() {
        System.out.println("OPENING THE CONTACT US PAGE");
        driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[4]/a")).click();
        Wait();
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[1]/div[1]/div/input")).sendKeys("krishna");
        Wait();
        driver.findElement(By.name("email")).sendKeys("km.nillagmail.com");
        boolean email = driver.getPageSource().contains("Invalid Email Format");
        Assert.assertTrue(email);
        System.out.println(email);
        //WebElement fb1=driver.findElement(By.xpath("*[@id='contact-form']/div[1]/div[2]/div/span[2]"));
        //String actual=fb1.getText();
        //String expected="Invalid Email Format";
        //assertEquals(expected,actual);
        driver.findElement(By.name("subject")).sendKeys("Haiiii");
        driver.findElement(By.name("message")).sendKeys("its a nice product");
        driver.findElement(By.name("btnSubmit")).click();
    }

    @Test

   public  void Wait() {
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
