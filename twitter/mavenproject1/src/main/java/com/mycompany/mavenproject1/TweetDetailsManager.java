/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class TweetDetailsManager {
    // intialize map object.
    private static Map<String,FileDetails> cacheManager = new HashMap<String, FileDetails>();
 
    /**
     * @param key
     * @return FileDetails
     * get value by passing key.
     */
    public static FileDetails get(String key) {
        return cacheManager.get(key);
    }
 
    /**
     */
    public static void init() {
        cacheManager = new HashMap<String,FileDetails>();
    }
 
    /**
     * @param key
     * @param fileDetails
     * Add elements to map.
     */
    public static void addDetails(String key, FileDetails fileDetails) {
        cacheManager.put(key, fileDetails);
    }
 
    /**
     * @param key
     * Remove map element using key.
     */
    public static void remove(String key) {
        cacheManager.remove(key);
    }
 
}