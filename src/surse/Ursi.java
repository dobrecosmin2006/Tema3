package surse;

/**
 * Created by Mihai on 10/28/2014.
 */
public class Ursi extends Animal implements IEatingZoo {

    public boolean Carnivor = true;

    public Ursi(String NumeUrsulet) {

        setAnimalName(NumeUrsulet);
    }

    public boolean isCarnivor() {
        return Carnivor;
    }

    @Override
    public void eat() {
        // in this class our teddy bears will eat
        System.out.println(" This teddy bear is eating now.");
    }

    @Override
    public void sleep() {

        // this function is for sleeping time

        System.out.println(" This bear is sleeping now !" + getAnimalName());
    }

    @Override
    public boolean Hibernare_IARNA(String Anotimp) {

        if (!Anotimp.startsWith("Win")) {
            System.out.println("  Not Winter !!! ");
            return false;


        }
        // in this case, i will have hibernation in winter

        System.out.println("  Winter !!! ");
        return true;
    }
}
