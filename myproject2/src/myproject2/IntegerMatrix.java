package myproject2;

public class IntegerMatrix extends GenericMatrix<Integer>{

	@Override
	protected Integer add(Integer o1, Integer o2 ){  
        return o1+o2;  
    }  
    //实现GenericMatrix中的mltiply抽象方法
    protected Integer multiply(Integer o1, Integer o2){  
        return o1*o2;  
    }  
    //实现GenericMatrix中的zero抽象方法
    protected Integer zero(){  
        return 0;  
    }  

}
