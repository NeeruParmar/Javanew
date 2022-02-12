package Overiding;

public class NonVegetarion extends Vegetarion {
	public void butterChicken() {
		System.out.println(" butterchicken");
	}
	
	@Override
	public void ricePlain() {
		System.out.println("Plain Rice with lemon");
	}

}
