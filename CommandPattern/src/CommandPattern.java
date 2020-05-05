

public class CommandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command cmd=new ConcreteCommand();
		Invoker ir=new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
	}

}
