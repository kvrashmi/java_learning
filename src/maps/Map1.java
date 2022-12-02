package maps;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		Map<String,String> pet = new HashMap<String,String>();
		pet.put("Pet1","Cat");
		pet.put("Pet2","Dog");
		pet.put("Pet3","Pig");
		
		System.out.println("Pet:"+pet);
		Map<String,String> wild = new HashMap<String,String>();
		wild.put("Wild1","Lion");
		wild.put("Wild2","Tiger");
		wild.put("Wild3","Boar");
		
		System.out.println("Wild:"+wild);

		pet.putAll(wild);
		System.out.println("Pet+Wild:"+pet);
		
		pet.putIfAbsent("Pet4", "Lizard");
		pet.putIfAbsent("Pet4", "Spider"); //Since Pet4 already exists, this wont be added to the map.
		System.out.println("Pet after PutIfAbsent:"+pet);
	}

}
