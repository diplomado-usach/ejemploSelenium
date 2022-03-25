package com.diplomado.usach.ejemploselenium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EjemploSeleniumApplicationTests {


    private WebDriver driver;

//    @BeforeEach
//    public void setUp(){
//
//    }

    @Test
    public void shouldAnswerWithTrue() {

        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?id_product=2&controller=product");
////        driver.navigate().to("http://automationpractice.com/index.php?id_product=2&controller=product");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("add_to_cart")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement selectCheckout = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-medium > span")));
        selectCheckout.click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();

//        driver.findElement(By.cssSelector(".button-medium > span")).click();
//        driver.findElement(By.id("add_to_cart")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 2);
//        Boolean esta = wait.until(ExpectedConditions.attributeContains();
//        selectGender.click();
//        System.out.println("esta = " + esta);
//        WebElement webElement = driver.findElement(By.cssSelector("Proceed to checkout"));
//        for (WebElement element : listOfElements) {
//            System.out.println(element.getText());
//        }
//        WebElement webElement = driver.findElement(By.cssSelector("Proceed to checkout"));
//        System.out.println("aca"+webElement.getText());
//        driver.navigate().to("http://automationpractice.com/index.php?controller=order");
//
////        WebElement webElement =driver.findElement(By.id("layer_cart"));
//        List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
//        for (WebElement element : listOfElements) {
//            System.out.println(element.getText());
//        }

//
////        driver.switchTo().frame(1);
//        driver.findElement(By.cssSelector(".exclusive > span")).click();
//        driver.switchTo().defaultContent();
//        driver.findElement(By.cssSelector(".button-medium > span")).click();
//        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
//        driver.findElement(By.id("email_create")).click();
//        driver.findElement(By.id("email_create")).sendKeys("grupo_1@hola.cl");
//        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
//        driver.findElement(By.id("customer_firstname")).click();
//        driver.findElement(By.id("customer_firstname")).sendKeys("grupo");
//        driver.findElement(By.id("customer_lastname")).sendKeys("1");
//        driver.findElement(By.id("customer_lastname")).click();
//        driver.findElement(By.id("customer_lastname")).sendKeys("unosss");
//        driver.findElement(By.id("passwd")).click();
//        driver.findElement(By.id("passwd")).sendKeys("ppppppp");
//        driver.findElement(By.id("days")).click();
//        System.out.println("aca "+webElement.getText());
//        driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
//        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Proceed to checkout']")));
//        driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
//        driver.findElement(By.cssSelector("[title=\"Proceed to checkout\"]")).click();
//        List<WebElement> listOfElements = driver.findElements(By.xpath("//a"));
//        for (WebElement element : listOfElements) {
//            System.out.println(element.getText());
//        }
//        driver.findElement(By.className("dewd")).click();
//        List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("#container_id > div"));
//        assertEquals(0, listOfElements.size());
//        for (WebElement element : listOfElements) {
//            System.out.println(element.getText());
//        }
////        driver.findElement(By.cssSelector("[data-id-product='1']")).click();
//        driver.findElement(By.cssSelector("input[type='button'][value='Open device access']")).click();
//        driver.findElement(By.cssSelector("input[type='button']")).click();
//By.CssSelector("[data-id-product='1']")
//        driver.navigate().to("https://www.google.com");
//        System.out.println("Iniciando Pruebas...");
//        WebElement searchbox = driver.findElement(By.name("q"));
//        searchbox.sendKeys("HandBook Devops");
//        searchbox.submit();
//        assertEquals("HandBook Devops - Buscar con Google", driver.getTitle());
    }

}
