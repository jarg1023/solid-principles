import correct.Bird;
import correct.Dog;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog = new Dog();
        Bird bird = new Bird();

        dog.communication();
        dog.run();

        System.out.println("");

        bird.communication();
        bird.fly();
        bird.run();
    }
}
