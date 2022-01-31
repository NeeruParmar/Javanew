package Constructor3;

public class TravelClass {

	String destination = "Paris";
	int distance = 3000;
	int durationOfStay = 10;

	TravelClass() {
		System.out.println(" trip Details of the year");

	}

	TravelClass(String destination, int distance, int durationOfStay) {

		this.destination = destination;
		this.distance = distance;
		this.durationOfStay = durationOfStay;
	}

}
