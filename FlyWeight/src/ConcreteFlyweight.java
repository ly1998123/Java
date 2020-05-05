
public class ConcreteFlyweight implements Flyweight{

	private String key;
    ConcreteFlyweight(String key)
    {
        this.key=key;
        System.out.println("������Ԫ"+key+"��������");
    }
    public void operation(UnsharedConcreteFlyweight outState)
    {
        System.out.print("������Ԫ"+key+"�����ã�");
        System.out.println("����Ԫ��Ϣ��:"+outState.getInfo());
    }
}
