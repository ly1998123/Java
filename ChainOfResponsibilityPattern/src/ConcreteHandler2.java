
public class ConcreteHandler2 extends Handler{

	public void handleRequest(String request)
    {
        if(request.equals("two")) 
        {
            System.out.println("���崦����2�����������");       
        }
        else
        {
            if(getNext()!=null) 
            {
                getNext().handleRequest(request);             
            }
            else
            {
                System.out.println("û���˴��������");
            }
        } 
    }
}
