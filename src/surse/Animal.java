package surse;

/**
 * Created by Mihai on 10/28/2014.
 */
public abstract class Animal {

    private String mNameAnimal;


    /*
        * aceasta clasa este implementata ptr clasa abstracta ANIMALS pt ZOO
        *
     */

    public abstract boolean Hibernare_IARNA(String Anotimp);

    public String getAnimalName() {
        return mNameAnimal;
    }

    public void setAnimalName(String mName) {
        this.mNameAnimal = mName;
    }


}
