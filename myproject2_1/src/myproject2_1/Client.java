package myproject2_1;

public class Client {
	public static void main(String[] args) {
		//调用静态代理
        StaticProxy staticProxy = new StaticProxy(new FoodServiceImpl());
        staticProxy.makeChicken();
        //调用动态代理
        DynamicProxy dynamicProxy=new DynamicProxy();
        FoodService foodService=(FoodService)dynamicProxy.newProxyInstance(new FoodServiceImpl());
        //UserManager userManager=new UserManagerImpl();
        foodService.makeChicken();
    }

}
/*静态代理：就是创建一个代理类通过接口来代理原始类，实现被代理类的功能，外界通过代理类来访问被代理类
 *例如，StaticProxy是静态代理类，FoodService是接口，FoodServiceImpl是被代理类，在调用的时候代理类通过接口实现被代理的方法
 *静态代理优点：
 *业务类只需要关注业务逻辑本身，保证了业务类的重用性。这是代理的共有优点。 
 * 静态代理缺点： 
 *1、代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。 
 *2、如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。 
 */
/*动态代理：
 * 动态代理与静态代理相比较，最大的好处是接口中声明的所有方法都被转移到一个集中的方法中处理（invoke),这样在接口方法数量比较多的时候
 * 我们可以进行灵活处理，而不需要像静态代理那样，每个方法都需要中转。
 * 动态代理只能代理接口，代理类都需要实现InvocationHandler类，实现invoke方法，该invoke方法就是调用被代理类方法时所需要
 * 调用的。
 * 动态代理的优点：
 * 代码重用性强。同样的，如果我们代理类的增强功能都一样，使用动态代理可以大大减少代码的编写量。
 *代理类与被代理类完全解耦。可以观察到代理类的代码中没有任何与被代理类相关的片段，这就实现了两者的解耦，使得代理类只需要去实现的逻辑，其他的并不关心。
 */
