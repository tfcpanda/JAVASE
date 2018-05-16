package chapeter2;

import java.util.Scanner;

public class Exercise_2_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入初始速度");
		double firstSpeed = input.nextDouble();
		System.out.println("请输入终止速度");
		double lastSpeed = input.nextDouble();
		System.out.println("请输入时间");
		double time = input.nextDouble();
		
		double avgSpeed = (lastSpeed - firstSpeed) / time;
		System.out.println("平均速度是 "+avgSpeed);
	}

}
