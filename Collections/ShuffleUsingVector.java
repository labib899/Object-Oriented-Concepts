package Collection;
import java.util.*;

public class ShuffleUsingVector 
{
	public static void main(String args[]) 
	{
		Vector<Integer> vec = new Vector<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements you want to shuffle :");
		int temp;
		boolean flag=true;
		Random rand = new Random();
		while(flag) 
		{
			temp = scan.nextInt();
			if(temp==0) flag=false;
			if(flag) vec.add(temp);
		}
		System.out.println("The elements are :" + vec);

		for (int i=vec.size()-1; i>0; i--) {
			int x = rand.nextInt(i);
			Collections.swap(vec, i, x);
		}
		System.out.println("Shuffled elements are " + vec);
	}

}