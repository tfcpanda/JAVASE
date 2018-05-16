package chapeter2;

import java.util.Scanner;

public class Exercise_2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入 x1 和 y1 的点");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("请输入 x2 和 y2 的点");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double temp = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2);
		double distance = Math.pow(temp, 0.5);
		
		System.out.println(distance);
		}
}
