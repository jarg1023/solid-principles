package correct;

// * This is correct because it is only implementing interfaces that contain just the methods this class needs

public class Bird implements Aerial, Terrestrial, Animal{

    @Override
    public void fly() {
        System.out.println("I'm flying free!");
    }

    @Override
    public void run() {
        System.out.println("I can run too!");
    }

    @Override
    public void communication() {
        System.out.println("Piu Piu!");
    }
}
