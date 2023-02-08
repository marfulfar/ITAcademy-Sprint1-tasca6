package main;

import genericClasses.Generic;
import phoneClasses.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone nokia = new Smartphone();
        Generic g = new Generic();

        System.out.println("Method with object limited by phone class, therefore cannot take pictures");
        g.genericMethodPhone(nokia);

        System.out.println();//printing an empty line for aesthetics purposes

        System.out.println("Method with object limited by smartphone class, so can take pictures");
        g.genericMethodSmartphone(nokia);



    }//closes main


}//closes class