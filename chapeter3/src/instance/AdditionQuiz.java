package instance;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*利用格林威治时间来求随机数 
		 * number1返回毫秒数，然后求余
		 * number2 用格林威治时间除7求商，然后除10求余
		 */
		int number1 = (int) (System.currentTimeMillis() % 10);   
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		Scanner input = new Scanner(System.in);
		System.out.println(number1 + " + " + number2 + "答案是多少" );
		int answer = input.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + answer + " " + (number1 + number2 == answer));
	}

}
