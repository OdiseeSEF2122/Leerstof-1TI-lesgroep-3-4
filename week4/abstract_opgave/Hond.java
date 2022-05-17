package inheritance.sounds;

public class Hond extends SoundProducer {

    @Override
    public void makeSound(){
        //super.makeSound();
        System.out.println("Woof woof");
    }

    public static void main(String[] args) {
        Hond hond = new Hond();
        hond.makeSound();
    }
}
