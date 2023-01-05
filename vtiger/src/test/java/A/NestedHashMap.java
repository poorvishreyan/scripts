package A;

import java.util.HashMap;

public class NestedHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> bangaloreCity = new HashMap<String, Integer>();
		bangaloreCity.put("jaynagar", 91);
		bangaloreCity.put("BTM", 92);
		bangaloreCity.put("Hebbal", 93);
		bangaloreCity.put("HSR", 94);
		bangaloreCity.keySet();
		
		HashMap<String, Integer> mysoreCity = new HashMap<String, Integer>();
		mysoreCity.put("vijaynagar", 81);
		mysoreCity.put("Ramnagar", 82);
		mysoreCity.put("palace", 83);
		
		HashMap<String, HashMap<String, Integer>> karnataka = new HashMap<String, HashMap<String, Integer>>();
		
		karnataka.put("Bangalore", bangaloreCity);
		karnataka.put("Mysore", mysoreCity);
		System.out.println(karnataka.get("Bangalore"));                 //to get all the values of Bangalore
		System.out.println(karnataka.get("Mysore").get("Ramnagar"));    //to get particular value
		
		
		 HashMap<String, HashMap<String, Integer>> country = new HashMap<String, HashMap<String, Integer>>();
		 country.put("india", mysoreCity);
		 System.out.println(country.get("india"));
		
	}

}
