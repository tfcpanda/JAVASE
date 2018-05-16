package chapeter2;

import java.util.Scanner;

public class Exercise_2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入单位速度");
		double speed = input.nextDouble();
		System.out.println("请输入加速度");
		double acceleration = input.nextDouble();
		
		double length = (speed * speed) / (2 * acceleration);
		
		System.out.println("跑道的长度是 " + length);
	}

}
