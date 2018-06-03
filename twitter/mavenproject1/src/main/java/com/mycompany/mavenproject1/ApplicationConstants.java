/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hp
 */
public class ApplicationConstants {
 
    // Twitter application specific secret constants KEY WAS REMOVED TO PROTECT DEVELOPER TWITTER ACCOUNT https://apps.twitter.com/.   
    public static final String CONSUMER_KEY_KEY = "[INSERT CONSUMER KEY HERE]";
    public static final String CONSUMER_SECRET_KEY = "[INSERT TWITTER DEVELOPER CONSUMER SECRET KEY]";
    public static final String ACCESS_TOKEN_KEY = "[INSERT ACCESS TOKEN KEY]";
    public static final String ACCESS_TOKEN_SECRET_KEY = "[INSERT ACCESS TOKEN SECRET KEY]";
 
    // constants
    public static final String NOT_AVAILABLE = "Not Available";
    public static final String EMPTY = "";
 
    // Topology Constants 
    public static final String TOPOLOGY_NAME = "twitter-topology";
    public static final String TWITTER_SPOUT_ID = "twitterSpout";
    public static final String DETAILS_BOLT_ID = "detailsExtractorBolt";
    public static final String RETWEET_DETAILS_BOLT_ID = "retweetDetailsExtractorBolt";
    public static final String FILE_WRITER_BOLT_ID = "fileWriterBolt";
}