  class p{
public void property(){
System.out.println("GOLD/Land/cash");
}
public void marry(){
System.out.println("parent method:Appalamma/Subbalakshmi");
}
}
class c extends p{
public void marry(){
System.out.println("child method:katrina");
}
}
public class Test{
public static void main (String[]args)
{
p p=new p();
p.marry();
c c=new c();
c.marry();
p p1=new c();
p1.marry();
}
}