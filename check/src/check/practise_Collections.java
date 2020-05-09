package check;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class practise_Collections {
	
	public static void main(String[] args) {
	//Sorting the HashMap Keys 	
HashMap<Integer, String> hashMap=new HashMap<Integer, String>();

hashMap.put(22, "A");
hashMap.put(23, "B");
hashMap.put(24, "C");
hashMap.put(25, "D");

System.out.println("Before Sorting");

Set set=hashMap.entrySet();

Iterator itr=set.iterator();

while(itr.hasNext()){
	
	Map.Entry pair=(Map.Entry)itr.next();
	System.out.println(pair.getKey()+"");
	System.out.println(pair.getValue());
	
	
}
Map<Integer, String> map = new TreeMap<Integer, String>(hashMap);     System.out.println("After Sorting:");
Set set2 = map.entrySet();
Iterator iterator2 = set2.iterator();
while(iterator2.hasNext()) {
    Map.Entry pair = (Map.Entry)iterator2.next();
    System.out.print(pair.getKey() + ": ");
    System.out.println(pair.getValue());
} 
}
}
		
		
		
		
		
	


