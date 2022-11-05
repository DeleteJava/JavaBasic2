package other;

public class Car {
	private String model;
	private int speed;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void show() {
		String result = "%s (%d km/h)\n\n";
		
		System.out.printf(result, model, speed);
	}
	
	public void accel(int speed) {
		this.speed += speed;
		
		System.out.println(speed + " km/h 가속!!!");
		show();
	}
	
	public void _break(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + " km/h 감속!!!");
		show();
	}
}
