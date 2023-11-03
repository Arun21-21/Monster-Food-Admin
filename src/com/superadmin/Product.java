package com.superadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Product {
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
	    Thread.sleep(200);
//invalid login
	    d.findElement(By.xpath("//*[@id=\"userName\"]")).click();  
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input")).sendKeys("superAdmin@monster.chicken");
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input")).sendKeys("Monster@23Chicke");
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button")).click();
	    Thread.sleep(2000);
	    d.navigate().refresh();
//valid login
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input")).sendKeys("superAdmin@monster.chicken");
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input")).sendKeys("Monster@23Chicken");
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button")).click();
	   
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span")).click();
//Categories
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a/span")).click();
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[3]/button")).click();
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
//sales product	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/input")).sendKeys("Whole chicken");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("Whole chicken|sales product");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[4]/div/input")).sendKeys("Whole chicken|sales product");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[5]/div/input")).sendKeys("Whole chicken|sales product");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[6]/div/textarea")).sendKeys("Whole chicken |sales product");
	    Thread.sleep(500);
	    d.findElement(By.xpath("//*[@id=\"formFile\"]")).sendKeys("C:\\Users\\D E L L\\Pictures\\Camera Roll\\download (4).jpg");
	    Thread.sleep(500);
	    d.findElement(By.xpath("//*[@id=\"btn-save-event\"]")).click();
	    d.navigate().refresh();
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
//Categories filter
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select")).click();
	    Robot a = new Robot();
	    a.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select")).click();
	    Robot b = new Robot();
	    b.keyPress(KeyEvent.VK_DOWN);
	    b.keyRelease(KeyEvent.VK_DOWN);
	    b.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select")).click();
	    Robot c = new Robot();
	    c.keyPress(KeyEvent.VK_DOWN);
	    c.keyRelease(KeyEvent.VK_DOWN);
	    c.keyPress(KeyEvent.VK_DOWN);
	    c.keyRelease(KeyEvent.VK_DOWN);
	    c.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select")).click();
	    Robot e = new Robot();
	    e.keyPress(KeyEvent.VK_DOWN);
	    e.keyRelease(KeyEvent.VK_DOWN);
	    e.keyPress(KeyEvent.VK_DOWN);
	    e.keyRelease(KeyEvent.VK_DOWN);
	    e.keyPress(KeyEvent.VK_DOWN);
	    e.keyRelease(KeyEvent.VK_DOWN);
	    e.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select")).click();
	    Robot f = new Robot();
	    f.keyPress(KeyEvent.VK_DOWN);
	    f.keyRelease(KeyEvent.VK_DOWN);
	    f.keyPress(KeyEvent.VK_DOWN);
	    f.keyRelease(KeyEvent.VK_DOWN);
	    f.keyPress(KeyEvent.VK_DOWN);
	    f.keyRelease(KeyEvent.VK_DOWN);
	    f.keyPress(KeyEvent.VK_DOWN);
	    f.keyRelease(KeyEvent.VK_DOWN);
	    f.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select")).click();
	    Robot g = new Robot();
	    g.keyPress(KeyEvent.VK_DOWN);
	    g.keyRelease(KeyEvent.VK_DOWN);
	    g.keyPress(KeyEvent.VK_DOWN);
	    g.keyRelease(KeyEvent.VK_DOWN);
	    g.keyPress(KeyEvent.VK_DOWN);
	    g.keyRelease(KeyEvent.VK_DOWN);
	    g.keyPress(KeyEvent.VK_DOWN);
	    g.keyRelease(KeyEvent.VK_DOWN);
	    g.keyPress(KeyEvent.VK_DOWN);
	    g.keyRelease(KeyEvent.VK_DOWN);
	    g.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.navigate().refresh();
//Adding raw product 
	    d.get("https://test-monster-chicken-admin.vercel.app/products/list");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[3]/button")).click();
	   Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
	    Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_DOWN);
	    i.keyRelease(KeyEvent.VK_DOWN);
        i.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/input")).sendKeys("Raw bird");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/ng-select/div/div/div[2]/input")).click();
	    Robot j = new Robot();
	    j.keyPress(KeyEvent.VK_DOWN);
	    j.keyRelease(KeyEvent.VK_DOWN);    
	    j.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(200);
	  //  d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[5]/div/ng-select/div/div/div[2]/input")).click();
	  //  Robot k = new Robot();
	 //   k.keyPress(KeyEvent.VK_DOWN);
	 //   k.keyRelease(KeyEvent.VK_DOWN);
	  //  k.keyPress(KeyEvent.VK_DOWN);
	//    k.keyRelease(KeyEvent.VK_DOWN);
	//    k.keyPress(KeyEvent.VK_ENTER);
	  //  Thread.sleep(200);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[7]/div/input")).sendKeys("200");
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[8]/div/input")).sendKeys("300");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[9]/div/textarea")).sendKeys("Raw product");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[10]/div/input")).sendKeys("Raw product | Chicken");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[11]/div/input")).sendKeys("Raw product | Chicken");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[12]/div/input")).sendKeys("Raw product | Chicken)");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[13]/div/textarea")).sendKeys("Raw product | Chicken");
	    Thread.sleep(500);
	    d.findElement(By.xpath("//*[@id=\"formFile\"]")).sendKeys("C:\\Users\\D E L L\\Pictures\\country bird.jpg");
	    Thread.sleep(500);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/button")).click();
	    Thread.sleep(500);
	    d.navigate().refresh();
	    Thread.sleep(1000);
        d.get("https://test-monster-chicken-admin.vercel.app/products/list");
        
//Product filter
        Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select")).click();
	    Robot raw = new Robot();
	    raw.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/list");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select")).click();
	    Robot sale = new Robot();
	    sale.keyPress(KeyEvent.VK_DOWN);
	    sale.keyRelease(KeyEvent.VK_DOWN);
	    sale.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.get("https://test-monster-chicken-admin.vercel.app/products/list");
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select")).click();
	    Robot bulk = new Robot();
	    bulk.keyPress(KeyEvent.VK_DOWN);
	    bulk.keyRelease(KeyEvent.VK_DOWN);
	    bulk.keyPress(KeyEvent.VK_DOWN);
	    bulk.keyRelease(KeyEvent.VK_DOWN);
	    bulk.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    
	    
	    
	  
	    
	   
	    
	    
	    
//search option
	   // d.navigate().refresh();
	   // d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[2]/div/input")).sendKeys("MC-PRO-CATE-2");
	   // Thread.sleep(5000);
	 // d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[2]/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	//Thread.sleep(5000);
//CUtting center login
	    d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
	    Thread.sleep(200);
	    d.findElement(By.xpath("//*[@id=\"userName\"]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input")).sendKeys("jhzpoenmuzqmajkrfv@cazlg.com");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input")).sendKeys("123monsterchicken");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button")).click();
//Shop product purchase order
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[1]/div[1]/div/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[1]/div/ng-select/div/div/div[2]/input")).click();
// select raw product to purchase 
	    Robot h = new Robot();
	    h.keyPress(KeyEvent.VK_ENTER);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[2]/div/input")).sendKeys("Best Quanlity");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"btn-save-event\"]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-edit/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
	    Robot product = new Robot();
	    product.keyPress(KeyEvent.VK_DOWN);
	    product.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    
	    
	    
	    
	  //robot h = new Robot();
	//  h.keyPress(KeyEvent.VK_BACK_SPACE);
	    
	  //h.keyRelease(KeyEvent.VK_BACK_SPACE);
	 // h.keyPress(KeyEvent.VK_BACK_SPACE);
	 // h.keyRelease(KeyEvent.VK_BACK_SPACE);
	 // h.keyPress(KeyEvent.VK_BACK_SPACE);
	 // h.keyRelease(KeyEvent.VK_BACK_SPACE);
	 // h.keyPress(KeyEvent.VK_BACK_SPACE);
	 // h.keyRelease(KeyEvent.VK_BACK_SPACE);
	 // h.keyPress(KeyEvent.VK_BACK_SPACE);
	//  h.keyRelease(KeyEvent.VK_BACK_SPACE);
	//  h.keyPress(KeyEvent.VK_BACK_SPACE);
	 // h.keyRelease(KeyEvent.VK_BACK_SPACE);
	  //h.keyPress(KeyEvent.VK_BACK_SPACE);
	 // h.keyRelease(KeyEvent.VK_BACK_SPACE);
	 // h.keyPress(KeyEvent.VK_BACK_SPACE);
	 // h.keyRelease(KeyEvent.VK_BACK_SPACE);
	    //d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
	   // d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[2]/div/input")).sendKeys("Brolier chicken");

	    
	    
	    

		   
	    
	    
	 
	    
	    // r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyRelease(KeyEvent.VK_DOWN);
	    //Thread.sleep(100);
	    //r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyRelease(KeyEvent.VK_DOWN);
	    //Thread.sleep(100);
	    //r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyRelease(KeyEvent.VK_DOWN);
	    //Thread.sleep(100);
	    //r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyRelease(KeyEvent.VK_DOWN);
	    //Thread.sleep(100);
	    //r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyRelease(KeyEvent.VK_DOWN);
	    
	    
		
	}



	}


