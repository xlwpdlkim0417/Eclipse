package sec01.exam01;

public class BeepPrintEx {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
				//sleep() 메소드를 쓰기 위해 Thread에서 불러온 거임
			} catch (InterruptedException e) {
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
			}
		}
	}
}