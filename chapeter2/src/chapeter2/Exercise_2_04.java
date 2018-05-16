package chapeter2;

import java.util.Scanner;

public class Exercise_2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//输入磅数
		System.out.println("请输入磅数");
		double pounds = input.nextDouble();
		//转化成千克数 
		double kilograms = pounds * 0.454;
		System.out.println(pounds +" puounds is " + kilograms + " kilogram");
	}

}
