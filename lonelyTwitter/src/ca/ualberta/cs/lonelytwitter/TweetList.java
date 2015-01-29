package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TweetList {
	
	private ArrayList<LonelyTweetModel> tweetlist;
	private int count;
	
	public TweetList() {
		tweetlist = new ArrayList<LonelyTweetModel>();
		count = 0;
	}
	
	
	public Object[] ArraygetTweets() {
		
		return tweetlist.toArray();
	}
	
	public int getCounts() {
		return count;
	}
	
	public void addTweet(LonelyTweetModel tweet) {
		
		if(tweetlist.contains(tweet)) {
			throw new IllegalArgumentException("This tweet already exists!");
		}
		
		
		
		tweetlist.add(tweet);
		count++;
	}
	

}
