package wrong;

public class Bird implements Animal {

    // ! Incorrect because there is an empty method that has to be implemented because it is from the Animal interface
    @Override
    public void bark() {}

    @Override
    public void run() {
        System.out.print("Bird is running");
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}
