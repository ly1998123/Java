
public class ConcreteHandler1 extends Handler{

	public void handleRequest(String request)
    {
        if(request.equals("one")) 
        {
            System.out.println("���崦����1�����������");       
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
