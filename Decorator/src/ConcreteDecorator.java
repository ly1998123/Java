
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Componnent componnent)
    {
        super(componnent);
    }   
    public void operation()
    {
        super.operation();
        addedFunction();
    }
    public void addedFunction()
    {
        System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");           
    }
}
