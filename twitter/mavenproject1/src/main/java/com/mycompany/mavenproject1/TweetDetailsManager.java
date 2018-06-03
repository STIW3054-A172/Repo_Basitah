
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;


public class TweetDetailsManager {

    private static Map<String,FileDetails> cacheManager = new HashMap<String, FileDetails>();
 

    public static FileDetails get(String key) {
        return cacheManager.get(key);
    }
 
   
    public static void init() {
        cacheManager = new HashMap<String,FileDetails>();
    }
 

    public static void addDetails(String key, FileDetails fileDetails) {
        cacheManager.put(key, fileDetails);
    }
 

    public static void remove(String key) {
        cacheManager.remove(key);
    }
 
}