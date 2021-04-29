package mealPlanner;

public class BalancedDiet {
	
	int numOfFruit = 2;
	int numOfGrain = 1;
	int numOfProtein = 1;
	int numOfDairy = 1;
	int numOfVegetable = 1;
	Stock stock;
	boolean completed = false;
	
	BalancedDiet(Stock stock) {
		this.stock = stock;
	}
}
