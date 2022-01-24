package Method;

public class MainCarList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarClass obj = new CarClass();
		String newCarName = "";

		newCarName = obj.getCarName();

		String newPlateName = obj.getCarPlateNum();

		System.out.println("Selected Car Model : " + newCarName);

		System.out.println("Selected Car PlateNumber  : " + newPlateName);

		newCarName = "Maruti";
		obj.setCarName("Maruti");

		newCarName = obj.getCarName();
		obj.setCarPlate("MGK123");
		newPlateName = obj.getCarPlateNum();

		System.out.println("Selected Car Model : " + newCarName);
		System.out.println("Selected Car PlateNumber  : " + newPlateName);

	}

}
