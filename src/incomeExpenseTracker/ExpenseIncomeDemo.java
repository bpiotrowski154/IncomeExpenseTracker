package incomeExpenseTracker;

import java.util.ArrayList;

import core.ExpenseCategory;
import core.User;
import data.ManageExpenseCategory;

public class ExpenseIncomeDemo {

	public static void main(String[] args) {

		// ***** CREATE *****
		/**
		 * // set user details User user = new User();
		 * user.setId(1);
		 * 
		 * // get expense category details ExpenseCategory expenseCategory = new
		 * ExpenseCategory(); expenseCategory.setName("Travel");
		 * expenseCategory.setId(user.getId());
		 * 
		 * // save expense category int id =
		 * ManageExpenseCategory.create(expenseCategory); System.out.println(id);
		 */

		// ***** READ SINGLE *****
		/**
		 * ExpenseCategory singleCategory = new ExpenseCategory(); singleCategory =
		 * ManageExpenseCategory.readSingle(2, 1);
		 * System.out.println(singleCategory.getName());
		 */

		// ***** READ ALL *****
		/**
		ArrayList<ExpenseCategory> list = new ArrayList<ExpenseCategory>();
		list = ManageExpenseCategory.readAll(1);

		for (int i = 0; i < list.size(); i++) {
			ExpenseCategory expenseCategory = list.get(i);
			System.out.println(expenseCategory.getId());
			System.out.println(expenseCategory.getName());
			System.out.println("-------------");
		}
		*/
		
		// ***** UPDATE *****
		/***
		User user = new User();
		user.setId(1);
		
		ExpenseCategory expenseCategory = new ExpenseCategory();
		expenseCategory.setId(1);
		expenseCategory.setName("Education");
		expenseCategory.setUser(user);
		
		int id = ManageExpenseCategory.update(expenseCategory);
		System.out.println(id);
		*/
		
		// ***** DELETE *****
		/**
		ExpenseCategory expenseCategory = new ExpenseCategory();
		expenseCategory.setId(2);
		int id = ManageExpenseCategory.delete(expenseCategory);
		System.out.println(id);
		*/
		 
	}
}
