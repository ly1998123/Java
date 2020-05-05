
public class Factory {
	
	public Fruit CreateFruit(String kind) {
		if(kind.equals("Apple")) {
			return new Apple();
		}
		if(kind.equals("Banana")) {
			return new Banana();
		}
		return null;
	}
}
