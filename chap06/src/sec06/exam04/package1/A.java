package sec06.exam04.package1;

public class A {

	// 필드

	A a1 = new A(true); // (O)
	A a2 = new A(1); // (O)
	A a3 = new A("문자열"); // (O)

	// 생성자 오버로딩

	public A(boolean b) { // public 접근 제한

	}

	A(int b) { // default 접근 제한

	}

	private A(String s) { // private 접근 제한

	}

}
