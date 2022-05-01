package decorator;

public class ProgMain {
	
	public static void main(String[] args) {
		IPizza pizzaBasic = new PizzaBasic();
		System.out.println(pizzaBasic.getIngredient() +pizzaBasic.getCost());
		
		IPizza pizzaChicken = new PizzaChicken (pizzaBasic);
		System.out.println(pizzaChicken.getIngredient() + pizzaChicken.getCost());
		
		
		
	}
	

}
