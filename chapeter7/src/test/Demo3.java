package test;

public class Demo3 {

	public static void main(String[] args) {
		//将随机数赋值给数组
		int[] list = new int [10];
		for(int i = 0;i<list.length;i++) {
			list[i] = (int) (Math.random()*100);
		}
		System.out.println("--------------------");

		//打印数组中的每一个值
		for(int i = 0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println("--------------------");

		//对所有的元素求和
		int total = 0;
		for(int i = 0;i<list.length;i++) {
			total += list[i];
			System.out.println(total);
		}
		System.out.println(total);

		System.out.println("--------------------");
		//找出最大的元素
		double max = list[0];
		for(int i = 0;i<list.length;i++) {
			if(list[i]>max) {
				max = list[i];
			}
		}
		System.out.println(max);

		System.out.println("--------------------");
		//找出最大值得下标
		double max1 = list[0];
		double indexofmax = 0;
		for(int i = 0;i<list.length;i++) {
			if(list[i]>max1) {
				max1 = list[i];
				indexofmax = i;
			}
		}
		System.out.println(max);
		System.out.println(indexofmax);

	}

}
