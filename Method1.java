class Method1{
static void demo(){
System.out.println("hello method");
}
void demo1(){
System.out.println("hello method1");
}
public static void main(String[] arg){
demo();
Method1 obj=new Method1();
obj.demo1();
}
}