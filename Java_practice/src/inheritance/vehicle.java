package inheritance;

//Vehicle
class Vehicle1 {
	void start() {
		System.out.println("Vehicle is starting.");
	}

	void stop() {
		System.out.println("Vehicle has stopped.");
	}
}

class Four_Wheeler extends Vehicle1 {
	void driveType() {
		System.out.println("This is a four-wheeler vehicle.");
	}
}

class Petrol_Four_Wheeler extends Four_Wheeler {
	void fuelType() {
		System.out.println("Powered by petrol.");
	}
}

class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
	void seatingCapacity() {
		System.out.println("Seating capacity: 5 people.");
	}
}

class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
	void modelName() {
		System.out.println("Model: Maruti Suzuki Baleno.");
	}
}

public class vehicle {
	public static void main(String[] args) {
		Baleno_FiveSeater_Petrol_Four_Wheeler baleno = new Baleno_FiveSeater_Petrol_Four_Wheeler();
		baleno.start();
		baleno.driveType();
		baleno.fuelType();
		baleno.seatingCapacity();
		baleno.modelName();
		baleno.stop();

	}
}
