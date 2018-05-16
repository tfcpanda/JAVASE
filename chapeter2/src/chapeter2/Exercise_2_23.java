package chapeter2;

import java.util.Scanner;

public class Exercise_2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("每加仑20英里");
		System.out.println("一加仑20美元");
		System.out.println("请输入驾驶的距离");
		double distent = input.nextDouble();
		double doller = distent/20*20;
		System.out.println("你需要付"+doller+"美元");
		 
	}

}
