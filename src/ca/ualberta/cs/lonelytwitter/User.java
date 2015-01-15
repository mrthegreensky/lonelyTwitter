package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User implements UserLike{
	
	//When you have an abstract class, you cannot instantiate a abstract class
	//instead you have to instantiate one of it's subclasses
	
	
	protected String username;
	//protected is that it can be accessed within this class and it's subclasses but not classes under it. 
	//default access modifier ___ which is basically nothing can be accessed only in the same package. 

	public String getUsername() {
		return username;
	}
	
	
	public abstract void setUsername(String x) throws IOException;
	//subclasses of abstract classes need to implement the inherited abstract method
	
	/*
	public void setUsername(String username) {
		this.username = username;
	}
	*/
	
	public User(String username) { 
		this.username = username;
	}
	
	public User() {
		this.username = "annonymous";
	}
	
}
