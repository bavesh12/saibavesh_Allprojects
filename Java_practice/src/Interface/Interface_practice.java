package Interface;

interface Parent1{
	void flat();
	void car();
}
interface Parent2
{
	void flat();
	void bike();
}
class Child implements Parent1, Parent2{
	public void bike() {
		System.out.println("Sports bike");
	}
	
	public void flat() {
		System.out.println("2BHK falt");
	}
	
	public void car() {
		System.out.println("Sports car");

	}
}
public class Interface_practice {
	public static void main(String[] args) {
		Child soham = new Child();
		soham.bike();
		soham.car();
		soham.flat();

		
	}
}
