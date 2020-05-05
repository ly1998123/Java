
public class FlyWeightPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory=new FlyweightFactory();
        Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");       
        f01.operation(new UnsharedConcreteFlyweight("��1�ε���a��"));       
        f02.operation(new UnsharedConcreteFlyweight("��2�ε���a��"));       
        f03.operation(new UnsharedConcreteFlyweight("��3�ε���a��"));       
        f11.operation(new UnsharedConcreteFlyweight("��1�ε���b��"));       
        f12.operation(new UnsharedConcreteFlyweight("��2�ε���b��"));
	}

}