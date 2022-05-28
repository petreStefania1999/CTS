package composite;

import java.util.ArrayList;

public class Structure extends ANode {

	
	private String name;
	//missing price
	private ArrayList<ANode>list=new ArrayList<>();
	
	public Structure(String name) {
		super();
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Float getPrice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(ANode elem) {
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) {
		list.remove(elem);
	}

	@Override
	public ANode getNode(int index) {
		return this.list.get(index);
	}
	@Override
	public String getInfo() {
		
		String info=" "+this.getName()+" \n";
		for( ANode node : list) {
			info+=" "+node.getInfo()+" ";
			
		}
		
		return info; // return this.name;
		
		
	}

	
	
}
