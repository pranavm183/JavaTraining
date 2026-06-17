 package oopsConcepts;
//inheritance ex. 
class ShowMethod {
	void Show(){
		System.out.print("hello");//print write on same line(println prin on next line)
		System.out.println("🐱‍👓🏳");  
		}
}
public class MethodDemo {
	public static void main(String[] args) {
		ShowMethod sm1=new ShowMethod();
		sm1.Show();
	}
}
