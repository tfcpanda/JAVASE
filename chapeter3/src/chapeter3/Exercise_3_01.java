package chapeter3;

import java.util.Scanner;

public class Exercise_3_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入a,b,c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double judgment = b * b -4 * a * c;
		
		if(judgment > 0) {
			double r1 = (-b + Math.pow(judgment, 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(judgment, 0.5)) / (2 * a);
			double k1 = (int)(r1 * 100) / 100.0;
			double k2 = (int)(r2 * 100) /100.0;
			System.out.println(k1 + "  " + k2);
		}else if(judgment == 0){
			double r3 = (-b + Math.pow(judgment, 0.5)) / (2 * a);
			double k3 = (int)(r3 * 100) / 100.0;
			System.out.println(k3);
		}else if(judgment < 0){
			System.out.println("没有实数根");
		}
	}

}
