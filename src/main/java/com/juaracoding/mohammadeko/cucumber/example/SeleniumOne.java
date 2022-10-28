package com.juaracoding.mohammadeko.cucumber.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        delay(1);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("User berhasil login");
        driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
        System.out.println("Menu Admin Clicked");

        delay(2);
        WebElement selectByRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
        selectByRole.sendKeys("l" + Keys.ENTER);
        System.out.println("Hiring Manager");

        WebElement txtAdmin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
        System.out.println(txtAdmin.getText());

        delay(2);
        WebElement clickBtnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        clickBtnSubmit.click();
        System.out.println("Button search cliked");

        delay(5);
        System.out.println("Browser Quit");
    }

    static void delay(int detik){
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
