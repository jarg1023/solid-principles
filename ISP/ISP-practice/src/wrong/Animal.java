package wrong;

// ! This is wrong because it is a very generic interface and some clients using it won't use all of its methods

public interface Animal {
    void fly();
    void run();
    void bark();
}
