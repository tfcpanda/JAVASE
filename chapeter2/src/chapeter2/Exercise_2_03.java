package chapeter2;

import java.util.Scanner;

public class Exercise_2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入英尺数");
		double foot = input.nextDouble();
		
		double meter = 0.305 * foot;
		System.out.println(foot + " is " + meter + " meters ");
	}

}
