
public class Context {

	private String[] citys={"�ع�","����"};
    private String[] persons={"����","��Ů","��ͯ"};
    private Expression cityPerson;
    public Context()
    {
        Expression city=new TerminalExpression(citys);
        Expression person=new TerminalExpression(persons);
        cityPerson=new AndExpression(city,person);
    }
    public void freeRide(String info)
    {
        boolean ok=cityPerson.interpret(info);
        if(ok) System.out.println("����"+info+"�������γ˳���ѣ�");
        else System.out.println(info+"�������������Ա�����γ˳��۷�2Ԫ��");   
    }
}
