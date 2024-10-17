public class Overriding {
 void msg()
 {
	 System.out.println("parenet method");
 }
 class Demo extends Overriding{
	 void msg()
	 {
		 System.out.println("child  method");
	 }
		 public static void main(String[] args) {
			 Overriding d=new Overriding();
			 d.msg();
	 }
 }
		

	}