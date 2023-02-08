package main;

import noGenericMethods.Human;
import noGenericMethods.NoGenericMethods;
import noGenericMethods.Person;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("andreu","guzman",35);
        Person person2 = new Person("ari", "estevez", 38);
        Person person3= new Person("pepe", "brualla", 40);

//Exercise 1
        //Inserting the same person objects in different order same constructor
        NoGenericMethods ngm = new NoGenericMethods(person1,person2, person3);
        NoGenericMethods ngm2 = new NoGenericMethods(person2,person3,person1);
        ngm.insertPeople();
        ngm2.insertPeople();
        System.out.println("\n*** Printing same arguments in different order ***");
        ngm.getPeopleNames();
        ngm2.getPeopleNames();

        //ngm.printArrayList();
        //ngm2.printArrayList();

//Exercise 2
        //printing method with generic objects to prove how different types can be introduced
        System.out.println("\n*** Printing generic arguments in different order ***");
        ngm.receiveThreeGenerics(person1.getName(), "Hi I'm a String!", 111);
        ngm.receiveThreeGenerics(111,"Hi I'm a String!",person1.getName());


    }//closes main


}//closes class