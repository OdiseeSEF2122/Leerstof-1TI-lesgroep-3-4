package inheritance.sounds;

public class Main {

    public static void main(String[] args) {
        SoundProducer[] noisyNeighbours = new SoundProducer[]{
          new Hond(),
          new SoundProducer()
        };

        for(SoundProducer soundProducer : noisyNeighbours){
            soundProducer.makeSound();
        }
    }
}
