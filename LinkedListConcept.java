package Helloworld;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll= new LinkedList<String>();

// add
ll.add("Manual Testing");
ll.add("Seleniumwebdriver");
ll.add("APITesting");
ll.add("DatabaseTesting");

//Print

System.out.println("Content of linkedlist:" +ll);

// addfirst (add data to first element)

ll.addFirst("Agile Methodology");

// addlast (Add data to last element)

ll.addLast("Total Experience");
System.out.println("Content of linkedlist:" +ll);

// Get (this method to get data from praticular index)

System.out.println(ll.get(1));

// Set (This method is to set the data)

ll.set(0, "Security Testing");

// remove First and last element

ll.removeFirst();
ll.removeLast();
System.out.println("Content of Linkedlist:" +ll);

ll.remove(3);
System.out.println("Content of Linkedlist:" +ll);

// how to print all the values of linkedlist
//1) For loop

System.out.println("*****Using For Loop");

for(int n=0; n<ll.size();n++)
{
	System.out.println(ll.get(n));
}

// 2) Advance loop
System.out.println("*****Using advance For Loop");
for(String str :ll)
{
	System.out.println(str);
}

//3) Iterator

System.out.println("*****Using Iterator");
Iterator<String> it= ll.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

//While loop

int num=0;
while(ll.size()>num)
{
	System.out.println(ll.get(num));
	num++;
}






	}

}
