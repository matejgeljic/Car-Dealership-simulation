package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("John");
		cust1.setAddress("Somewhere in Time 86");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setMake("Honda");
		vehicle.setModel("Accord");
		vehicle.setPrice(10000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);


	}


}
