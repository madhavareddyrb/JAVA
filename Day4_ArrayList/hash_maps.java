package Day4_ArrayList;

import java.util.HashMap;

public class hash_maps {

  public static void main(String[] args) {
      
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Madhava", 22);
    map.put("Zoro", 20);

    System.out.println(map.get("Zoro"));


    for(String key: map.keySet()){
      System.out.println(key + " " + map.get(key));
    }
  }}
  

