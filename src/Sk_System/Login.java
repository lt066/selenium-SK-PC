package Sk_System;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {

	private WebDriver driver;
	
	public Login(WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	public void main()
	{
	      int m1 = 0;
	      int m2 = 0;
		  String a0="423",a1="231",a2="239",a3="396",a4="571",a5="817",a6="306",a7="843",a8="848";
		  String b0="781",b1="124",b2="447",b3="561",b4="580",b5="238",b6="320",b7="860",b8="445";
		  String c0="720",c1="689",c2="791",c3="235",c4="991",c5="140",c6="154",c7="997",c8="973";
		  String d0="117",d1="689",d2="658",d3="528",d4="741",d5="331",d6="445",d7="551",d8="940";
		  String e0="737",e1="139",e2="798",e3="753",e4="606",e5="470",e6="604",e7="748",e8="393";
		  String f0="498",f1="462",f2="266",f3="135",f4="911",f5="372",f6="919",f7="979",f8="443";
		  String g0="363",g1="792",g2="538",g3="754",g4="468",g5="950",g6="287",g7="478",g8="375";
		  String h0="319",h1="755",h2="125",h3="379",h4="255",h5="691",h6="597",h7="505",h8="343";
		  String i0="170",i1="602",i2="567",i3="179",i4="797",i5="612",i6="272",i7="321",i8="182";
		  String[] mibao={a0,a1,a2,a3,a4,a5,a6,a7,a8,b0,b1,b2,b3,b4,b5,b6,b7,b8,c0,c1,c2,c3,c4,c5,c6,c7,c8,d0,d1,d2,d3,d4,d5,d6,d7,d8,e0,e1,e2,e3,e4,e5,e6,e7,e8,f0,f1,f2,f3,f4,f5,f6,f7,f8,g0,g1,g2,g3,g4,g5,g6,g7,g8,h0,h1,h2,h3,h4,h5,h6,h7,h8,i0,i1,i2,i3,i4,i5,i6,i7,i8};
		  driver.get("http://skadmin.sk.com/");
		  driver.findElement(By.id("name")).sendKeys("π‹¿Ì‘±");
		  driver.findElement(By.id("pwd")).sendKeys("zxc123");
		  driver.findElement(By.id("login_sub")).click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  List<WebElement> sp= driver.findElements(By.className("identifying-cont"));
		  String sp1=sp.get(0).getText();
	      String[] sp2 =sp1.split("");
	      int num1 = Integer.parseInt(sp2[1]);
	      int num2 = Integer.parseInt(sp2[3]);
	      switch(sp2[0])
	      {
	      case "a":
	    	  m1=num1;
	    	  break;
	      case "b":
	    	  m1=num1+9;
	    	  break;
	      case "c":
	    	  m1=num1+18;
	    	  break;
	      case "d":
	    	  m1=num1+27;
	    	  break;
	      case "e":
	    	  m1=num1+36;
	    	  break;
	      case "f":
	    	  m1=num1+45;
	    	  break;
	      case "g":
	    	  m1=num1+54;
	    	  break;
	      case "h":
	    	  m1=num1+63;
	    	  break;
	      case "i":
	    	  m1=num1+72;
	    	  break;
	      }
	      switch(sp2[2])
	      {
	      case "a":
	    	  m2=num2;
	    	  break;
	      case "b":
	    	  m2=num2+9;
	    	  break;
	      case "c":
	    	  m2=num2+18;
	    	  break;
	      case "d":
	    	  m2=num2+27;
	    	  break;
	      case "e":
	    	  m2=num2+36;
	    	  break;
	      case "f":
	    	  m2=num2+45;
	    	  break;
	      case "g":
	    	  m2=num2+54;
	    	  break;
	      case "h":
	    	  m2=num2+63;
	    	  break;
	      case "i":
	    	  m1=num2+72;
	    	  break;
	      }
//	      System.out.println(m1);
//	      System.out.println(m2);
		  driver.findElement(By.id("i-box")).sendKeys(mibao[m1]+mibao[m2]);
		  System.out.println(mibao[m1]+mibao[m2]);
//		  System.out.println(sp2[0]);
//		  System.out.println(sp2[1]);
//		  System.out.println(sp2[2]);
//		  System.out.println(sp2[3]);
//		  System.out.println(num1);
//		  System.out.println(num2);

		  driver.findElement(By.id("J_identifyingCode-btn")).click();
	}
	
}
