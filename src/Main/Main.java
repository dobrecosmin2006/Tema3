package Main;

import surse.IEatingZoo;
import surse.MyCustomizedException;
import Main.UseCustomException;
import surse.Bears;
import surse.Animal;


public class Main {


    public static void main(String[] arguments) {

        /*
        * In this class MAIN i will execute some methods :)
         */


        Bears UrsulNr111 = new Bears("Grizzly");
        Bears UrsulNr112 = new Bears("Brun");
        Bears UrsulNr113 = new Bears("Carpatin");

        IEatingZoo UrsulNr114 = new Bears("Alpin");
        IEatingZoo UrsulNr115 = new Bears("Brun-Carpatin");


        try {

            System.out.println(" Incinta 1 ZOO: \n " + UrsulNr111.getAnimalName());


            System.out.println(" Incinta 2 ZOO:\n " + UrsulNr112.getAnimalName());


            System.out.println(" it's time to sleep");
            UrsulNr112.sleep();

            System.out.println(" it's time to eat");
            UrsulNr111.eat();


            UrsulNr111.FinishEating();

            System.out.println(" Change of plans !! ");

            String now = "Winter";
            if (UrsulNr113.Hibernare_IARNA(now)) {

                UrsulNr113.sleep();

            } else {

                UrsulNr113.WakeUp();
            }

            now = "Spring";
            if (!UrsulNr113.Hibernare_IARNA(now)) {

                UrsulNr113.WakeUp();
                System.out.println(" The bear " + UrsulNr113.getAnimalName() + " has been waked up.");

            } else {
                
                System.out.println(" The teddy bear is still sleeping ... because it's still Winter! ");
            }


        } catch (Exception e) {

            System.out.println(e);

        }

    }
}