package core;

public class Expense extends Entry {

	private ExpenseCategory category;
	private static char type = 'E';
	
	public Expense() {}
	
	public Expense(ExpenseCategory category) {
		this.category = category;
	}

	public ExpenseCategory getCategory() {
		return category;
	}

	public void setCategory(ExpenseCategory category) {
		this.category = category;
	}

	public static char getType() {
		return type;
	}

	public static void setType(char type) {
		Expense.type = type;
	}
}
