// A tricky Java code to predict the output 
// based on order of 
// execution of constructors, static 
// and initialization blocks 
class MyTest { 
	static
	{ 
		System.out.println("First Start Static Block");
		initialize(); 
		System.out.println("First End Static Block");
	} 
	
	private static int sum; 
	
	public static int getSum() 
	{ 
		initialize(); 
		return sum; 
	} 

	private static boolean initialized = false; 

	private static void initialize() 
	{ 
		if (!initialized) { 
			for (int i = 0; i < 100; i++) 
				sum += i; 
			initialized = true; 
		} 
	} 
} 
public class BInitStaticBlocks
{
	public static void main(String[] args) 
	{ 
		System.out.println(MyTest.getSum()); 
	} 
} 