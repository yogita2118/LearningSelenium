package com.thetestingacademy.ex_selenium_13072024;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab309 {
    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);


    }
}
