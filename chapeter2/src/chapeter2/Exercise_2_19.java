package chapeter2;

import java.util.Scanner;

public class Exercise_2_19 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个点 x1 y1");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("请输入第二个点x2 y2");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println("请输入第三个点x3 y3");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 =Math.pow((x1 - x2) * (x1 - x2) - (y1 - y2) * (y1 - y2), 0.5);
		double side2 =Math.pow((x1 - x3) * (x1 - x3) - (y1 - y3) * (y1 - y3), 0.5);
		double side3 =Math.pow((x3 - x2) * (x3 - x2) - (y3 - y2) * (y3 - y2), 0.5);
		System.out.println(side1 + "  " +  side2 + "  " +  side3);
		double s = (side1 + side2 + side3)/2;
		System.out.println("s" + s);
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		System.out.println("the area of the triangle is " + area);
	}

}
