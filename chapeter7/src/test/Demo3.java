package test;

public class Demo3 {

	public static void main(String[] args) {
		//���������ֵ������
		int[] list = new int [10];
		for(int i = 0;i<list.length;i++) {
			list[i] = (int) (Math.random()*100);
		}
		System.out.println("--------------------");

		//��ӡ�����е�ÿһ��ֵ
		for(int i = 0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println("--------------------");

		//�����е�Ԫ�����
		int total = 0;
		for(int i = 0;i<list.length;i++) {
			total += list[i];
			System.out.println(total);
		}
		System.out.println(total);

		System.out.println("--------------------");
		//�ҳ�����Ԫ��
		double max = list[0];
		for(int i = 0;i<list.length;i++) {
			if(list[i]>max) {
				max = list[i];
			}
		}
		System.out.println(max);

		System.out.println("--------------------");
		//�ҳ����ֵ���±�
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
