package p2022_06_28;

class MyDate04{   
  int year;    
  int month;    
  int day;  

 public MyDate04(){
    year=2016;    month=4;    day=1;
  }
 
// this : 내부 레퍼런스 변수 
// 	public MyDate04(int year,int month,int day){
// 		this.year=year;		// 2017
// 		this.month=month;	// 7
// 		this.day=day;		// 19
// 	}

  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }

  public MyDate04(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
  }
  
}// MyDate04 end

public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate04 d = new MyDate04();	// 생성자 호출
    System.out.println(d.year);
    System.out.println(d.month);
    System.out.println(d.day);
    d.print();

    MyDate04 d2 = new MyDate04(2017, 7, 19);
    d2.print();
    
    MyDate04 d3 = new MyDate04(2022, 6, 28);
    d3.print();
  }
}            