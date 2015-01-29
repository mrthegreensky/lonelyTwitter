package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSample() {
		
		//fail("This is a failing test");
		//assertTrue("This is false", isGreaterThan(5,6));
		assertEquals("5 is equal to 5", 5,5 );
		//assertEquals("5 is equal to 5", 5,6 );
	}
	
	private boolean isGreaterThan(int i, int j) {
		if (i > j) 
			return true;
		else
			return false;
	}
	
	public void testEquals() {
		Date date = new Date();
		NormalTweetModel tweet1 = new NormalTweetModel("Hello", date);
		NormalTweetModel tweet2 = new NormalTweetModel("Hello", date);
		assertTrue("Different tweets are different", tweet1.equals(tweet2));
	}
	
	public void testNotEquals() {
		NormalTweetModel tweet3 = new NormalTweetModel("Hello", new Date(123));
		NormalTweetModel tweet4 = new NormalTweetModel("Hello", new Date(321));
		assertFalse("These tweets are not different", tweet3.equals(tweet4));
	}
	
	
	public void testEqualsclass() {
		Date date = new Date();
		
		
		NormalTweetModel normalTweet = new NormalTweetModel("Hello", date);
		ImportantTweetModel importantTweet = new ImportantTweetModel("Hello", date);
		
		assertFalse("These two tweets are not the same", normalTweet.equals(importantTweet));
		assertFalse("These two tweets are not the same", importantTweet.equals(normalTweet));
		
	}
	
	
}
