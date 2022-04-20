package clazz.field;



class Person {
	
	private String name;
	private int age;
	private String tel;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 20 || age > 60) {
			System.out.println("나이는 20살부터 60살까지만 입력가능합니다.");
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	
	public String  getTel() {
		return tel;
	}
	public void setTel(String Tel ) {
		this.tel = tel;
	}
}




public class Ex05 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("홍길동");
		person.setAge(20);
		person.setTel("010-7777-1235");
		
		String name = person.getName();
		int age = person.getAge();
		String tel = person.getTel();
		
		System.out.println("이름은: " + name);
		System.out.println("나이는: " + age);
		System.out.println("전화번호는: " + tel);
		

	}

}
