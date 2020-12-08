package com.project.pom;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makingpage extends Base {	
		private WebDriver driver;
	//filling text boxes and verification
		//By pagemenu = By.className("wp-menu-name");
		By pagemenu1 = By.id("menu-media");
		By pagemenu2 = By.className("wp-menu-name");
		//By pagesplaced = By.id ("menu-pages");
		//By pagesplaced = By.className("wp-first-item");
		//By pagesplaced = By.className("wp-menu-name");
		By pagesplaced =By.xpath("//li[@class='wp-has-submenu wp-not-current-submenu menu-top menu-icon-page']");
		By pageeditor = By.xpath("//div[@class='components-panel__header edit-post-sidebar-header edit-post-sidebar__panel-tabs']");
		By Pagemake = By.className("page-title-action");
		By pageeditorT =By.id("post-title-0");
		By pagepublic = By.id("publish");
		
		//pop up message
		By popup = By.className("components-popover__content");
		By titlebox = By.id("post-title-0");
		
		//public variables
		By verifypage = By.xpath("//div[@class='components-notice is-success is-dismissible']");
		By public1 = By.xpath("// button[@class = 'components-button editor-post-publish-panel__toggle is-button is-primary']");
		By public2 = By.xpath("//button[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']");	
	
		
		
	public Makingpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void creatingpage () throws InterruptedException {
		if (isDisplayed(pagesplaced)) {
			click(pagesplaced); //going to "ALL pages"
			Thread.sleep(4000);	
//			WebDriverWait ewait = new WebDriverWait(driver, 20);
//			ewait.until(ExpectedConditions.presenceOfElementLocated(Pagemake));
			
			click(Pagemake); //here we go to page editor
			Thread.sleep(15000);
			if (isDisplayed(pageeditor)) {
				if (isDisplayed(popup)) {   //popup que sale cuando el usuario hace el primero
					write("Prueba AAA1", titlebox);   //title-box
					click(public1);   //publishing button pressed
					Thread.sleep(3000);
					click(public2);  //publish button pressed
				}else {
					write("Prueba AAA1", pageeditorT);
					Thread.sleep(3000);
					//click(pagepublic);
					click(public1);   //publishing button pressed
					Thread.sleep(3000);
					click(public2);  //publish button pressed
				}
			}else {
				System.out.println("No se econtro el editor");
				
			}
			
			
		}else {
			System.out.println("hubo problemas con encontrar la seccion 'Pages'");
		}
		
	}

	public Boolean published_text() {
		//System.out.println("publicacion exitosa");
	  return isDisplayed(verifypage);
	}
	
}
