package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loggingvariables extends Base{
	// logging variables
	By usernameplace = By.id("user_login");
	By passwordplace = By.name("pwd");
	By confirmplace = By.name("wp-submit");
	By userlogged = By.id("menu-media");
	
		
	public Loggingvariables(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void userlogged() throws InterruptedException { 
		Thread.sleep(5000);
		if (isDisplayed (confirmplace)) { //opening the web page
			write("opensourcecms",usernameplace); //writing user
			write("opensourcecms", passwordplace); //writing password
			
			click(confirmplace); //confirm with enter in "logging"
			//Thread.sleep(3000);
		}else {
			System.out.println("web page not found");  //if web-page has an error 
		}
	}
	
	public Boolean isDashboardDisplayed() { //confirmation of logging process was fine
		//System.out.println("loggueo exitoso");
		return isDisplayed(userlogged);
	}
	
	
}
