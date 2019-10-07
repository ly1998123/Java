package myproject3_1;
import java.io.File;
import java.util.List;
import org.ddd.annotation.myproject3_1.tool.ClassFileLoader;
import org.ddd.annotation.myproject3_1.tool.Scanner;
import org.ddd.annotation.myproject3_1.util.TableInfo;



public class TablePorcessor implements IProcessor{
	public String process(String url)throws Exception{
		List<File> classFiles=Scanner.getClassFiles(url);
		StringBuilder sql=new StringBuilder();
		for(File file:classFiles) {
			Class<?>clazz=ClassFileLoader.loadClass(file);
			TableInfo tableInfo=new TableInfo();
			TableInfo table=tableInfo.parse(clazz);
			if(table!=null) 
			sql.append(table.toString());
		}
		return sql.toString();
		
		
	}


	

}
