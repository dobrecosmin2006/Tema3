package Main;

import surse.*;
import surse.MyLastException;

/*
* DiagramUML is presented
 */

public class Main {


    public static void main(String[] arguments) {

        /*
         *  this is my main class for execution some of my methods
         */


        Bears UrsulNr111 = new Bears("Grizzly");
        Bears UrsulNr112 = new Bears("Brun");
        Bears UrsulNr113 = new Bears("Carpatin");

        IEatingZoo UrsulNr114 = new Bears("Alpin");
        IEatingZoo UrsulNr115 = new Bears("Brun-Carpatin");


        try {

            System.out.println(" Incinta 1 ZOO: \n " + UrsulNr111.getAnimalName());


            System.out.println(" Incinta 2 ZOO:\n " + UrsulNr112.getAnimalName());

            /*
            *  I will put my teddy bears to sleep and to eat, consequently
             */
            System.out.println(" it's time to sleep");
            UrsulNr112.sleep();

            System.out.println(" it's time to eat");
            UrsulNr111.eat();

            /*
            *
            *  My methods are for : sleeping, waking up, eating and finishing up
             */
            UrsulNr111.FinishEating();

            System.out.println(" Change of plans !! ");
        } catch (Exception e) {
            System.out.println("Exception while running the code example" + e.getMessage());
        }
            /*
             * All the teddy bears will rest for all the winter season :)
              */

        try {

            String now = "Winter";
            if (UrsulNr113.Hibernation_winter(now)) {

                UrsulNr113.sleep();

            } else {

                UrsulNr113.WakeUp();
            }

            now = "Spring";
            if (!UrsulNr113.Hibernation_winter(now)) {

                UrsulNr113.WakeUp();
                System.out.println(" The bear " + UrsulNr113.getAnimalName() + " has been waked up.");

            } else {

                System.out.println(" The teddy bear is still sleeping ... because it's still Winter! ");
            }

        } catch (MyLastException e) {

            System.out.println("Exception while running the code example" + e.getMessage());

        }

        try {
            UrsulNr111.sleep();
            //  int test =1/0;
        } catch (MyLastException e) {
            System.out.println(" My test was to show how to use my class exception extended " + e.getMessage());

        }



    }
}