package core;

public class ExpenseCategory extends Base {
	
	private String name;
	
	public ExpenseCategory() {}
	
	public ExpenseCategory(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
