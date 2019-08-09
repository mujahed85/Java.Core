class A
{
    int x,y,z;
    public void setData(int x,int y,int z){
        //x=x;
        this.y=y;
    }
    public void showData(){
        System.out.println("Value of X is "+x);
        System.out.println("Value of Y is "+y);
    }
}
class B{
    int p,q;
    public void showDataWithObject(B objB){
        System.out.println("Value of P is "+objB.p);
        System.out.println("Value of Q is "+objB.q);
    }
    public B getDataWithObject(){
        B objB=new B();
        objB.p=10; objB.q=20;
        return objB;
    }
}
class ThisDemo
{
    public static void main(String[] args) {
        // A a;
        // a=new A();
        // a.setData(10, 20, 30);
        // a.showData();
        B objB=new B();
        objB.p=11;
        objB.q=22;
        B objB1=objB.getDataWithObject();
        objB1.showDataWithObject(objB);
        objB1.showDataWithObject(objB1);
        System.out.println("Welcome");
    }
}