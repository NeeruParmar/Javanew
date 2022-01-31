package Constructor3;

public class PlanningTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravelClass obj1 = new TravelClass();
		TravelClass obj2 = new TravelClass("India", 3500, 20);

		System.out.println("First Trip Information");
		System.out.println("Destination = " + obj1.destination);
		System.out.println("Distance in Kilometers= " + obj1.distance);
		System.out.println("Duration of the Stay = " + obj1.durationOfStay);

		System.out.println("Second Trip");

		System.out.println("Destination = " + obj2.destination);
		System.out.println("Distance in Kilometers = " + obj2.distance);
		System.out.println("Duration of the Stay= " + obj2.durationOfStay);

	}

}
