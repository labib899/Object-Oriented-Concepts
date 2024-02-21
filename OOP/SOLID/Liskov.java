public class Liskov
{
    class Bird 
    {

    }

    class FlyingBird extends Bird
    {
        public void fly()
        {

        }
    }

    class Duck extends FlyingBird
    {

    }

    class Ostrich extends Bird
    {

    }
}