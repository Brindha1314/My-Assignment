package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber 
{
	static void printMissingElements(int arr[],
            int N)
{

int diff = arr[0] - 0;

for(int i = 0; i < N; i++)
{
if (arr[i] - i != diff)
{

while (diff < arr[i] - i)
{
System.out.print((i + diff) + " ");
diff++;
}
}
}
}
public static void main (String[] args)
{
int arr[] = { 6, 7, 10, 11, 13,13 };

int N = arr.length;
System.out.println("The Numbers is:" + "6, 7, 10, 11, 13,13" );
System.out.println("The missing Numbers is:");
printMissingElements(arr, N);

List<Integer>N1 = new ArrayList<Integer>();
N1.add(6);
N1.add(7);
N1.add(10);
N1.add(11);
N1.add(13);
N1.add(13);
HashSet<Integer>set = new HashSet<Integer>(N1);
List<Integer>N2 = new ArrayList<Integer>(set);
System.out.println("List after removing duplicate elements:");
for (Object ob: N2)
   System.out.println(ob);

Set<Integer> random = new HashSet<Integer>();
for (int i = 0; i < 10; i++) {
    random.add((int) (Math.random() * 100));
}
System.out.println("Initial Set: " + random);

Set<Integer> sorted = new TreeSet<Integer>(random);
System.out.println("Sorted Set: " + sorted);
}
}
