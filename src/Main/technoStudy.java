package Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.Tools;

import java.util.Set;

public class technoStudy extends BaseDriver {
    Elements el = new Elements();

    @Test
    public void Test_US_1() {

        Elements elements = new Elements();

        // wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();


        for (int i = 0; i < elements.coursesList.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
            Assert.assertTrue(elements.coursesList.get(i).isEnabled(), "Kurs bulunamadi");
        }
    }

    @Test(enabled = false)
    public void Test2() {
        Elements elements = new Elements();
        wait.until(ExpectedConditions.elementToBeClickable(elements.campusLogin)).click();
        Assert.assertTrue(elements.loginButton.isDisplayed());

    }

    @Test(enabled = false)
    public void Test3() {
        Elements elements = new Elements();


        elements.basvur.click();
        elements.nameSurnameInput.sendKeys("testyusuf ucucu");
        elements.email.sendKeys("test_team@gmail.com");
        elements.phoneNumberInput.sendKeys("5212102121");
        elements.age.sendKeys("22");

        elements.job.sendKeys("QA Enginner");


        Select select = new Select(elements.egitimDurumu);
        select.selectByValue("Üniversite");

        Select select1 = new Select(elements.ulke);
        select1.selectByVisibleText("Algeria");

        Select select2 = new Select(elements.kurs);
        select2.selectByValue("Job Center & Arbeitsamt");

        Select select3 = new Select(elements.biziNeredenDuydun);
        select3.selectByValue("Instagram");

        elements.promo.sendKeys("TestTeam3dh");
        elements.okudumKabulEdiyorum.click();

        elements.gonder.click();

    }

    @Test(enabled = false)
    public void Tes4() {
        Elements elements = new Elements();
        elements.courses.click();

        for (WebElement e : elements.coursesList) {
            System.out.println(e.getText());

        }
        elements.sdet.click();
        String getUrl = driver.getCurrentUrl();
        Assert.assertTrue(getUrl.contains("sdet"), "gecersiz URL");
//        Test Case 5: Submenu Social Media
//        1. Web sitesinin alt menüsünde "Sosyal Medya" hesaplarına ulaşabileceğim bir alan
//        bulunmalıdır.
//        2. Her sosyal medya hesabının adı ve/veya simgesi görünmelidir.
//        3. İstediğim bir sosyal medya hesabına tıkladığımda, ilgili sosyal medya sayfası veya profil
//        açılmalıdır.

    }
    @Test
    public void Test5()
    {
        Elements elements = new Elements();

        elements.bilgiAlin.click();

        Actions actions=new Actions(driver);
        actions.scrollToElement(elements.gonder);
        Tools.Sleep(7);

   wait.until(ExpectedConditions.elementToBeClickable(elements.linkedln)).click();


    }
    @Test(enabled = false)
    public void Test6()
    {
        Elements elements = new Elements();
        for (int i = 0; i < elements.coursesList.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.courses)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.coursesList.get(i))).click();
            Assert.assertTrue(elements.logo.isEnabled());
    }
        elements.bilgiAlin.click();
        Assert.assertTrue(elements.logo.isEnabled());
        elements.logo.click();

        Actions actions=new Actions(driver);
        actions.scrollToElement(elements.gonder);
        Assert.assertTrue(elements.logo.isEnabled());
        elements.logo.click();

}

@Test(enabled = false)
public void Test7()
{
    Elements elements = new Elements();
    elements.courses.click();
    elements.sdet.click();
    Assert.assertTrue(elements.text.isDisplayed());



    }



   @Test(enabled = false)
    public void Test8() {
       Elements elements = new Elements();

       elements.bilgiAlin.click();
       Actions actions = new Actions(driver);
       actions.scrollToElement(elements.gonder);


       elements.okudumKabulEdiyorum.click();

       String orjinalWindow = driver.getWindowHandle();


       Set<String> allwindow = driver.getWindowHandles();

       for (String windowHandle : allwindow) {
           if (!windowHandle.equals(orjinalWindow)) {
               driver.switchTo().window(windowHandle);
               break;
           }
           elements.campusLogin.click();
           Assert.assertTrue(elements.kullanimSartlariGoruntulenme.isDisplayed());


       }
   }}