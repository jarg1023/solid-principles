package wrong;

public class Dog implements Animal {

    // ! Incorrect because there is an empty method that has to be implemented because it is from the Animal interface
    @Override
    public void fly() {}

    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}