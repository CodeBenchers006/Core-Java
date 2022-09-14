package encapsulation;

import java.util.List;

public class Medicine {
	
	private int grams;
	private List<String> ingredients;
	private double price;
	
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(int grams, List<String> ingredients, double price) {
		super();
		this.grams = grams;
		this.ingredients = ingredients;
		this.price = price;
	}

	public int getGrams() {
		return grams;
	}

	public void setGrams(int grams) {
		this.grams = grams;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
