package correct;

// * This is correct because it is only implementing interfaces that contain just the methods this class needs

public class Dog implements Terrestrial, Animal{

    @Override
    public void run() {
        System.out.println("I'm running free!");
    }

    @Override
    public void communication() {
        System.out.println("Bub bub!");
    }
}
