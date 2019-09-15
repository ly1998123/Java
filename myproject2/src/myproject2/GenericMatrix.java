package myproject2;

public abstract class GenericMatrix<M extends Number> {
protected abstract M add(M m1,M m2);
protected abstract M multiply(M m1,M m2 );
protected abstract M zero();
public M[][]addMatrix(M[][] matrix1,M[][] matrix2)
{
	if(matrix1.length!=matrix2.length||matrix1[0].length!=matrix2[0].length)
	{
		throw new RuntimeException ("The matrics do not have same size!");
	}
	@SuppressWarnings("unchecked")

	M[][] result=(M[][])new Number[matrix1.length][matrix1[0].length];
	for(int i=0;i<result.length;i++)
		for(int j=0;j<result[0].length;j++)
	{
			result[i][j]=add(matrix1[i][j],matrix2[i][j]);
	}
	return result;
}
public M[][]multiplayMatrix(M[][] matrix1,M[][] matrix2)
{
	 if (matrix1[0].length != matrix2.length){  
         throw new RuntimeException("The matrices do not have the same size!");  
     }
     M[][] result = (M[][])new Number[matrix1.length][matrix2[0].length];  
     for(int i=0;i<result.length;i++) {
         for(int j=0;j<result[0].length;j++) {
             result[i][j]=zero();
             for(int k=0;k<matrix1[0].length;k++) {
                 result[i][j]=add(result[i][j],multiply(matrix1[i][k],matrix2[k][j]));
             }
         }
     }
     return result;
 }
public static void printResult(Number[][] m1,Number[][] m2,Number[][] m3,char op) {
    for(int i=0;i<m1.length;i++) {
        for(int j=0;j<m1[0].length;j++)
            System.out.print(" "+m1[i][j]);
        if(i==m1.length/2)
            System.out.print(" "+op+ " ");
        else
            System.out.print("   ");
        for(int j=0;j<m2.length;j++)
            System.out.print(" "+m2[i][j]);
        if(i==m1.length/2)
            System.out.print(" = ");
        else
            System.out.print("   ");
        for(int j=0;j<m3.length;j++)
            System.out.print(m3[i][j]+" ");
        System.out.println();
    }
}
}

