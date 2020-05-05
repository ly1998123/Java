
public class ClientClass {
	public static void main(String[] args) {
		Factory afactory=new AFactory();
		Factory bfactory=new BFactory();
		Fruit fruit=afactory.CreateFruit();
		Fruit fruit1=bfactory.CreateFruit();
		fruit.eat();
		fruit1.eat();
	}
	public String factory(String fruitname) {
		if(fruitname.equals("Apple")) {
			return "Apple";
		}
		if(fruitname.equals("Banana")) {
			return "Banana";
		}
		return null;
	}

}
