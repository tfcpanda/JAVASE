package chapeter2;

import java.util.Scanner;

public class Exercise_2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double  p = 3.14159;
		//读取圆柱的半径和高
		System.out.println("请输入圆柱的半径：");
		double radius = input.nextDouble();
		System.out.println("请输入圆柱的高");
		double high = input.nextDouble();
		//计算圆柱的体积
		double area = radius * radius * p;
		double volume = area * high;
		//输入圆柱的体积
		System.out.println("the volume is " + volume);
		
	}

}
