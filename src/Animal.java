/**
 * @author Drumstyle92
 * class representing the name of the animal and its sounds.
 */
public class Animal {
    /**
     * Name of the animal
     */
    private String animalName;

    /**
     *
     * @param name parameter to be filled in to give the animal a name.
     * class constructor where the object is created.
     */
    public Animal(String name){
        this.animalName = name;
    }

    /**
     * method that represents the basic sound of the animal.
     */
    public void animalSound(){
        System.out.println("The animal is " + this.animalName + " and its sound is roarr!");
    }

    /**
     *
     * @param intensity parameter that according to the intensity that we insert shows you the sound of the animal.
     * method with the switch inside that represents the intensity of the sound of the animal.
     */
    public void animalSound(String intensity){
        switch(intensity){
            case "hight":
                System.out.println("It emits a loud sound: Roarrrrrrrr!");
                break;
            case "low":
                System.out.println("It emits a low sound: Roar");
                break;
            default:
                System.out.println("Cannot reproduce it properly.");
        }
    }
}
