package mealPlanner;

public class MealPlanner {

	public static void main(String[] args) {

		Stock newStock = new Stock("./CSVfiles/stock.csv");
		newStock.setStock();
		createBalancedDiet(newStock);
	}
	
	public static void createBalancedDiet(Stock stock) {
		Item fruit = stock.pickItem("Fruit");
		Item grain = stock.pickItem("Grain");
		Item protein = stock.pickItem("Protein");
		Item dairy = stock.pickItem("Dairy");
		Item vegetable = stock.pickItem("Vegetable");
		Item fruit2 = stock.pickItem("Fruit");
		Item fruit3 = stock.pickItem("Fruit");
		//Item whatever = stock.pickItem("whatever");
		
		System.out.println(fruit);
		System.out.println(grain);
		System.out.println(protein);
		System.out.println(dairy);
		System.out.println(vegetable);
		System.out.println(fruit2);
		System.out.println(fruit3);
		//stock.getStock();
	}
}
