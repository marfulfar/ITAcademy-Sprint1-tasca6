package genericClasses;

import Interfaces.Phone;
import phoneClasses.Smartphone;

public class Generic {

    public <T extends Phone> void genericMethodPhone(T object){
        object.Call("generic method phone");
    }

    public <T extends Smartphone> void genericMethodSmartphone(T object){
        object.takePicture("generic method SmartPhone");
        object.Call("generic method SmartPhone");
    }

}
