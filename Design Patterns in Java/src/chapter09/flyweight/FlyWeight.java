package chapter09.flyweight;

public class FlyWeight {
	
	public static String getStaticString() {
		String fly = "flyWeight";
		
		return fly;
	}
	
	public static String getNewString() {
		String fly = new String("flyWeight");
		
		return fly;
	}
	
}