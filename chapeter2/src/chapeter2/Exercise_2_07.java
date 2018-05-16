package chapeter2;

import java.util.Scanner;

public class Exercise_2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		int minute = input.nextInt();
		int hour =  minute / 60;
		int day = hour / 24;
		int year = day / 365;
		System.out.println(minute + " minute is " + year + " year and " + day % 365 + " day" );
		
		
	}

}
