package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab300 {
    public static void main(String[] args) {

        //SearchContext driver = new EdgeDriver(); // Dynamic Dispatch(RunTIme polymorphism)
        // Possible but two functions, which is not much used.


        //WebDriver driver = new EdgeDriver();
        //12 which are good

        // RemoteWebDriver = new EdgeDriver();

        EdgeDriver driver = new EdgeDriver();

        // Scenarios

        // 1. Do want to run on Chrome or Edge?
        //        ChromeDriver driver = new ChromeDriver();
//        EdgeDriver driver2 = new EdgeDriver();


        // 2  Do you want to run on Chrome then change to Edge ?
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver(); 90%



        // 3. do you want to run on multiple browsers?
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)


    }
}
