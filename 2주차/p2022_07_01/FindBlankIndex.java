package p2022_07_01;

public class FindBlankIndex {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		// message의 길이를 구함
		// length() : 문자열의 길이 및 글자수를 구해줌
		int len = message.length();

		System.out.println(len); // len = 34;

		// message 중에서 ' '을 찾음
		for (int i = 0; i < len; i++) {
			char c = message.charAt(i);
			if (c == ' ') {		// 공백의 인덱스 번호 출력
				System.out.println("index = " + i);
			}
		} // for end
	}
}
