package decorator;

public class DecoratorPizza extends IPizza{
	
	protected IPizza pizza;
	
	public DecoratorPizza(IPizza pizza) {
		this.pizza = pizza;
	}
	
	
	
	@Override
	public String getIngredient() {
		return pizza.getIngredient();
		
	}
	
	@Override
	public float getCost() {
		return pizza.getCost();
		
	}

}
