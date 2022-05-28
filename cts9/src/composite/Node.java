package composite;

//menu product

public class Node extends ANode {

	private String name;
	private Float price;
	
	
	public Node(String name, Float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Float getPrice() {
		return this.price;
	}
	
	//getName, getPrice sunt implemente in ANode, remove,add,get arunca exceptii din ANode(sunt mostenite)
	
}
