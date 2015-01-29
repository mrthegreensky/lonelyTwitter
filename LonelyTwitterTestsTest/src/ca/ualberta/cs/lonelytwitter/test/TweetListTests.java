package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testTweetList() {
		TweetList tweetlist = new TweetList();
		
		assertNotNull("Tweet List not initialised", null);
		//have to fix
	}
	
	public void testCounts() {
		
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		assertEquals("This should be one", 1, tweetList.getCounts());
		
	}
	
	public void testAddTweet() {
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetlist.addTweet(tweet);
		boolean illegalArg = false;
		
		try{
			tweetlist.addTweet(tweet);
		} catch(IllegalArgumentException e) {
			illegalArg = true;
		}
		assertTrue("this should be true", illegalArg);
		
	}
	
	public void testGetTweet() {
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello", new Date());
		NormalTweetModel tweet2 = new NormalTweetModel("Hellos", new Date());
		NormalTweetModel tweet3 = new NormalTweetModel("Hellosz", new Date());
		
		tweetlist.addTweet(tweet);
		tweetlist.addTweet(tweet2);
		tweetlist.addTweet(tweet3);
		
		
		
	}
	
	
	
	
	
}
