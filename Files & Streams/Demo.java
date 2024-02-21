import java.io.*;
import java.util.Scanner;

public class Demo
{   
    public static void main(String[] args) throws IOException
    {   
        /*
        File file=new File("/users/labib/Desktop/hello.txt"); 
        file.createNewFile(); //creates a file

        FileWriter fileWriter=new FileWriter("hello.txt"); // current directory file
        fileWriter.write("This is my first random file..."); // writes to a file
        fileWriter.write("\nfuck files");
        fileWriter.close();

        FileReader fileReader=new FileReader("hello.txt");
        Scanner input=new Scanner(fileReader);
        while(input.hasNextLine()) // reading a file
        {   
            System.out.println(input.nextLine());
        }
        */
        //String names[]={"labib","jack","nihal"};

        BufferedWriter writer=new BufferedWriter(new FileWriter("hello.txt")); // buffered I/O is better than unbuffered I/O
        writer.write("fuck this course"); // writing to a file
        writer.write("\nfuck my life. It sucks...");
        writer.close();

        BufferedReader reader=new BufferedReader(new FileReader("hello.txt"));
        System.out.println("Reading from file:");
        Scanner input=new Scanner(reader);
        while(input.hasNextLine()) // reading from file
        {
            System.out.println(input.nextLine());
        }
        reader.close();
    }
}