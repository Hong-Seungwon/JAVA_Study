package p2022_07_01;

public class InsertStringBuffer {
	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);

		// 인덱스 10번 위치에 very 삽입
		sb1.insert(10, "very");
		System.out.println(sb1);

		// 인덱스 0번 위치에 1004 삽입
		sb1.insert(0, 1004);
		System.out.println(sb1);
	}
}
