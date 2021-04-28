package mealPlanner;

public class MealPlanner {

	public static void main(String[] args) {
		//Item testItem = new Item("Banana", 2, 1);
		Stock newStock = new Stock("./CSVfiles/stock.csv");
		newStock.setStock();
		//newStock.getStock();
		
		BalancedDiet newDiet = new BalancedDiet(newStock);
		newDiet.setupPlan();
	}
}
