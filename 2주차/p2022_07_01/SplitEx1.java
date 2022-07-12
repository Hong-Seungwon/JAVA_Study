package p2022_07_01;

public class SplitEx1 {

	public static void main(String[] args) {
// p512
		// String[] split(String regex)
		
		String text = "홍길동&이수홍,박연수,김자바-최명호|홍승원";
		
		String[] names = text.split("&|,|-|");
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();

		// 향상된 for문
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
