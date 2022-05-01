package decorator;

public class PizzaBasic extends IPizza {
	@Override
	public String getIngredient() {
		return "mozzaralella, tomato";
		
	}
	
	@Override
	public float getCost() {
		return 20;
		
	}

}
