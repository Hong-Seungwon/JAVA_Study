package p2022_06_28;

class MyDate{   
  private int year;		// 필드
  private int month;    
  private int day;

  public  MyDate(){		// 기본 생성자(Default Constructor)		
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }  
  public void print(){	// 메소드(Method)
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest02 {     
  public static void main(String[] args) {
    MyDate d = new MyDate();	// 생성자는 객체를 생성할 때 호출
    d.print();	// 생성자 호출

//	접근 제어자가 private이기 때문에 외부 클래스에서 직접 접근 불가
//  System.out.println(d.year);
//  MyDate dd =  new MyDate();
 }
} 