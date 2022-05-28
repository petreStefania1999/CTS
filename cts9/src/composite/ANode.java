package composite;

public abstract class ANode {
		//se comporta ca si o frunza si o structura
	

	
	public abstract String getName();
	public abstract Float getPrice();
	public  String getInfo() {
		return getName()+' '+getPrice();
	}
	
	public void addNode(ANode elem) {
		throw new UnsupportedOperationException();
	}
	
	public void removeNode(ANode elem) {
		throw new UnsupportedOperationException();

	}
	public ANode getNode(int i) {
		throw new UnsupportedOperationException();

	}
}
