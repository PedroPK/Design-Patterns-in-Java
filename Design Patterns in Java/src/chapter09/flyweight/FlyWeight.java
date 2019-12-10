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
	
	public static String getConcatenatedString() {
		String fly = "fly" + "Weight";
		
		return fly;
	}
	
	public static String getSequenciallyConcatenatedString() {
		String fly = "fly";
		String weight = "Weight";
		
		fly = fly + weight;
		
		return fly;
	}
	
}