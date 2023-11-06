package com.superadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Product {
	static WebDriver d;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
		Thread.sleep(200);		
		
// invalid login
		
		d.findElement(By.xpath("//*[@id=\"userName\"]")).click();
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
				.sendKeys("superAdmin@monster.chicken");
		Thread.sleep(1000);
		d.findElement(
				By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
				.sendKeys("Monster@23Chicke");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
				.click();
		Thread.sleep(5000);
		d.navigate().refresh();
// valid login
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
				.sendKeys("superAdmin@monster.chicken");
		Thread.sleep(1000);
		d.findElement(
				By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
				.sendKeys("Monster@23Chicken");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
				.click();
		Thread.sleep(1000);

		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span")).click();
		
// Categories
		
		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[3]/button"))
				.click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span"))
				.click();
		
// sales product
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/input"))
				.sendKeys("Whole chicken");


		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/input"))
				.sendKeys("Whole chicken|sales product");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[4]/div/input"))
				.sendKeys("Whole chicken|sales product");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[5]/div/input"))
				.sendKeys("Whole chicken|sales product");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[6]/div/textarea"))
				.sendKeys("Whole chicken |sales product");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"formFile\"]"))
				.sendKeys("C:\\Users\\D E L L\\Pictures\\Camera Roll\\download (4).jpg");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"btn-save-event\"]")).click();
		d.navigate().refresh();
		Thread.sleep(1000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
		Thread.sleep(1000);
		
// Categories filter
		
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select"))
				.click();
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select"))
				.click();
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select"))
				.click();
		Robot c = new Robot();
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyRelease(KeyEvent.VK_DOWN);
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyRelease(KeyEvent.VK_DOWN);
		c.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select"))
				.click();
		Robot e = new Robot();
		e.keyPress(KeyEvent.VK_DOWN);
		e.keyRelease(KeyEvent.VK_DOWN);
		e.keyPress(KeyEvent.VK_DOWN);
		e.keyRelease(KeyEvent.VK_DOWN);
		e.keyPress(KeyEvent.VK_DOWN);
		e.keyRelease(KeyEvent.VK_DOWN);
		e.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select"))
				.click();
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
		Thread.sleep(3000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/categories");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-category/div[1]/div/div/div[1]/ng-select"))
				.click();
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
		Thread.sleep(3000);
		d.navigate().refresh();
		
// Adding Raw product
		
		d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		Thread.sleep(1000);
		d.findElement(
				By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[3]/button"))
				.click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span"))
				.click();
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_DOWN);
		i.keyRelease(KeyEvent.VK_DOWN);
		i.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/input"))
				.sendKeys("Raw bird");
		Thread.sleep(500);
		d.findElement(By
				.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/ng-select/div/div/div[2]/input"))
				.click();
		Robot j = new Robot();
		j.keyPress(KeyEvent.VK_DOWN);
		j.keyRelease(KeyEvent.VK_DOWN);
		j.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		// d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[5]/div/ng-select/div/div/div[2]/input")).click();
		// Robot k = new Robot();
		// k.keyPress(KeyEvent.VK_DOWN);
		// k.keyRelease(KeyEvent.VK_DOWN);
		// k.keyPress(KeyEvent.VK_DOWN);
		// k.keyRelease(KeyEvent.VK_DOWN);
		// k.keyPress(KeyEvent.VK_ENTER);
		// Thread.sleep(200);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[7]/div/input")).sendKeys("200");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[8]/div/input")).sendKeys("300");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[9]/div/textarea"))
				.sendKeys("Raw product");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[10]/div/input"))
				.sendKeys("Raw product | Chicken");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[11]/div/input"))
				.sendKeys("Raw product | Chicken");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[12]/div/input"))
				.sendKeys("Raw product | Chicken");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[13]/div/textarea"))
				.sendKeys("Raw product | Chicken");
		Thread.sleep(500);
		d.findElement(By.xpath("//*[@id=\"formFile\"]")).sendKeys("C:\\Users\\D E L L\\Pictures\\country bird.jpg");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/button")).click();
		d.navigate().refresh();
		Thread.sleep(2000);

// Product filter
		
		//d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		//Thread.sleep(5000);
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select/div/div/div[2]"))
				.click();
		Robot raw = new Robot();
		raw.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select/div/div/div[2]"))
				.click();
		Robot sale = new Robot();
		sale.keyPress(KeyEvent.VK_DOWN);
		sale.keyRelease(KeyEvent.VK_DOWN);
		sale.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select/div/div/div[2]"))
				.click();
		Robot bulk = new Robot();
		bulk.keyPress(KeyEvent.VK_DOWN);
		bulk.keyRelease(KeyEvent.VK_DOWN);
		bulk.keyPress(KeyEvent.VK_DOWN);
		bulk.keyRelease(KeyEvent.VK_DOWN);
		bulk.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select/div/div/div[2]"))
				.click();
		Robot bird = new Robot();
		bird.keyPress(KeyEvent.VK_DOWN);
		bird.keyRelease(KeyEvent.VK_DOWN);
		bird.keyPress(KeyEvent.VK_DOWN);
		bird.keyRelease(KeyEvent.VK_DOWN);
		bird.keyPress(KeyEvent.VK_DOWN);
		bird.keyRelease(KeyEvent.VK_DOWN);
		bird.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select/div/div/div[2]"))
				.click();
		Robot egg = new Robot();
		egg.keyPress(KeyEvent.VK_DOWN);
		egg.keyRelease(KeyEvent.VK_DOWN);
		egg.keyPress(KeyEvent.VK_DOWN);
		egg.keyRelease(KeyEvent.VK_DOWN);
		egg.keyPress(KeyEvent.VK_DOWN);
		egg.keyRelease(KeyEvent.VK_DOWN);
		egg.keyPress(KeyEvent.VK_DOWN);
		egg.keyRelease(KeyEvent.VK_DOWN);
		egg.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);d.get("https://test-monster-chicken-admin.vercel.app/products/list");
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-products/div/div/div[1]/div[2]/form/div[2]/ng-select/div/div/div[2]"))
				.click();
		Robot feed = new Robot();
		feed.keyPress(KeyEvent.VK_DOWN);
		feed.keyRelease(KeyEvent.VK_DOWN);
		feed.keyPress(KeyEvent.VK_DOWN);
		feed.keyRelease(KeyEvent.VK_DOWN);
		feed.keyPress(KeyEvent.VK_DOWN);
		feed.keyRelease(KeyEvent.VK_DOWN);
		feed.keyPress(KeyEvent.VK_DOWN);
		feed.keyRelease(KeyEvent.VK_DOWN);
		feed.keyPress(KeyEvent.VK_DOWN);
		feed.keyRelease(KeyEvent.VK_DOWN);	
		feed.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
// search option for product 
      //d.navigate().refresh();
      //d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-products/div/div/div[1]/div[2]/form/div[1]/div/input")).click();
      //d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-products/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("MC-PRO-2");
      //d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-products/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("Keys.RETURN");
      //  WebElement code= d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-products/div/div/div[1]/div[2]/form/div[1]/div/input"));
       // Actions search = new Actions(d);
       // search.moveToElement(code).click().build().perform();
   //   Thread.sleep(2000);
        //code.sendKeys("MC-PRO-2");
        //Thread.sleep(3000);
    //  d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-products/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		// Thread.sleep(5000);
		
// CUtting center login
		
		d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"userName\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
				.sendKeys("jhzpoenmuzqmajkrfv@cazlg.com");
		Thread.sleep(3000);
		d.findElement(
				By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
				.sendKeys("123monsterchicken");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
				.click();
		
// Shop product purchase order
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/i")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		d.findElement(By
				.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[1]/div[1]/div/div/button"))
				.click();
		Thread.sleep(3000);
		d.findElement(By.xpath(
				"//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[1]/div/ng-select/div/div/div[2]/input"))
				.click();
		
// select raw product to purchase
		
		Robot h = new Robot();
		h.keyPress(KeyEvent.VK_ENTER);
		d.findElement(By.xpath(
				"//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[2]/div/input"))
				.sendKeys("Best Quality");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"btn-save-event\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-edit/div/div[3]/div/button"))
				.click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span"))
				.click();
		Robot product = new Robot();
		product.keyPress(KeyEvent.VK_ENTER);
        d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/ng-select/div/div/div[2]/input")).click();
		Robot weight = new Robot();
		weight.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("100");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[5]/div/input")).sendKeys("Best Quality");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[6]/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-edit/div/div[1]/div/div/div/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[6]/div/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
		Thread.sleep(5000);
		
 //Super Admin supplier assigning

		d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
		.sendKeys("superAdmin@monster.chicken");
Thread.sleep(1000);
d.findElement(
		By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
		.sendKeys("Monster@23Chicken");
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
		.click();
Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a/i")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
		Thread.sleep(3000);
		Robot supplier = new Robot();
		supplier.keyPress(KeyEvent.VK_DOWN);
		supplier.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/button")).click();
		Thread.sleep(2000);
// Ready for delivery
		d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
		Thread.sleep(2000);
// out for delivery 
		d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
		Thread.sleep(2000);
	
		
//Cutting center ready to receive the order 
		
		d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
		Thread.sleep(200);
	    d.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("jhzpoenmuzqmajkrfv@cazlg.com");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input")).sendKeys("123monsterchicken");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a/span")).click();
	    Thread.sleep(1000);
// order received
	    d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[6]/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
	    Thread.sleep(1000);
	    
// Mortality 
	   
	    d.get("https://test-monster-chicken-admin.vercel.app/mortality");
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/ul/li[5]/a")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-mortality-list/div/div/div[1]/div/div/div[2]/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/div/div[2]")).click();
	    Thread.sleep(1000);
	    Robot mortality = new Robot();
	    mortality.keyPress(KeyEvent.VK_DOWN);
	    mortality.keyPress(KeyEvent.VK_DOWN);
	    mortality.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/ng-select/div/div/div[2]")).click();
	    Thread.sleep(1000);
	    Robot mortalityproduct = new Robot();
	    mortalityproduct.keyPress(KeyEvent.VK_DOWN);
	    mortalityproduct.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("10");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"btn-save-event\"]")).click();	
	    Thread.sleep(1000);

	  	    
//Make payment
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[5]/ul/li[1]/a")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-purchase-order-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[6]/div[1]/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
	    Thread.sleep(200);
	    Robot payment = new Robot();
	    payment.keyPress(KeyEvent.VK_DOWN);
	    payment.keyRelease(KeyEvent.VK_DOWN);
	    payment.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(200);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/button")).click();
	    Thread.sleep(3000);
	      
// search by purchase number in CC
	 // d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[1]/div[2]/div/div[2]/div[2]/div/input")).click();
	  //d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[1]/div[2]/div/div[2]/div[2]/div/input")).sendKeys("MC-PO-47");
	   // Thread.sleep(2000);
	   // d.navigate().refresh();
	   
//Walk-in customer 
	    
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[3]/ul/li[5]/a")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[2]/div/div[1]/div[2]/input")).click();
	    Thread.sleep(500);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[4]/div/div/input")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[2]/div/div[1]/div[2]/input")).sendKeys("saran");
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[2]/div/div[2]/div[2]/input")).sendKeys("9871235678");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/ng-select/div/span")).click();
	    Thread.sleep(1000);
	    Robot walk = new Robot();
	    walk.keyPress(KeyEvent.VK_DOWN);
	    walk.keyRelease(KeyEvent.VK_DOWN);
	    walk.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[3]/div/div/div[2]/div[2]/div/div/div/div[3]/input")).sendKeys("10");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[3]/div/div/div[1]/button/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/ng-select/div/span")).click();
	    Thread.sleep(1000);
	    walk.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/input")).sendKeys("10");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-walk-in-customer/div/form/div[4]/div/div/input")).click();
	    Thread.sleep(3000);
	   
	    
// Walk in customer order reflects in order list in the name of walk in customer 
	     
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
	    
//Order list filter by order type 
	    
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-order-list/div/div[1]/div[2]/div/div[2]/div[1]/ng-select/div/span")).click();
	    Thread.sleep(1000);
	    Robot online = new Robot();
	    online.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    d.navigate().refresh();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-order-list/div/div[1]/div[2]/div/div[2]/div[1]/ng-select/div/span")).click();
	    Thread.sleep(1000);
	    Robot order = new Robot();
	    order.keyPress(KeyEvent.VK_DOWN);
	    order.keyRelease(KeyEvent.VK_DOWN);
	    order.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    d.navigate().refresh();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-order-list/div/div[1]/div[2]/div/div[2]/div[1]/ng-select/div/span")).click();
	    Thread.sleep(1000);
	    Robot inline = new Robot();
	    inline.keyPress(KeyEvent.VK_DOWN);
	    inline.keyRelease(KeyEvent.VK_DOWN);
	    inline.keyPress(KeyEvent.VK_DOWN);
	    inline.keyRelease(KeyEvent.VK_DOWN);
	    inline.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    
// Feed purchase oder
	    
	    d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a/i")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[7]/ul/li[1]/a")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[1]/div[1]/div/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[2]/div/input")).click();
	    Thread.sleep(500);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[2]/div/input")).sendKeys("Best Quality");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/div/div/app-purchase-order-add/div/div[2]/div/form/div/div/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-edit/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
	    Thread.sleep(1000);
	    Robot feedpurchase = new Robot();
	    feedpurchase.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/div/input")).sendKeys("10");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("Best Quality");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[4]/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-edit/div/div[1]/div/div/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]/div/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
	    Thread.sleep(2000);
	    
// super admin assign supplier to feed purchase 
	    
	    d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
		.sendKeys("superAdmin@monster.chicken");
Thread.sleep(1000);
d.findElement(
		By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
		.sendKeys("Monster@23Chicken");
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
		.click();
Thread.sleep(2000);
          d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a/i")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[8]/ul/li[1]/a/span")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
          Thread.sleep(1000);
          Robot feedsupplier = new Robot();
          feedsupplier.keyPress(KeyEvent.VK_ENTER);
          Thread.sleep(1000);
          d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/button")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div/button")).click();
          Thread.sleep(1000);
          d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
          Thread.sleep(3000);

// cutting center receives the order and completed the payment 
          
          d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
          Thread.sleep(1000);
          d.findElement(By.xpath("//*[@id=\"userName\"]")).click();
  		Thread.sleep(3000);
  		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
  				.sendKeys("jhzpoenmuzqmajkrfv@cazlg.com");
  		Thread.sleep(3000);
  		d.findElement(
  				By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
  				.sendKeys("123monsterchicken");
  		Thread.sleep(1000);
  		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
  				.click();
  		Thread.sleep(2000);
  		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a/i")).click();
  		Thread.sleep(1000);
  		d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/ul/li[1]/a/span")).click();
  		Thread.sleep(1000);
  		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]/div/button")).click();
  		Thread.sleep(1000);
  		d.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click();
  		Thread.sleep(1000);
  		d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-feed-list/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]/div[1]/button")).click();
  		Thread.sleep(1000);
  		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[1]/div/ng-select/div/span")).click();
  		Thread.sleep(1000);
  		Robot feedpayment = new Robot();
	    feedpayment.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[2]/button")).click();
	    Thread.sleep(3000);
	    
// Adding supplier
	    
		d.get("https://test-monster-chicken-admin.vercel.app/auth/login");
		Thread.sleep(200);
		d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[1]/input"))
		.sendKeys("superAdmin@monster.chicken");
Thread.sleep(1000);
d.findElement(
		By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/input"))
		.sendKeys("Monster@23Chicken");
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div[1]/div[2]/div[2]/form/div[3]/button"))
		.click();
Thread.sleep(1000);
      d.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a/i")).click();
      Thread.sleep(1000);
      d.findElement(By.xpath("/html/body/app-root/app-layout/app-vertical/div/app-sidebar/div/ngx-simplebar/div[1]/div[2]/div/div/div/div/div/ul/li[6]/ul/li[4]/a")).click();
      Thread.sleep(1000);
      d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendors-list/div/div[1]/div[1]/div/div/button")).click();
      Thread.sleep(1000);
      d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[1]/div/input")).sendKeys("Egg supplier");
      Thread.sleep(1000);
      d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[2]/div/input")).sendKeys("eggsupplier@gmail.com");
      Thread.sleep(1000);
      d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[3]/div/input")).sendKeys("9876653456");
      Thread.sleep(1000);
      d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[4]/div/ng-select")).click();
      Thread.sleep(1000);
      Robot addsupplier = new Robot();
      addsupplier.keyPress(KeyEvent.VK_DOWN);
	  addsupplier.keyRelease(KeyEvent.VK_DOWN);
	  addsupplier.keyPress(KeyEvent.VK_DOWN);
	  addsupplier.keyRelease(KeyEvent.VK_DOWN);
	  addsupplier.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[5]/div/ng-select")).click();
	  Robot gender = new Robot();
	  gender.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[6]/div/input")).sendKeys("33AABCU9603R1ZU");
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[7]/div/input")).sendKeys("ABCPS1234A");
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"btn-save-event\"]")).click();
	  Thread.sleep(1000);
	  d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/app-supplier-location/div/div[2]/button[2]")).click();
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[10]/div/input")).sendKeys("Near to bus stand");
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[11]/div/ng-select")).click();
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[11]/div/ng-select")).click();
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[11]/div/ng-select")).sendKeys("Tamil nadu");
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-vendor-form/div/div[2]/div/form/div/div[11]/div/ng-select")).click();
	  
	  
	  
     
	    

	    
	    
  		
  		
          
          
          
          

	    
          
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
		
		
		
		
		
		
		

		
		
		
		
		
		
		


	}

}
