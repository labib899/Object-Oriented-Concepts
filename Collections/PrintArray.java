// Generics benefits: provides type safety, no need for type casting
import java.util.*;
import java.lang.reflect.*;

public class PrintArray<T> // T formal type parameter
{   
    public void print(T[] arr)
    {
        for(T x:arr) System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) throws Exception
    {
        PrintArray<Integer> printArray=new PrintArray<Integer> ();
        Integer[] arr={1,4,3,2,5};
        printArray.print(arr);

        PrintArray<String> printArrayS=new PrintArray<String> ();
        String[] arrS={"sddsf","dfe"};
        printArrayS.print(arrS);

        GenericsExample.printEX("fuck this course");
        GenericsExample gen=new GenericsExample();
        gen.print2("hello",5254);

        // Using reflection
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(-2345);
        GenericsExample genex=new GenericsExample();
        Method printList=genex.getClass().getDeclaredMethod("printList",List.class);
        printList.setAccessible(true);
        printList.invoke(genex,list);
    }
}

class GenericsExample
{
    public static <T> void printEX(T obj)
    {
        System.out.println(obj + "!");
    }

    public <T,V> void print2(T a,T b)
    {
        System.out.println(a + " and " + b);
    }

    private static void printList(List<?> list) // wildcard(?)
    {
        System.out.println(list);
    }
}