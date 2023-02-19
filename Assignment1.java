package seleniumtrainee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.String;
import java.util.List;

public class Assignment1 {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/sudarshanhs/downloads/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        //opening google
        driver.get("https://www.google.co.in/?client=safari&channel=mac_bm");//navigate to()
        //redirecting to amazon

        WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys("amazon.in");//jsexecutor
        //submit the search
        search.submit();
        WebElement link=driver.findElement(By.xpath("//h3[normalize-space()='Amazon.in']"));
        link.click();

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dropdownlist=driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
          Select drpoptions =new Select(dropdownlist) ;
          //dispalying all the options
        List<WebElement> listdrpdwn=drpoptions.getOptions();//findelements()

        for(WebElement e: listdrpdwn){
            System.out.println(e.getText());
        }
          /*List <WebElement> allopt=drpoptions.getOptions();
          for(WebElement options:allopt)
          {
              if(options.getText().equals("Electronics"))
              {
                  options.click();
                  break;
              }
          }*/
        /// drpoptions.selectByVisibleText("Electronics");
         WebElement result= driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
          result.submit();

          WebElement searchtv=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
          searchtv.sendKeys("Sony Bravia 55 inch ");

          WebElement searchtv2=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
          searchtv2.submit();
          WebElement totalamount=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a/span[1]/span[2]/span[2]"));//absolute xpath
            System.out.println(totalamount.getText());

            }
        }



