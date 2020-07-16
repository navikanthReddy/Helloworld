package Helloworld;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm= new HashMap<Integer, String>();
		hm.put(1, "Navi");
		hm.put(2, "Ravi");
		hm.put(3, "Kumar");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "" +m.getValue());
		}
		
		
	}

}
