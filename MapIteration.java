package babbar_practiceprogToJava8;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String args[]){
	HashMap<String,Integer> mapItr=new HashMap<String,Integer>();
	mapItr.put("shiva",1);
	mapItr.put("pooja",2);
	mapItr.put("call",3);
	mapItr.put("priyaka chopra",1);
	
	for(Entry<String, Integer> entry:mapItr.entrySet()){
		if(entry.getValue()==1)
			System.out.println(entry.getKey());
	}
	
	//java 8
	mapItr.keySet().forEach(p->{
		if(p.equalsIgnoreCase("pooja")){
			System.out.println(p+" "+mapItr.get(p));
		}
	});
	//java 8
	mapItr.entrySet().forEach(p->{
		if(p.getValue()==1)
			System.out.println(p.getKey()+" "+p.getValue());
	});
	//java 8
	mapItr.forEach((k,l)->{
		if(k.equalsIgnoreCase("pooja")){
			System.out.println(k+" "+mapItr.get(k));
		}
	});
	}
}
