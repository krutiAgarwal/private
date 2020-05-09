package check;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class iterate_HashMap {
	
	public static void main (String arg[]){
		//Iterating or looping Map Using keySet() and foreach loop

//		HashMap<String ,String> hashmap=new HashMap<String, String>();
//		
//		hashmap.put("Key1", "value1");
//		hashmap.put("Key2", "value2");
//		hashmap.put("Key3", "value3");
//		
//		for(String key:hashmap.keySet()){
//			
//			System.out.println("Key" +key +"Value is "+hashmap.get(key));
//			
//			
//			
//		}
		
		
		//iterating through KeySet and iterator

		HashMap<String, String> hashmap1=new HashMap<String, String>();
		hashmap1.put("Key1", "value1");
		hashmap1.put("Key2", "value2");
		  Set<String> keySet = hashmap1.keySet();
		  
		  Iterator<String> keySetIterator=keySet.iterator();
		  while (keySetIterator.hasNext()) {
		        String key = keySetIterator.next();
		        System.out.println("key: " + key + " value: " + hashmap1.get(key));
		    }
		  
		}
	}


