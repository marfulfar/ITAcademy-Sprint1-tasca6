package phoneClasses;

import Interfaces.Phone;

public class Smartphone implements Phone {

    @Override
    public void Call(String fromWhere) {

        System.out.println("I'm calling from "+fromWhere);
    }

    public void takePicture(String fromWhere){
        System.out.println("I'm taking a picture from " + fromWhere);
    }


}//closes class
