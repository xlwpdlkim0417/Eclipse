package sec01.exam02;

public class Student extends People {

	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출 //People 생성자인 People(String name, String ssn)을 호출
		this.studentNo = studentNo;
	}

}
