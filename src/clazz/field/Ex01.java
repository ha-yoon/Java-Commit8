package clazz.field;


class Student {
	
	int studentID = 202201;
	String name = "홍길동";	
	
	public void study() {
		String place = "도서관";
		int time = 2;
		
		System.out.println(place + "에서" + time + "시간동안 공부합니다.");
	}
	
	public void profile() {
		
		
		System.out.println(name + "님의 학번은: " + studentID);
	
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {

		Student stu = new Student(); 
		
		
		System.out.println(stu.studentID);
		System.out.println(stu.name);
		System.out.println();
		
	
		stu.study();
		stu.profile();

	}

}
