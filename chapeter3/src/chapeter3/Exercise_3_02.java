package chapeter3;

import java.util.Scanner;

public class Exercise_3_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (System.currentTimeMillis() % 10);   
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		int number3 = (int) (System.currentTimeMillis() / 4 % 10);
		Scanner input = new Scanner(System.in);
		System.out.println(number1 + " + " + number2 + " + "+ number3 +"答案是多少" );
		int answer = input.nextInt();
		System.out.println(number1 + " + " + number2 + " + " +number3 + " = " +
		answer + " " + (number1 +  number2 +  + number3 == answer));
	}

}
