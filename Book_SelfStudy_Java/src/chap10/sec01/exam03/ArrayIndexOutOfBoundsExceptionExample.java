package chap10.sec01.exam03;
//ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		if (args.length == 2) {
			// 조건식 : String 타입 배열 args의 길이가 2이면
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);

		} else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}
	}
}