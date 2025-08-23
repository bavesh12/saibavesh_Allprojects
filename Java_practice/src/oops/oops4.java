package oops;

class Vehicle {
	int speed = 70;
}

class car extends Vehicle {
	int speed = 100;

	void showspeed() {
		System.out.println("car normal speed= " + speed);
		// System.out.println(this.speed);
		System.out.println("Vehicle normal speed = " + super.speed);

	}
}

public class oops4 {
	public static void main(String[] args) {
		car c = new car();
		c.showspeed();
	}
}
