package com.class01;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utills.CommonMethods;



public class grupodevi2 extends CommonMethods {
@Test
    public static void main(String[] args) throws InterruptedException {
        // TC 1: Table headers and rows verification1.
        //Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”2.
        //Login to the application3.
        //Create an Order4.
        //Verify order of that person is displayed in the table “List of All Orders”5.
        //Click on edit of that specific order6.
        //Verify each order details7.
        //Update street address8.
        //Verify in the table that street has been updated9.
        //Close browser
        
        String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        setUpDriver("chrome", url);
        
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
        driver.findElement(By.xpath("//a[text()='Order']")).click();
        
        Select Products=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]")));
        Products.selectByVisibleText("FamilyAlbum");
        
        WebElement melek=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
        melek.clear();
        melek.sendKeys("5");;
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("70");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtDiscount\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtDiscount\"]")).sendKeys("50");
        
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).sendKeys("Melek");
        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")), "17 Ballinger Way");
        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")), "MountLaurel");
        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]")), "NewJersey");
        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")), "08054");
        
        List<WebElement> banka=driver.findElements(By.xpath("//ol/li/table/tbody/tr/td"));
        for(WebElement bankalar: banka) {
            if(bankalar.getText().contains("MasterCard")) {
                bankalar.click();
                
            }
            
            
        }
        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")), "267656763654");
        sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")), "05/19");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
        driver.findElement(By.xpath("//a[text()='View all orders']")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[13]/input")).click();
    
      WebElement isim=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
      isim.clear();
      isim.sendKeys("18 Melek");
      driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")).click();
      
        driver.quit();
        
        }
    }