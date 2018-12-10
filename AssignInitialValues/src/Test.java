
public class Test 

{
	private int field1;
	private int field2;
	private int field3;
	public String name;
	
	public Test(int field1, int field2, int field3, String name)
	{
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
		this.name=name;
	}
	
	public Test(int field2, int field3, String name)
	{
		this(0, field2, field3,name);
	}


}

