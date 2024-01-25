package core;

public class Base {
	
	private int id;
	private User user;
	
	public Base() {}

	public Base(int id, User user) {
		super();
		this.id = id;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
