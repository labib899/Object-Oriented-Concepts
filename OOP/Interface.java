// Is-A relationship, multiple inheritance & loose coupling
// only abstract methods, only static and final variables; non abstract methods need to be default
// can not be instantiated
// all the fields are public, static and final by default
// static methods are also allowed now
public class Interface
{
    
}

interface printable
{
    void print();
}

class A implements printable
{
    public void print()
    {
        System.out.println("printing...");
    }
}