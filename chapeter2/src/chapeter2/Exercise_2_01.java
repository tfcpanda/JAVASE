package chapeter2;

import java.util.Scanner;

public class Exercise_2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//请输入摄氏温度
		System.out.println("请输入摄氏温度：");
		double celsius = input.nextDouble();
		//计算为华氏温度
		double fahrenheit = (9.0 / 5) * celsius + 32;
		//显示输出
		System.out.println("华氏温度是"+fahrenheit);
	}

}
