package p2022_06_24;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// p 152 ~ 153
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for(int i=0; i<scores.length; i++)
			sum += scores[i];		// sum = sum + scores[i]
		
		System.out.println("총점 : " + sum);		// 총점 : 260
		double avg = (double)sum / 3;			// 평균 : 86.66666666666667
		System.out.println("평균 : " + avg);
		
		// 평균값을 소수점 두번째 자리까지 출력하세요
		System.out.printf("평균 : %.2f", avg);	// 평균 : 86.67
		
	}

}
