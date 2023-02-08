package main;

import noGenericMethods.NoGenericMethods;
import noGenericMethods.Person;
import java.util.ArrayList;

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
        ngm.receiveThreeGenerics(222,"Hi I'm a String!",person1.getName());


//Exercise 1 level 2
        //printing method with two generic objects to prove how different types can be introduced
        System.out.println("\n*** Printing two generic arguments in different order ***");
        ngm.receiveTwoGenerics(person1, "Hi I'm a String!", 111);
        ngm.receiveTwoGenerics(person1,222,"Hi I'm a String!");

//Exercise 2 level 2
        //printing method with two generic objects and one generic list
        System.out.println("\n*** Printing two generic arguments and one generic list ***");
        ArrayList<Person> myList = new ArrayList<>();
        myList.add(person1);
        myList.add(person2);
        ngm.receiveListGeneric(myList, "hi! im string", 111);



    }//closes main


}//closes class