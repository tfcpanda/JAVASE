package test;

public class Demo1 {

	public static void main(String[] args) {
		//声明数组		java语言声明数组
		double [] mylist;
		//声明数组		C语言声明数组
		double mylist1 [];
		
		//创建数组中有new字
		mylist = new double [22];
		
		//声明和创建放在了一起
		double [] array = new double [22];
		//带下标的数组变量和普通变量一样用
		array[0] = 22;
	
		//数组的初始化	不适用new，但是句子不能分开使用
		double [] list = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(list);
	}

}
