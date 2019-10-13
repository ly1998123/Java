
import java.util.concurrent.CountDownLatch;

public class Mulithread extends Thread{
	private int[][] m1;
	private int[][] m2;
	private int[][] result;
	private int index;
	private int gap;
	private CountDownLatch countDownLatch;
	public Mulithread(int[][] m1,int[][] m2,int index,int gap,int[][] result,CountDownLatch countDownLatch) {
		this.m1=m1;
		this.m2=m2;
		this.result=result;
		this.index=index;
		this.countDownLatch=countDownLatch;
		this.gap=gap;
	}
	public void run() {
		for(int i=index*gap;i<(index+1)*gap;i++) 
			for(int j=0;j<m2[0].length;j++) {
				for(int k=0;k<m2.length;k++)
					result[i][j]+=m1[i][k]*m2[k][j];
				
			}
	}
	public static void main(String[] args) throws InterruptedException {
		double starttime;
		double endtime;
		int row_m1=10000;
		int col_m1=10000;
		int row_m2=10000;
		int col_m2=10000;
		int [][] m1=new int [row_m1][col_m1];
		int [][] m2=new int [row_m2][col_m2];
		int [][] parallel_result=new int [m1.length][m2[0].length];
		int [][] serial_result=new int [m1.length][m2[0].length];
		int threadNum=4;
		int gap=m1.length/threadNum;
		CountDownLatch countDownLatch=new CountDownLatch(threadNum);
		for(int i=0;i<row_m1;i++)
			for(int j=0;j<col_m1;j++) {
				m1[i][j]=(int)(Math.random()*1000);
			}
		for(int i=0;i<row_m1;i++)
			for(int j=0;j<col_m2;j++) {
				m2[i][j]=(int)(Math.random()*100);
			}
		//单线程矩阵乘法
		starttime=System.currentTimeMillis();
		for(int i=0;i<m1.length;i++)
			for(int j=0;j<m2[0].length;j++) {
				for(int k=0;k<m1[0].length;k++)
					serial_result[i][j]+=m1[i][k]*m2[k][j];
			}
		endtime=System.currentTimeMillis();
		double time=endtime-starttime;
		System.out.println("单线程的时间："+time);
		//多线程矩阵乘法
		starttime=System.currentTimeMillis();
		for(int i=0;i<threadNum;i++) {
			Mulithread mt=new Mulithread(m1,m2,i,gap,parallel_result,countDownLatch);
			mt.start();
		}
		//countDownLatch.await();
		endtime=System.currentTimeMillis();
		time=endtime-starttime;
		System.out.println("多线程的时间："+time);
		
		}
}
