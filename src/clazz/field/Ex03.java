package clazz.field;

class Car2 {
	
	String color;
	int speed;
	

	public void setSpeed(int speed) { 
		this.speed = speed;

	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getcolor() {
		return color;
	}
}


public class Ex03 {

	public static void main(String[] args) {
	
		Car2 myCar = new Car2(); 
		myCar.color = "빨강";
		myCar.speed = 100;
		System.out.println("자동차의 색상: " + myCar.color);
		System.out.println("자동차의 속도: " + myCar.speed);
		
		System.out.println();
		
		
		myCar.setSpeed(120);
		int speed = myCar.getSpeed();
		System.out.println("자동차의 속도: " + speed);
		
		myCar.setColor("연하늘");
		String color = myCar.getcolor();
		System.out.println("자동차의 색상: " + color);
		
	}

}
