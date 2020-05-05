
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Implementor imple=new ConcreteImplementorA();
	     Abstraction abs=new RefinedAbstraction(imple);
	     abs.Operation();

	}

}
