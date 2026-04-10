class Parent{
    String name;
    int id;
    Parent(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    void display()
    {
        System.out.println("I am "+name+" with ID "+id);
    }
}
class Child extends Parent{
    Child()
    {
    super("Yashwanth",84);
    }
}
class SuperMethod{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
    }
}
