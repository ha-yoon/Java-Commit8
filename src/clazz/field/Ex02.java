package clazz.field;

class Car {
	

	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 250;
	int speed; 
}


public class Ex02 {

	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		
	
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
	
	
	
	}

}
