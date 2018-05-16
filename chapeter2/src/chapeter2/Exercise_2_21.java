package chapeter2;

import java.util.Scanner;

public class Exercise_2_21 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入投资总额，年利率，年数");
	double money = input.nextDouble();
	double rate = input.nextDouble();
	double year = input.nextDouble();
	
	double accumulated = money * Math.pow(1 + rate, year * 12);
	
	System.out.println("未来投资金额是 " + accumulated);
	}
}
