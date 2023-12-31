package com.client;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineOrder {
	static WebDriver c;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		c.get("https://monsterchicken.cloudindigital.tech/");
		Thread.sleep(200);
//location selection
		c.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/location/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/location/div/div[1]/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/location/div/div[2]/button[1]")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/location/div/div[2]/button[2]")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/location/p-confirmdialog/div/div/div[3]/button[2]/span")).click();
		Thread.sleep(1000);
		System.out.println("location fetched successfully");
		
//Normal order 
		c.findElement(By.xpath("/html/body/app-root/monster-header/div/div/div/div[2]/ul/li[1]/a/span")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]/div/span")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/products-list/div/div[2]/div/div/div/product-card/div/div[2]/div/div[2]/div/button")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/products-list/div/div[2]/div/div/div/product-card/div/div[2]/div/div[2]/div/p-inputnumber/span/button[1]/span")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/products-list/div/div[2]/div/div/div/product-card/div/div[2]/div/div[2]/div/p-inputnumber/span/button[1]/span")).click();
		Thread.sleep(5000);
		c.findElement(By.xpath("/html/body/app-root/monster-header/div/div/div/div[2]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/app-cart-page/div/div[2]/div[2]/div/div[2]/button")).click();
	    Thread.sleep(1000);
	    System.out.println("product successfully added to cart");
	    
	 // Log in 
	    
			c.findElement(By.xpath("//*[@id=\"number\"]/span/input")).click();
			Thread.sleep(1000);
			c.findElement(By.xpath("//*[@id=\"number\"]/span/input")).sendKeys("68856885");
		    Thread.sleep(1000);
		    c.findElement(By.xpath("/html/body/ngb-offcanvas-panel/div/login/div/div/form[1]/div/div[1]/span/p-inputnumber/span/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		    Thread.sleep(1000);
		    c.findElement(By.xpath("//*[@id=\"number\"]/span/input")).sendKeys("6383428924");
		    Thread.sleep(1000);
	    	c.findElement(By.xpath("/html/body/ngb-offcanvas-panel/div/login/div/div/form[1]/div/div[2]/button")).click();
			Thread.sleep(20000);
		    c.findElement(By.xpath("/html/body/ngb-offcanvas-panel/div/login/div/div/form[2]/div/div[2]/button")).click();
		    Thread.sleep(1000);
		    System.out.println("Login successfully");
//
		    c.findElement(By.xpath("//*[@id=\"UEnui6DfRWLS1NjkW6T9PQ==\"]")).click();
		    Thread.sleep(1000);
		    c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div[2]/div/div[4]/div/button")).click();
		    Thread.sleep(1000);
	        c.findElement(By.xpath("//input[@class='form-check-input ng-pristine ng-valid ng-touched']")).click();
		    Thread.sleep(1000);
		    c.findElement(By.xpath("//button[@class='btn btn-danger rounded-0']")).click();
		    Thread.sleep(1000);
		    
// Adding new address		    
	//	    c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div[1]/div/button")).click();
		//    Thread.sleep(1000);
		  //  c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[1]/textarea")).sendKeys("187, Jawahar Nagar, Saibaba Colony, Coimbatore, Tamil Nadu 640138, India");
           // Thread.sleep(1000);
           // c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[2]/input")).sendKeys("user");
           // Thread.sleep(1000);
           // c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[3]/input")).sendKeys("45");
           // Thread.sleep(1000);
          //  c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[4]/input")).sendKeys("French street");
          //  Thread.sleep(1000);
          //  c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[5]/div/p-dropdown/div/span")).click();
          //  Thread.sleep(1000);
           // c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[5]/div/p-dropdown/div/p-overlay/div/div/div/div[2]/ul/p-dropdownitem[32]/li")).click();
            //Thread.sleep(1000);
           // c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[6]/div/p-dropdown/div/span")).click();
          //  Thread.sleep(1000);
        //    c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[6]/div/p-dropdown/div/p-overlay/div/div/div/div[2]/ul/p-dropdownitem[8]/li")).click();
      //      Thread.sleep(1000);
    //        c.findElement(By.xpath("//input[@id='home']//following-sibling::label[1]")).click();
           // Thread.sleep(1000);
           // c.findElement(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div/address-list/div/div/change-address/div/div[3]/form/div[10]")).click();
          //  Thread.sleep(3000);
           // System.out.println("New address added successfully");
         	
		
//Bulk order 
            
    c.findElement(By.xpath("/html/body/app-root/monster-header/div/div/div/div[2]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[1]/div/p-dropdown/div/span")).click();
  	Thread.sleep(1000);
		Robot cull = new Robot();
		cull.keyPress(KeyEvent.VK_DOWN);
		cull.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[2]/div/input")).sendKeys("300");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[4]/div/input")).sendKeys("Bulk user");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[5]/div/input")).sendKeys("bulkuser@gmail.com");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[6]/div/input")).sendKeys("8765432123");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[7]/div/textarea")).sendKeys("45, Murugan nagar , Kalapatti ");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[8]/div/p-dropdown/div/div[2]")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("//*[@id=\"pr_id_5_list\"]/p-dropdownitem[32]")).click();
		Thread.sleep(1000);
    	c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[9]/div/p-dropdown/div/span")).click();
		Thread.sleep(1000);
	    c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[9]/div/p-dropdown/div/p-overlay/div/div/div/div[2]/ul/p-dropdownitem[8]")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[10]/div/input")).sendKeys("kalapatti");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[11]/div/input")).sendKeys("641048");
		Thread.sleep(1000);
		c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[12]/div/textarea")).sendKeys(" as soon as possible");
		Thread.sleep(1000);
	    c.findElement(By.xpath("/html/body/app-root/bullk-order-form/div/div[2]/div/form/div/div[3]/div/div[13]/button")).click();
		Thread.sleep(1000);
		System.out.println("Bulk order placed successfully");
	
//Bulk order reflection in superadmin 
		
		c.get("https://test-monster-chicken-admin.vercel.app/auth/login");
		Thread.sleep(200);	
		c.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
		.sendKeys("superAdmin@monster.chicken");
Thread.sleep(1000);
c.findElement(
		By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
		.sendKeys("Monster@23Chicken");
Thread.sleep(1000);
c.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
		.click();
Thread.sleep(1000);
c.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/i")).click();
Thread.sleep(1000);
c.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[4]/ul/li[6]/a/span")).click();
Thread.sleep(1000);
c.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-bulk-order-list/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[9]/div[1]/button")).click();
Thread.sleep(1000);
c.findElement(By.xpath("//button[text() = ' Assign Supplier '][1]")).click();
Thread.sleep(1000);
Robot bulksupply = new Robot();
bulksupply.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);
c.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/button")).click();


		

	}

}
