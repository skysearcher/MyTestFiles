import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.awt.*;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Joshua on 6/26/2015.
 */
public class IntroClass {
    private static MyScan myWindow;
    public static void main(String[] args) {
        IntroClass myTests = new IntroClass();
//        myTests.myTest();
        CarryClass myStuff = new CarryClass();
        CarryClass myStuffTwo;
        myStuff.setMyNum(8);
        myStuff.setCowHolder("That");
        myStuffTwo = myTests.myCallTest(myStuff);
        System.out.println(myStuff.getCowHolder());
        System.out.println(myStuffTwo.getCowHolder());

    }

    /**
     * information to research
     *
     */
    public void mapTest(){
        Map<KeyClass, ValueClass> myMap = new TreeMap<>();
    }



    public CarryClass myCallTest(CarryClass myClass){
        myClass.setCowHolder("this");
        myClass.setMyNum(7);
        return myClass;
    }


    public void myTest(){
        System.out.println("This Code");

        int port = 5000;
        try {
            Thread t = new ServerTest(port);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ClientTest myClient = new ClientTest(port, "localhost");
        myClient.activateConnection();

    }
    public void runTest(){
        String demolish = "destroy";
        typeTestOne(demolish);
        System.out.println(demolish);
        typeTestTwo(demolish);
        System.out.println(demolish);
        System.out.println("I am here");
        System.out.println("I am here!!!");
    }
    public String typeTestOne(String test){
        System.out.println("In test one Part 1:" + test);
        test = "dog";
        System.out.println("In test one Part 2:" + test);
        return test;
    }
    public String typeTestTwo(String test){
        System.out.println("In test two Part 1:" + test);
        test = "";
        test = "new me";
        System.out.println("In test two Part 2:" + test);
        return test;
    }

}
