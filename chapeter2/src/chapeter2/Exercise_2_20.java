package chapeter2;

import java.util.Scanner;

public class Exercise_2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入收支余额:");
		double balance  = input.nextDouble();
		System.out.println("输入年利率" );
		double rate = input.nextDouble();
		
		double interest = balance * (rate / 1200);
		double interest2 =( (int)(100*interest)) / 100.0;
		System.out.println("利息为 " + interest2);
	}

}
