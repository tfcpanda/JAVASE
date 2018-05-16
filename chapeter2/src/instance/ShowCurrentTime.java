package instance;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalmilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalmilliseconds / 1000;  //直到现在还有totalSeconds秒
		
		long currentSecond = totalSeconds % 60;     //现在的秒数
		
		long totalMinutes = totalSeconds / 60;   //直到现在有totalMinutes分钟
		
		long currentMinutes = totalMinutes % 60;  //现在的分钟数
		
		long totalHoust = totalMinutes / 60;  //直到现在有cuttentHouse分钟
		
		long cuttentHouse = totalHoust % 24;   //剩余的小时数
		
		System.out.println(cuttentHouse + ":" + currentMinutes + ":" + currentSecond);
	}

}
