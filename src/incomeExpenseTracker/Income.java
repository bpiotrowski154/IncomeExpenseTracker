package core;

public class Income extends Entry {

	private static char type = 'I';
	
	public Income() {}

	public static char getType() {
		return type;
	}

	public static void setType(char type) {
		Income.type = type;
	}
}
