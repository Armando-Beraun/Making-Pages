package com.project.pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class TestMakingManypages {
	private WebDriver driver;
	Loggingvariables loggingvariables;
	Makingpage makingpage;
		
 
  @BeforeClass
  public void beforeClass() {
	    loggingvariables = new Loggingvariables(driver);
		driver = loggingvariables.chromedriverconnect();
		loggingvariables.visit("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.manage().window().maximize();
		makingpage = new Makingpage(driver);
  }

  @AfterClass
  public void afterClass() {
	//driver.quit();
  }
  
  @Test
  public void test_pilot() throws InterruptedException {
	  int contador =1;
		while (true){
			System.out.println("este es el intento:  "+ contador);  //inicia el conteo de paginas a publicar en la prueba
			
					
			    loggingvariables.userlogged(); //processo de logueo del usuario
			    Thread.sleep(3000);
			    //assertTrue(loggingvariables.isDashboardDisplayed());
		    	if ( loggingvariables.isDashboardDisplayed() ) {
		    		System.out.println("Loggueo exitoso"); //mensaje de confirmacion si fue exitos
		    	}else {
		    		System.out.println("Loggueo tuvo problemas"); //mensaje si hubo problemas
		    	}
			    WebDriverWait ewait = new WebDriverWait(driver,20);
		    	ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='wp-has-submenu wp-not-current-submenu menu-top menu-icon-page']")));
		    	
			    makingpage.creatingpage();
		    	ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='components-notice__content']"))); //esperando algun mensaje de la publicacion
				//assertTrue(makingpage.published_text());
		    	if ( makingpage.published_text() ) {  //mensaje de confirmacion si fue exitos
		    		System.out.println("Publicacion exitosa");
		    	}else {
		    		System.out.println("Problemas al intentar publicar"); //mensaje si hubo problemas
		    	}


				//System.out.println("este es el intento:  "+ contador);
				Thread.sleep(2000);

				driver.quit();
			
		
				if (contador == 10) {
					break;
				}
				contador++;	
				driver = loggingvariables.chromedriverconnect();
				loggingvariables.visit("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
				driver.manage().window().maximize();
				makingpage = new Makingpage(driver);
				Thread.sleep(3000);
				
		}	  
  }

}
