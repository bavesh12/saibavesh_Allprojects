package inheritance;

class Mohan {
	void surname() {
		System.out.println("Sharma");
	}

	void flat() {
		System.out.println("2BHK flat");
	}

	void car() {
		System.out.println("Baleno car");
	}
}

class Sonam extends Mohan {
	void bike() {
		System.out.println("pulsar");
	}

	void job() {
		System.out.println("IT");
	}
}

public class family {
	public static void main(String[] args) {
		Sonam son = new Sonam();
		System.out.println("Sonam ");
		son.surname();
		son.car();
		son.bike();
		son.job();
	}
}
