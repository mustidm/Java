package class28;

public class VehicleTest {

	public static void main(String[] args) {

		Car car=new BMW("bmw");
		car.drive();
		car.start();
		car.stop();
		BMW.displayTotalVehicles();
		
		new BMW("bmw");
		new Toyota("camry");
		Vehicle.displayTotalVehicles();
	}
}
//break till 8:45