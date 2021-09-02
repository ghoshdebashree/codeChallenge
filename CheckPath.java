
import java.util.HashMap;
import java.util.Map;


public class CheckPath {
  public static String tracePath(Map < String, String > map) {

    String result = "";
    String from ="";
    String to="";
    HashMap < String,String > reverseMap = new HashMap < >();

                                                                        //To fill reverse map, iterate through the given map
    for (Map.Entry < String, String > entry : map.entrySet())		
      reverseMap.put(entry.getValue(), entry.getKey());

    for (Map.Entry < String, String > entry: map.entrySet()) {
      if (!reverseMap.containsKey(entry.getKey())) {
         from = entry.getKey();
      }
    }
                                                                          //Trace complete path
    to = map.get(from);

    while (to != null) {
      result += from + "->" + to + ", ";
      from = to;
      to = map.get(to);
    }
    return result; 
  }

  public static void main(String[] args) {
    HashMap<String,String> hMap = new HashMap<>();  

    hMap.put("NewYork","Chicago");
    hMap.put("Boston","Texas");
    hMap.put("Missouri","NewYork");
    hMap.put("Texas","Missouri");

    String actual_output = CheckPath.tracePath(hMap);

    System.out.println(actual_output);
  }
}
