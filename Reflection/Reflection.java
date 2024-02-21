import java.lang.reflect.*;

public class Reflection
{
    public static void main(String[] args) throws Exception 
    {
        Cat myCat=new Cat("Stella",6);
        Field[] catFields=myCat.getClass().getDeclaredFields();

        for(Field x:catFields)
        {
            //System.out.println(x.getName()); 
            if(x.getName().equals("name")) 
            {
                x.setAccessible(true); // will not work without this, also exception needs to be thrown
                x.set(myCat,"Jimmy");
            }
        }
        System.out.println(myCat.getName()); // name changed even though it was private and final

        Method[] catMethods=myCat.getClass().getDeclaredMethods();

        for(Method x:catMethods)
        {
            //System.out.println(x.getName());
            if(x.getName().equals("meow"))
            {   
                x.setAccessible(true);
                x.invoke(myCat);
            }
        }
    }
}

class Cat 
{
    private final String name;
    private int age;

    public Cat(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    private void meow()
    {
        System.out.println("Meowwwww....");
    }
}