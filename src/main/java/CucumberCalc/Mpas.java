package CucumberCalc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import edu.emory.mathcs.backport.java.util.TreeMap;

public class Mpas {

	
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Rohit", 23);
		hm.put("Mom",16);
		hm.put("Dad", 15);
		hm.put("Sis", 31);
		hm.put("Chachu", 19);
		
		
		System.out.println(hm);
		
		Set<Map.Entry<String,Integer>> st = hm.entrySet();
		
		for (Map.Entry<String,Integer> me : st){
			System.out.println(me.getKey() +":"+ me.getValue());
		}
	
		
		
		String REp = "Number of times a particular alphabet is repeating lets see ";
		
		java.util.TreeMap<Character, Integer> as = new java.util.TreeMap<Character, Integer>();
		char[] ass = REp.toCharArray();
		for (char c : ass){
			if(as.containsKey(c)){
				as.put(c,as.get(c)+1);
			}else{
					as.put(c,1);
			}
			
			
		}
		System.out.println(as);
		
		
		
	}
	
}
