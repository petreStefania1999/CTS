package composite;

public class ProgMain {

	public static void main(String[] args) {
		
		Structure menu=new Structure("Menu");
		
		Structure menuDrinks=new Structure("Drinks");
		Structure menuFood=new Structure("Food");
		menu.addNode(menuDrinks);
		menu.addNode(menuFood);
		
		menuFood.addNode(new Node("Pizza margherita", (float) 20.0));
		menuFood.addNode(new Node("Pizza 2", (float) 20));
		menuFood.addNode(new Node("Paste Carbonara", (float) 20));
		
		System.out.println(menu.getInfo());

	

	}

}
