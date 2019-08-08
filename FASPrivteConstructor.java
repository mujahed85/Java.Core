class A{  
  private A(){}//private constructor  
  void msg(){System.out.println("Hello java");}  
}  
public class FASPrivteConstructor{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
}  