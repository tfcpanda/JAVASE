package chapeter2;

import java.util.Scanner;

public class Exercise_2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个大于 0 且小于 1000 的数");
		int number = input.nextInt();
		//求第一个数
		int firstNumber =  number/100;
		//将三位数变成一个两位数
		int remainingNumber = number / 10;
		//求第二个数
		int secondNumber = remainingNumber % 10;
		//求第三个数
		int lastNumber = number % 10;
		int sum = firstNumber + secondNumber + lastNumber;
		System.out.println("the sum of the digits is " + sum);
	}

}
