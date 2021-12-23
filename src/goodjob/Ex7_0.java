package goodjob;

public class Ex7_0 {
	public static void main(String[] args) {
		Car c = new Car();	
		FireEngine fe = (FireEngine)c;
		fe.water();
	}

}
class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}