
public class Client {

	public static void main(String[] args) {
		//ȷ���ײ�����
		MealBuilder mb=new SubMealBuilderA();
		//����Ա��ָ����
		KFCWaiter waiter=new KFCWaiter();
		//����Ա׼���ײ�
		waiter.setMealBuilder(mb);
		//�ͻ�����ײ�
		Meal meal=waiter.construct();
		
		System.out.println("�ײ���ɣ�");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}
}
