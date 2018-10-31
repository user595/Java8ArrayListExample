import java.io.*;
import java.util.*;

class Java8ArrayListExample {
    static int max = 10;
    static int min = 0;
	public static void main (String[] args) {
	    ArrayList<Integer> arrlstInteger = new ArrayList<Integer>();
	    for (int i = min;i <= max; i++) arrlstInteger.add(i);
	    System.out.print("forEach ");
	    for (int i : arrlstInteger) System.out.print("[" + i + "]");
	    System.out.print("\nget ");
	    for (int i = min + 1; i <= max; i+= 2) System.out.print("[" + arrlstInteger.get(i) + "]");
	    System.out.print("\nindexOf");
	    for (int i = min; i <= max + 2; i+= 2) System.out.print("[" + arrlstInteger.indexOf(i) + "]");
		System.out.print("l\nlastIndexOf " + max +" " + arrlstInteger.lastIndexOf(max) + "\n");
		arrlstInteger.remove(5);
		System.out.print("size " + arrlstInteger.size() + "\n");
		ArrayList<Integer> subArrayList = new ArrayList<Integer>();
		for (int i = min + 3;i <= max - 3; i++) subArrayList.add(i);
		arrlstInteger.removeAll(subArrayList);
	    for (int i : arrlstInteger) System.out.print("[" + i + "]");

		System.out.println("\nExecution completed.");
	}
}