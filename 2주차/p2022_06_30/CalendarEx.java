package p2022_06_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 3. Calendar 클래스
//		Calendar c1 = new Calendar();			// 오류 발생
		Calendar c2 = new GregorianCalendar();	// 업캐스팅
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(Calendar.YEAR);		// 1
		
		int y = c.get(Calendar.YEAR);			// 연도
		int m = c.get(Calendar.MONTH);			// 월(0 ~ 11)
		int d = c.get(Calendar.DATE);			// 일
		
		System.out.println(y+"-"+m+"-"+d);
		
		int h1 = c.get(Calendar.HOUR);			// 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);	// 24시간
		
		int ap = c.get(Calendar.AM_PM);			// 0:오전, 1:오후
		if(ap == 0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);		// 분
		int s = c.get(Calendar.SECOND);		// 초
		
		System.out.println(h1+":"+mm+":"+s);
		System.out.println(h2+":"+mm+":"+s);
		
	}

}
