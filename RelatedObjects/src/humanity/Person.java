package humanity;

public class Person {
	  private String name;
      private Person friend;
      
	public Person(String name) {
		
		this.name = name;
	}
	
	public boolean addFriend(Person friend) {
		boolean x = true;
		if(friend == null || getName() == friend.getName()) {
			x = false;
			
		}else {
			this.friend = friend;
		}
			
		return x;
	}
	
	public boolean removeFriend() {
		boolean x = true;
		if(this.friend == null) {
			x = false;
		}else {
			this.friend = null;
			
		}
		return x;
	}
	
	public boolean isLonely() {
		boolean x = false;
		if(this.friend == null) {
			x = true;
		}
		return x;
	}
	
	public Person getFriend() {
		return this.friend;
	}
	
	public String getName() {
		return this.name;
	}

	
	public String getFriendName() {
		String x = null;
		if(friend == null) {
			
		}else {
			x = this.getFriend().getName();
		}
		return x;
	}
	
	

}
