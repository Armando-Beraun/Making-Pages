package com.project.pom;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;  //el driver de este metodo sera igual que el driver usual
		
	}
    
	public WebDriver chromedriverconnect() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver (); //se hace el llamado de una pagina de chrome para crear una instyancia del navegador 
		return driver;  // con eto se asigna la pagina de prueba para ejecutar todas las pruebas sobre esa pagina.		
	}
	
	public WebElement findElement (By locator) {  //se crea un envoltorio (wrapper) para crear un propio metodo, pero en si se usaran los mismos de selenium
		return driver.findElement(locator);		
	}
	
   	public java.util.List<WebElement> findElements (By locator) {
   		return driver.findElements(locator);
   	}
    
   	public String getText(WebElement element) {
		return element.getText();   		//devolvera el texto del elemento que esta pasando como parametro
   	}
   	
   	public String getText(By locator) {
   		return driver.findElement(locator).getText(); //devolvera el texto del elemento que esta buscando a travez de este localizador
   	}
   	
   	public void write(String inputText, By locator) {  //escribira en vez de usar "sendkeys", usando el texto de lo que ingresemos y ubicando el sitio con locator
   		driver.findElement(locator).sendKeys(inputText);
   	}
   	
   	public void click(By locator) {   //es lo mismo "click" que en selenium, solo que debe estar contemplado en nuestro envoltorio por que lo usamos
   		driver.findElement(locator).click();
   	}
   	
   	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed(); //si el elemento es capturado como verdadero, se depositara en "Boolean" 
		}catch (org.openqa.selenium.NoSuchElementException e){ //si no aparece esa imagen aparecera el tipico "NosuchExecption"
			return false;
		}
   				
   	}
   
   	public void visit (String url) {  //cumplira la funcion de "get"
   		driver.get(url);
   	}
   	
   
}
