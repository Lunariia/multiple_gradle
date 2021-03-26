package com.epam.app;

import com.epam.core.Utils;

public class App {

    public static void main(String[] args) {
        Utils utils = new Utils();
        if(utils.isAllPositiveNumbers("10", "45")){
            System.out.println("All positive!");
        }
    }
}
