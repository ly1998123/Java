
public class RefinedAbstraction extends Abstraction{

	protected RefinedAbstraction(Implementor imple)
	   {
	       super(imple);
	   }
	   public void Operation()
	   {
	       System.out.println("��չ����(Refined Abstraction)��ɫ������" );
	       imple.OperationImpl();
	   }
}
