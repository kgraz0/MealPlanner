package mealPlanner;

public class Item {
	
	String name;
	int quantity;
	String type;
	
	Item (int quantity, String type) {
		this.quantity = quantity;
		this.type = type;
	}
	
	Item(String name, int quantity, String type) {
		this.name = name;
		this.quantity = quantity;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + ", type=" + type + "]";
	}
}
