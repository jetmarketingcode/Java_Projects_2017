/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateCapitals;
import java.util.HashMap;
import java.util.Set;
import static jdk.management.resource.internal.SimpleResourceContext.get;
/**
 *
 * @author apprentice
 */
public class StateCapitals {

    public static void main(String[] args) {
        
        HashMap<String ,String> capitals= new HashMap<>();
        
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona","Phoenix");
        capitals.put("Arkansas", "Little Rock");
        
    Set<String> keys = capitals.keySet();
    
    
    
    for (String k : keys){
        System.out.println(k);
    }
    
    for (String k : keys){
        System.out.println(" " + capitals.get(k));
    }
    
    for (String k : keys){
        System.out.println("" + (k) + " "+ capitals.get(k));
    }
    
    
    }
    
    
   
}
