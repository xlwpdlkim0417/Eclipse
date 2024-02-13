package java_2024_01_30.sec01.exam22;

public class BoxingEx {

	public static void main(String[] args) {
//		Integer obj1 = new Integer(100);

		Integer num1 = new Integer(100);
		Integer num2 = new Integer(100);
		System.out.println(num1 == num2);
		System.out.println(num1.equals(num2));
		// == 말고 equals로 

		int x = 100;
		String str = "가나다";
		Integer obj2 = Integer.valueOf("100"); // 박싱
		Integer obj1 = 300;
		System.out.println(obj1);
		int y = obj1.intValue(); // 언박싱
		System.out.println(y);
		int z = x + obj1;
		System.out.println(z);

		System.out.println(x == obj2);
		System.out.println(x < obj2);

	}

}
