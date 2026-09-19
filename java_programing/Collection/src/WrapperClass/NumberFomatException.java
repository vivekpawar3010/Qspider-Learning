package WrapperClass;

public class NumberFomatException {
	public static void main(String[] args) {
		Integer i = 10;
		String s = String.valueOf(i);
		System.out.println(s.toCharArray());
		
		String s2 = "Qspider1234";
		
		Boolean i1 = Boolean.parseBoolean(s2);
		System.out.println(i1);
		
		Byte by1 = Byte.parseByte(s2);
		System.out.println(by1);
		
		
		Short s1 = Short.parseShort(s2);
		System.out.println(s1);
		
		Long l1 = Long.parseLong(s2);
		System.out.println(l1);
		
		Float f1 = Float.parseFloat(s2);
		System.out.println(f1);
		
		
		Double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		
	}
	
	public static int add(int a, int b) {
		return a+ b;
	}
	
	public static float add(float a, float b) {
		return a + b;
	}
}
