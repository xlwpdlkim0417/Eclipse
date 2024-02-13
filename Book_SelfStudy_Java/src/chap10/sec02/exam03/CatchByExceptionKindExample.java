package chap10.sec02.exam03;
//다중 catch

public class CatchByExceptionKindExample {

	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;

			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 숫자가 부족합니다.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}