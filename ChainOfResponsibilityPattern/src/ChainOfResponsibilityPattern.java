
public class ChainOfResponsibilityPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //��װ������ 
        Handler handler1=new ConcreteHandler1(); 
        Handler handler2=new ConcreteHandler2(); 
        handler1.setNext(handler2); 
        //�ύ���� 
        handler1.handleRequest("two");
	}

}
