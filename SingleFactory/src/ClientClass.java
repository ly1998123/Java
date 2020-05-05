
public class ClientClass {
	public static void main(String[] args) {
		Factory factory=new Factory();
		Fruit fruit=factory.CreateFruit("Apple");
		Fruit fruit1=factory.CreateFruit("Banana");
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
