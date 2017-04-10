package SeleniumScripts;

import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.TestMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.python.modules.thread.thread;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;


public class GmailOpenMailSearch {

	 // start of static block 
  static {
            System.out.println("static block 1 ");
         }
    
  static {
            System.out.println("static block 2 ");
         }


int a;
    
	     {
	        System.out.println(" non static block 1 ");
	     }
	  
	     {
	        System.out.println(" non static block 2 ");
	     }

	    GmailOpenMailSearch()
	     {
	    	 System.out.println("Constructor 1");
	    	// boolean k=false;
	    	 boolean testvalue=testmethod();
	    	 if (testvalue) {
	    		 System.out.println("Method output is -"+testvalue);
			}
	    	
	    	 else {
				System.out.println("method output is false");
			}
	    	 
	     }
	     	     
	     
			public boolean testmethod()
			{
				int a=10;
				//boolean k = false;
				//System.out.println("Value of k= " +k);
				System.out.println("Value of a= " +a);
				return true;
				
			}
			
			
			
			
			interface sample
			{
                static int b=99;
				abstract void newmethod();
				void newmethod2();
				
				void newmethod3();
			}
			
			abstract static class test1 implements sample
			{
				static int a=9;

				abstract void newmethod4();
				void newmethod5()
				{
					System.out.println("concreate method");
										
				}
				
				static void newmethod6() {
					System.out.println("static method3");
					System.out.println(a);
					System.out.println(sample.b);
				}
				
			}
	public static void main(String[] args) throws InterruptedException {
		
		
		/*for(int i=1;i<=1;i++)
		{
		WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		driver.get("http://gmail.com/");
		System.out.println(driver.findElement(By.xpath("//*[@id='Email']")).getAttribute("id"));
		System.out.println(driver.findElement(By.xpath("//*[@id='Email']")).getAttribute("placeholder"));
		System.out.println(driver.findElement(By.xpath("//*[@id='Email']")).getClass());
		System.out.println(driver.findElement(By.xpath("//*[@id='Email']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id='Email']")).getText());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("prem2604@gmail.com");
		System.out.println(driver.findElement(By.xpath("//*[@id='next']")).getAttribute("value"));
		
		boolean Next= driver.findElement(By.xpath("//*[@id='next']")).isEnabled();
		System.out.println(Next);
		if(Next==true)
		{
			System.out.println("Done");
		}
		else {
			System.out.println("Not Done");
		}
		
		driver.findElement(By.xpath("//*[@id='next']")).click();
		boolean Next1= driver.findElement(By.xpath("//*[@id='next']")).isEnabled();
		System.out.println(Next1);
		
		if(Next1==true)
		{
			System.out.println("Done");
		}
		else {
			System.out.println("Not Done");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("pavitri2604");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signIn']")).click();
		System.out.println(i);
		driver.quit();
		//Thread.sleep(15000);
		//driver.findElement(By.xpath("//div[@class='y6']/span[2][Contains(text(),'Prem, Sandeep Dubey has confirmed')]")).click();
		}*/
          
		System.out.println("Main method running");
		GmailOpenMailSearch con1=new GmailOpenMailSearch();

		//GmailOpenMailSearch con2=new GmailOpenMailSearch();

		//con1.testmethod();
		System.out.println(con1.a);
   	    con1.a=11;
   	    System.out.println(con1.a);
   	    
   	    //test1.newmethod3();
	   	 test1.newmethod6();
	   	   System.out.println(sample.b);
	   	   System.out.println(test1.b);
	   	
   	    
	}

}


