
public class Decorator implements Componnent{

	private Componnent componnent;   
    public Decorator(Componnent componnent)
    {
        this.componnent=componnent;
    }   
    public void operation()
    {
        componnent.operation();
    }
}
