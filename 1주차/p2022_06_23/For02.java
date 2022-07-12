package p2022_06_23;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ~ 10까지 합을 구하는 프로그램을 작성하세요? 
		
		int sum = 0;				// 지역 변수(local variable)
		for(int i=1; i<=10; i++) {	// 지역 변수 : for문 안에서만 사용 가능함
			sum = sum + i;			// sum += i;
			System.out.println("1~"+i+" = "+sum);
		}
		System.out.println("sum = "+sum);
//		System.out.println(i);		// 지역 변수(오류 발생)
		
	}

}
