package noGenericMethods;

import java.util.ArrayList;

public class NoGenericMethods {

    final ArrayList<Person> objectsList = new ArrayList<>();
    Person person1, person2, person3;

    public NoGenericMethods(Person person1, Person person2, Person person3) {
        this.person1=person1;
        this.person2=person2;
        this.person3=person3;
    }
    public void insertPeople (){
        objectsList.add(person1);
        objectsList.add(person2);
        objectsList.add(person3);
    }

    public void getPeopleNames(){

        for (Person per:objectsList){
            System.out.print(per.getName()+" \n");
        }



    }

    public void printArrayList (){
        System.out.println(objectsList+"\n");
    }

    public <T> void  receiveThreeGenerics(Object a,Object b,Object c){
        System.out.println(a+"-"+b+"-"+c);
    }

    public <T> void receiveTwoGenerics(Person a,Object b,Object c){
        System.out.println(a+"-"+b+"-"+c);
    }


    public <U,V> void receiveListGeneric(ArrayList<? extends Human> list,U b,V c){
        System.out.println(list+"-"+b+"-"+c);
    }


}//closes class
