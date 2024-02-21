import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.util.*;

public class Demo
{   
    private static void someMethod()
    {
        System.out.println("Method executed");
    }
    public static void main(String[] args) throws Exception
    {   
        
        Method method=App1.class.getDeclaredMethod("someMethod");
        method.setAccessible(true);
        method.invoke(null); // static methods don't need objects to be called 
    }
}
