package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import driver.driver;
public class selenium extends driver{
private Robot robot;
public void abrir() {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
}
public void abrirpagina() {
	driver.get("https://bits-angular-stg.dev01.bitsamericas.net/contactenos");
}
public void ingresarproductoabuscar() throws InterruptedException, AWTException{
	Robot robot = new Robot();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(100000);
	robot.mouseMove(800, 460);
	js.executeScript("window.scrollBy(0,200)");
	/*WebElement texto=driver.findElement(By.xpath("//input[@id='contact_us__correo_electronico']"));
	 texto.clear();*/
	Thread.sleep(20000);
	 js.executeScript("window.scrollBy(0,200)");
/*js.executeScript("arguments[0].scrollIntoView();", texto);*/
}
public void seleccionarmenorprecio() {
	/*WebElement boton=driver.findElement(By.xpath("//select[@id='sortOptions1']"));
	boton.sendKeys("price-asc");*/
}
public void agregaralcarrito() throws InterruptedException {
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	WebElement seleccionar=driver.findElement(By.xpath("//button[@id='js-add-cart-7705946322560']"));
	seleccionar.click();*/
}
public void finalizarcompra() throws AWTException, InterruptedException {
	/*Robot robot = new Robot();
	robot.mouseMove(800, 460);
	Thread.sleep(4000);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(2000);
	WebElement seleccionar=driver.findElement(By.id("quantity_0"));
	seleccionar.click();
	seleccionar.sendKeys("3");
	seleccionar.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	WebElement seleccionar2=driver.findElement(By.id("js-go-to-pay"));
	seleccionar2.click();
	robot.mouseMove(800, 460);
	Thread.sleep(4000);
	WebElement email=driver.findElement(By.id("j_username"));
	email.click();
	email.sendKeys("megaja451@outlook.com");
	WebElement continuar=driver.findElement(By.xpath("//*[@id=\"alkostoSoftLoginForm\"]/button"));
	continuar.click();
	robot.mouseMove(300, 460);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(2000);
	WebElement nombre=driver.findElement(By.xpath("//input[@id='firstName']"));
	nombre.sendKeys("Javier Andres");
	WebElement apellido=driver.findElement(By.id("lastName"));
	apellido.sendKeys("castillo guzman");
	WebElement telefono=driver.findElement(By.id("phone"));
	telefono.sendKeys("3168623014");
	js.executeScript("window.scrollBy(0,200)");
	WebElement suscripcion=driver.findElement(By.xpath("//form[@id='signInPostForm']/div[5]/label"));
	suscripcion.click();
	WebElement consent=driver.findElement(By.xpath("//form[@id='signInPostForm']/div[6]/label"));
	consent.click();
	WebElement boton=driver.findElement(By.xpath("//button[@id='js-buttonSignIn']"));
	boton.click();
	js.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	robot.mouseMove(800, 360);
	WebElement cedula=driver.findElement(By.xpath("//input[@id='address.idNumber']"));
	cedula.sendKeys("1022374658");
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	WebElement ciudad=driver.findElement(By.id("address.provinceCode"));
	ciudad.click();
	Thread.sleep(4000);
	new Select(driver.findElement(By.id("address.provinceCode"))).selectByVisibleText("Bogota Dc");
	WebElement direccion=driver.findElement(By.xpath("//input[@id='addressLine1']"));
	direccion.sendKeys("diagonalhgsgsgsg112");
	WebElement direccion1=driver.findElement(By.xpath("//input[@id='addressDistrict']"));
	direccion1.sendKeys("san francisco");
	js.executeScript("window.scrollBy(0,200)");
	WebElement botona=driver.findElement(By.xpath("//button[@id='continueAddress']"));
	botona.click();
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(2000);
	WebElement botonb=driver.findElement(By.id("deliveryMethodSubmit"));
	botonb.click();*/
	
}
}

