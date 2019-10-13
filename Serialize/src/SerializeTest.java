
public class SerializeTest {
	public static void main(String[] args) throws Exception{
		Teacher t=new Teacher();
		SerializeTool.serialize(t, "teacher");
		SerializeTool.printFileInfo("teacher");
		Teacher1 t1=new Teacher1();
		SerializeTool.serialize(t1, "teacher1");
		SerializeTool.printFileInfo("teacher1");
		Teacher2 t2=new Teacher2();
		SerializeTool.serialize(t2, "teacher2");
		SerializeTool.printFileInfo("teacher2");
	}

}
