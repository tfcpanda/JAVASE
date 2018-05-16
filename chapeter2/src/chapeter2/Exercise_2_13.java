package chapeter2;

public class Exercise_2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double monthRate = 1 + 0.05 / 12;
		
		double firstMonth =	100 * monthRate;
		
		double secondMonth = (firstMonth + 100) * monthRate;
		
		double thirdMonth = (secondMonth + 100) * monthRate;
				
		double fourthMonth = (thirdMonth + 100) * monthRate;
		
		double fifth = (fourthMonth + 100) * monthRate;
		
		double sixth = (fifth + 100) * monthRate;
		
		System.out.println(sixth);
	}

}
