
public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Componnent p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Componnent d=new ConcreteDecorator(p);
        d.operation();
	}

}
