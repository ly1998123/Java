package myproject3_2;

public class Test {
	public static void main(String[] arg) {
		String str="a";
		double starttime=System.currentTimeMillis();
		for(int i=0;i<1000;i++) 
			str=str+i;
		double endtime=System.currentTimeMillis();
		double time=endtime-starttime;
		System.out.println("String Time is"+time);
		System.out.println(str);
		StringBuilder builder=new StringBuilder("a");
		starttime=System.currentTimeMillis();
		for(int j=0;j<1000;j++)
			builder=builder.append(j);
		endtime=System.currentTimeMillis();
		time=endtime-starttime;
		System.out.println("StringBuilder Time is"+time);
		System.out.println(builder);
		
	}

}
