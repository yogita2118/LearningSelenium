package com.thetestingacademy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver()  ;
        driver.get("https://www.google.com/");
    }
}
