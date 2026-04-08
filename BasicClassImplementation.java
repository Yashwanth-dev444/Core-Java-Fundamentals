class A{
    int a;
    void display(){
        System.out.println("Hello From Class A...");
        System.out.println("value of a from Class A is : "+a);
    }
}
class BasicClassImplementation {
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
        System.out.println("Hello From  class BasicClassImplementation...");
    }
}
