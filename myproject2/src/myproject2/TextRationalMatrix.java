package myproject2;

public class TextRationalMatrix {

	public static void main(String []args){
		Rational[][] m1=new Rational[3][3];
		Rational[][] m2=new Rational[3][3];
		for(int i=0;i<m1.length;i++)
		   for(int j=0;j<m1[0].length;j++)
		   {
			m1[i][j]=new Rational(i+1,j+5);
			m2[i][j]=new Rational(i+1,j+6);
		   }
	RationalMatrix rationalmatrix=new RationalMatrix();
	System.out.println("有理数加法");
	GenericMatrix.printResult(m1,m2, rationalmatrix.addMatrix(m1, m2), '+');
	System.out.println("有理数乘法");
	GenericMatrix.printResult(m1, m2, rationalmatrix.multiplayMatrix(m1, m2),'*');
	}
	
	

}
