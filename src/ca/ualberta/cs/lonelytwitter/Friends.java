package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

public class Friends implements FriendLike{

	List<User> users = new ArrayList<User>();
	List<User> favorites = new ArrayList<User>();
	
	
	public Friends(List<User> userslist) {
		this.users = userslist;
	}
	
	public void addFriend(User user) {
		this.users.add(user);
	}
	
	public void deleteFriend(User user) {
		this.users.remove(user);
	}
	
	public void FavoriteUser(User user) {
		favorites.add(user);
	}
	
	public void removeFavoriteUser(User user) {
		favorites.remove(user);
	}
	
	
}
