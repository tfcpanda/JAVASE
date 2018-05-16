package chapeter2;

import java.util.Scanner;

public class Exercise_2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入六边形的边长");
		double side = input.nextDouble();
		
		double hexagon = 3 * Math.pow(3, 0.5) / 2 * side * side;
		
		System.out.println(hexagon);
	}

}
