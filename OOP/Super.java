public class Super
{
    public static void main(String[] args)
    {
        Animal dog=new Dog(); // upcasting
    }
}

class Animal
{   
    int x;
    Animal()
    {
        System.out.println("Animal is created...");
    }

    Animal(int x)
    {   
        this.x=x;
        System.out.println("Printing x: "+x);
    }

    String color;

    void eat()
    {
        System.out.println("Eating from Animal "+"color: "+this.color);
    }
}

class Dog extends Animal
{   
    int y,z;
    Dog(int x,int y,int z)
    {
        //super();
        super(x); 
        this.y=y;
        this.z=z;
    }

    String color;

    void eat()
    {
        System.out.println("Eating from Dog "+"color: "+this.color);
        super.eat();
        System.out.println(super.color);
    }
}