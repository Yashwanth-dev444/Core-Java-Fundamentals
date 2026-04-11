class InnerClass{
    public static void main(String[] args) {
        A obj1=new A();
        obj1.show1();
        A.B obj2=obj1.new B();
        obj2.show2();
    }
}
class A
{
    int age;
    public void show1()
    {
        System.out.println("Inside show1 and  Class A");
    }
    class B{
        public void show2()
        {
            System.out.println("Inside show2, Class B and Calss B Inner to Class A");
        }
    }
}
