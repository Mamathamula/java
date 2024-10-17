class NonStatic{
 static int x=100;
int y=200;//non static/instance variables
public static void main(String[] args){
//int x=100;
System.out.println(x);
//non staatic /instance variables can be accesed with object
NonStatic obj=new NonStatic();
System.out.println(obj.y);
}
}