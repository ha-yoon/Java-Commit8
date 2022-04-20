package clazz.field;

class Car3 {
	
	 int speed; 
	
	String color;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			return;
		}else {
			this.speed = speed;
		}
	} 
	
	public String getColor() {
		if(speed < 60) {
			this.speed = 60;
		}
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car3 myCar1 = new Car3();
		

		
		myCar1.color = "그레이";
		myCar1.speed = 100;

		
		System.out.println("자동차색상: " + myCar1.color);
		System.out.println("자동차속도: " + myCar1.speed);
		
		myCar1.setColor("그레이");
		myCar1.setSpeed(120);
		
		System.out.println("자동차색상: " + myCar1.getColor());
		System.out.println("자동차속도: " + myCar1.getSpeed());
	}

}
