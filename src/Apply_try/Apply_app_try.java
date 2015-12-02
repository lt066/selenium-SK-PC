package Apply_try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Apply_app_try {
	
	public WebDriver driver;
    public String[] c = new String[10];
    public int try_number;
    public int j;
    
    
	  public void apply_try()
	  {
		    for(;j<=try_number;j++)
		    {

		         driver.get("http://platinum.sk.com/"+c[j]+".html");
		         driver.findElement(By.xpath("//a[contains(@href,'http://login.sk.com/logout/?to=http://platinum.sk.com/"+c[j]+".html')]")).click();
		         driver.findElement(By.id("J_btn"));
		         driver.findElement(By.id("J_btn")).click();
	             WebElement frame3=driver.findElement(By.name( "Openwin-login" ));
		         driver.switchTo().frame(frame3);
		         driver.findElement(By.id("username")).sendKeys("user178");
		         driver.findElement(By.id("password")).sendKeys("zxc123");
		         driver.findElement(By.id("btn_submit")).click();
		         driver.findElement(By.id("J_btn")).click();
		         driver.switchTo().defaultContent();

		    }
	  }

}
