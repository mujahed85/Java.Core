
class A
{
    public void m1()
    {
        System.out.println("m1 from A Class");
    }
}
class B extends A
{
    public void m1()
    {
        System.out.println("m1 from B Class");
    }
    public void m2()
    {
        System.out.println("m2 from B Class");
    }
}
class CObjectInit
{
    public static void main(String[] args) {
        //B objB=new A();       Error
        A objA=new B();
        B objB=new B();
        objB.m1();
    }
}


 