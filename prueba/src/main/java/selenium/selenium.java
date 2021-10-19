package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import driver.driver;
public class selenium extends driver{
public void abrir() {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	driver= new ChromeDriver();
}
public void abrirpagina() {
	driver.get("http://automationpractice.com/index.php");
}
public void ingresarusuarioycontrasena() throws InterruptedException {
	WebElement username= driver.findElement(By.xpath("//input[@id='search_query_top']"));
	username.clear();
	username.click();
	username.sendKeys("Blusa mujer");
}
public void pulsarbotonsave() {
	WebElement boton= driver.findElement(By.xpath("//button[@name='submit_search']"));
	boton.click();
}
}

