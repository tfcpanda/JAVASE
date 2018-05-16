package chapeter2;

import java.util.Scanner;

public class Exercise_2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入室外的温度  temperature");
		double temperature = input.nextDouble();
		
		System.out.println("请输入请输入风速 ");
		double speed = input.nextDouble();
		
		double wind = 35.74 + 0.6215 * temperature - 35.75 * 
				Math.pow(speed, 0.16) + 0.4275 * temperature * 
				Math.pow(speed, 0.16);
		
		System.out.println("The wind chill index is " + wind);
	}

}
