import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

class cmp implements Comparator<Integer>
{
    public int compare(Integer a, Integer b) 
    {
        return -a.compareTo(b);
    }
    
}

class Person
{
    private int id;
    private String name;

    public Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }


}

public class List
{   
    public static void main(String[] args)
    {
        /*
        ArrayList<Integer> arr=new ArrayList<Integer>();

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++) 
        {
            int x=scan.nextInt();
            arr.add(x);
        }

        Collections.sort(arr,new cmp()); 
        for(Integer x:arr) System.out.print(x + " ");
        System.out.println();
        */

        ArrayList<Person> list=new ArrayList<Person>();

        list.add(new Person(69,"jack"));
        list.add(new Person(3,"xyz"));
        list.add(new Person(2,"jones"));
        list.add(new Person(7,"meredith"));

        for(Person x:list) System.out.println(x);

        Collections.sort(list, new Comparator<Person>()
        {
            public int compare(Person p1,Person p2)
            {   
                // sorting in ascending order by id 
                if(p1.getId()<p2.getId()) return -1;
                else if(p1.getId()>p2.getId()) return 1;
                else return 0;
            }
        });
        for(Person x:list) System.out.println(x + " ");
    }
}
