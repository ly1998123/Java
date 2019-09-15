package myproject2_1;
//静态代理类
public class StaticProxy implements FoodService{

	private FoodService foodService;
    public StaticProxy(FoodService foodService){
        this.foodService = foodService;
    }
	@Override
	public void makeNoodle() {
		// TODO Auto-generated method stub
		foodService.makeNoodle();
	}

	@Override
	public void makeChicken() {
		// TODO Auto-generated method stub
		foodService.makeChicken();
	}

}
