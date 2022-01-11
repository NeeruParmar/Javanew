package LoopAssignment;

public class QuestionTwoUseWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int buckCap = 10;
		int tankVol = 0;
		int counter = 1;

		while (counter <= 10) {
			tankVol = tankVol + buckCap;
			counter++;
			if (tankVol == 100)
				break;

		}
		
		System.out.println("tank full" + tankVol);

	
	}

}
