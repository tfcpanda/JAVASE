package chapeter2;

import java.util.Scanner;

public class Exercise_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入水的重量");
		double waterWeight = input.nextDouble();
		System.out.println("请输入初始温度");
		double firstTemperature = input.nextDouble();
		System.out.println("请输入最终的温度");
		double lastTemperature = input.nextDouble();
		
		double energy = waterWeight * (lastTemperature - firstTemperature) * 4184;
		System.out.println("所需要的温度是 " + energy);
	}
}
