// can not be instantiated
abstract class Abstraction
{   
    int x;
    Abstraction()
    {
        System.out.println("Constructor of an abstract class...");
    }
    // abstract method, no body, needs to be extended or overridden
    abstract void print();
    // can also have non-abstract and final methods, constructor, data member, main method
}

class A extends Abstraction
{
    void print()
    {
        System.out.println("Printing...");
    }
}