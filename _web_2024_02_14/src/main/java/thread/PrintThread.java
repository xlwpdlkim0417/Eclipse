package thread;

public class PrintThread extends Thread {

	private boolean stop; // false 왜? 초기값이 false여

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) { // 무한 루프
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}