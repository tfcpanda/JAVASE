package test;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * ʹ���û�������ֵ��ʼ������
		 */
		double [] list = new double [5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + list.length + " values: ");
		for(int i = 0;i < list.length;i++) {
			list[i] = input.nextDouble();
		}
		for(int i = 0;i< list.length;i++) {
			System.out.println(list[i]);
		}
	}

}
