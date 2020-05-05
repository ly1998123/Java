
public class ChainOfResponsibilityPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //组装责任链 
        Handler handler1=new ConcreteHandler1(); 
        Handler handler2=new ConcreteHandler2(); 
        handler1.setNext(handler2); 
        //提交请求 
        handler1.handleRequest("two");
	}

}
