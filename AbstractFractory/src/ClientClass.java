
public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AConF af=new AConF();
		BConV bv=new BConV();
		Fruit fruit = af.CreateF();
		Vegetables vegetables=bv.CreateV();
		fruit.eat();
		vegetables.eat();
	}

}
