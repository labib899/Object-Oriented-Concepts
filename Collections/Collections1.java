// Collections are dynamic data structures
// Interfaces: List, Map, Queue, Set
// Classes: ArrayList, LinkedList, HashMap, HashSet, TreeSet


import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

public class Collections1
{
    public static void main(String[] args)
    {   
        // ArrayList
        ArrayList<Integer> arr=new ArrayList<Integer>();

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++) 
        {
            int x=scan.nextInt();
            arr.add(x);
        }

        Collections.sort(arr); // sorting the ArrayList 
        for(int i=0;i<arr.size();i++) System.out.print(arr.get(i) + " ");
        System.out.println();

        arr.remove(1); // removing arr[ind]

        for(Integer x:arr) System.out.print(x + " ");
        System.out.println();

        // HashMap (does not maintain order)
        HashMap<Integer,String> map=new HashMap<Integer,String>(); 

        map.put(5,"five");
        map.put(3,"three");
        map.put(7,"seven");
        map.put(2,"two");
        System.out.println(map.get(7));
        System.out.println(map.get(6)); // will print null

        for(Integer key:map.keySet())
        {
            System.out.println(key + " " + map.get(key));
        }

        for(Map.Entry<Integer,String> x:map.entrySet())
        {   
            System.out.println(x.getKey() + " " + x.getValue());
        }

        // TreeMap (maintains order)
        SortedMap<Integer,String> mp=new TreeMap<Integer,String>();

        mp.put(69,"sixty nine");
        mp.put(7,"seven");
        mp.put(9,"nine");

        //mp.remove(9);

        for(Map.Entry<Integer,String> x:mp.entrySet())
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }

        // HashSet (does not maintain order)
        Set<String> s1=new HashSet<String>(); 

        s1.add("trump");
        s1.add("bush");
        s1.add("biden");

        for(String x:s1) System.out.print(x + " ");
        System.out.println();

        // TreeSet (Maintains order)
        SortedSet<String> s2=new TreeSet<String>();

        s2.add("trump");
        s2.add("bush");
        s2.add("biden");

        for(String x:s2) System.out.print(x + " ");
        System.out.println();

        System.out.println(s2.contains("oppenheimer")); // does the set contain the element
        System.out.println(s2.contains("bush"));
        System.out.println(s2.isEmpty()); // is the set empty

        Set<String> intersection=new TreeSet<String>(s1); // copy of s1
        intersection.retainAll(s2); // intersection of intersection and s2 set
        System.out.println(intersection);

        Set<String> difference=new TreeSet<String>(s1); // copy of s1
        difference.removeAll(s2); // will remove intersecting elements
        System.out.println(difference); 


        /*
            add offer
            remove  poll
            element peek 
        */
        // Queue
        Queue<Integer> q=new LinkedList<Integer>();

        q.add(5);
        q.add(69);
        q.add(3);

        for(var x:q) System.out.print(x+ " ");
        System.out.println();

        System.out.println(q.remove()); // removing head element
        for(var x:q) System.out.print(x+ " ");
        System.out.println();
        System.out.println(q.element()); // printing head element

        // PriorityQueue
        Queue<Integer> pq=new PriorityQueue<Integer>();

        pq.offer(5);
        pq.offer(69);
        pq.offer(3);

        for(var x:pq) System.out.print(x+ " "); // will not show the correct order
        System.out.println();
        
        // in the correct order
        while(pq.size()>0)
        {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
        System.out.println();

        /*
        System.out.println(pq.poll()); // removing top element
        for(var x:pq) System.out.print(x+ " ");
        System.out.println();
        System.out.println(pq.peek()); // printing top element
        */
    }
}