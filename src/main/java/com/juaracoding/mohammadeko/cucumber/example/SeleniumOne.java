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
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        System.out.println("Menu Admin Clicked");

        delay(2);
        WebElement selectByRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
        selectByRole.sendKeys("a");
        System.out.println("Hiring Manager");

        delay(2);
        WebElement clickBtnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        clickBtnSubmit.click();
        delay(2);
        clickBtnSubmit.click();
        delay(2);
        clickBtnSubmit.click();
        System.out.println("Button search cliked");
//        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//        System.out.println("Button Add Clicked");
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input")).sendKeys("C:\\Users\\Dzikra Shanum\\Pictures\\Resume.txt");
//        System.out.println("Input File TXT");
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
