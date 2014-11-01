package surse;

/**
 * Created by Mihai on 10/28/2014.
 */


public class Bears extends Animal implements IEatingZoo {


    public boolean Carnivor = true;
    public boolean isEating = false;
    public boolean isSleeping = false;

    public Bears(String NumeUrsulet) {

        setAnimalName(NumeUrsulet);
    }

    public boolean isCarnivor() {
        return Carnivor;
    }

    public void WakeUp() {
        this.isSleeping = false;
    }

    public void FinishEating() {
        this.isEating = false;
    }

    @Override
    public void eat() {
        // in this class our teddy bears will eat
        System.out.println(" This teddy bear is eating now." + getAnimalName());
        this.isEating = true;
    }

    @Override
    public void sleep() {

        // this function is for sleeping time

        System.out.println(" This bear is sleeping now !" + getAnimalName());
        this.isSleeping = true;
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

