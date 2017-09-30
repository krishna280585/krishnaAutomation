import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;
import static org.junit.Assert.assertEquals;
public class Register extends Hooks {

    @Test
    public void register() throws InterruptedException {
        driver.findElement(By.linkText("Register")).click();
        Random r=new Random();
        int result=r.nextInt();
        System.out.println(result);
        driver.findElement(By.name("uname22")).sendKeys("Dhruvin");
        driver.findElement(By.name("email22")).sendKeys("sk.kotinadhuni"+result+"@gmail.com");
        driver.findElement(By.name("pass22")).sendKeys("llb33954");
        driver.findElement(By.name("cpass22")).sendKeys("llb33954");
        driver.findElement(By.name("phone22")).sendKeys("07404856740");
        driver.findElement(By.name("address22")).sendKeys("80skeffington road");
        // WebElement element =  driver.findElement(By.xpath(".//*[@id='f1']/div[7]/input"));
        //System.out.println("this is the element visible"+element.isDisplayed());
        //element.sendKeys("E6 2NB");
        driver.findElement(By.name("postal")).sendKeys("E6 2NB");
        driver.findElement(By.name("reg_button1")).click();
       // assertEquals("Dhruvin",driver.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div[2]/h2/a")).getText());
        boolean textpresent=driver.getPageSource().contains("Dhruvin");
        Assert.assertTrue(textpresent);
        System.out.println(textpresent);
        // driver.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div[2]/h2/a")).isDisplayed();
    }

    private void Wait() {
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}