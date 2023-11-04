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
				.sendKeys("Raw product | Chicken)");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div[13]/div/textarea"))
				.sendKeys("Raw product | Chicken");
		Thread.sleep(500);
		d.findElement(By.xpath("//*[@id=\"formFile\"]")).sendKeys("C:\\Users\\D E L L\\Pictures\\country bird.jpg");
		Thread.sleep(500);
		d.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/button")).click();
		d.navigate().refresh();

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
				.sendKeys("Best Quanlity");
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
	
//super admin successfully assigned the supplier 
		
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
//Make payment 
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
	    Thread.sleep(1000);
// search by purchase number in CC
	 // d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[1]/div[2]/div/div[2]/div[2]/div/input")).click();
	  //d.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div/app-purchase-order-list/div/div[1]/div[2]/div/div[2]/div[2]/div/input")).sendKeys("MC-PO-47");
	   // Thread.sleep(2000);
	   // d.navigate().refresh();
	    
	    
	    
	
		
		
		
		
		
		
		

		
		
		
		
		
		
		


	}

}
