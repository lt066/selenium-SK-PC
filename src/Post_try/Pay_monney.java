package Post_try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pay_monney {
	
	public WebDriver driver;

	public void main()
	{

		
        driver.findElement(By.className("btn-orange")).click();
        boolean f=true;
		
        while(f)
        {
       	 try{
       		 WebElement frame=driver.findElement(By.xpath( "/html/body/div/iframe" ));
       		 driver.switchTo().frame(frame);
       		 driver.findElement(By.id("password")).sendKeys("a123456");
       		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       		 WebElement cl = driver.findElement(By.className("subBtn"));
       		 cl.click();
       		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       		 driver.switchTo().defaultContent();
       		 f=false;
       	 }
       	 catch(Exception e)
       	 {
       		 e.printStackTrace();
       	 }
	 
        }
        
        while(true)
        {
      	  if(driver.getCurrentUrl().contains("pay_back"))
      		  	break;
        }
	}
}
