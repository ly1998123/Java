package myproject2;

public class TextIntegerMatrix {
	 public static void main(String[] args){  
	        //创建Integer数组
	        Integer[][] m1 = new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};  
	        Integer[][] m2 = new Integer[][]{{1,5,1},{2,4,2},{0,0,0}};
	        
	        //创建IntegerMatrix实例；
	        IntegerMatrix integerMatrix = new IntegerMatrix(); 
	        
	        System.out.println("整数加法 ");  
	        GenericMatrix.printResult(m1,m2,integerMatrix.addMatrix(m1,m2),'+');  
	        
	        System.out.println("整数乘法 ");  
	        GenericMatrix.printResult(m1,m2,integerMatrix.multiplayMatrix(m1,m2),'*'); 
}
}
