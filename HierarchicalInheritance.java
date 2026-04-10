class Vechile
{
    void display(){
        System.out.println("This is a vechile");
    }
}
class Bike extends Vechile
{
    void display1(){
        System.out.println("Bike with 2 wheels...");
    }
}
class Lorry extends Vechile
{
    void display1(){
        System.out.println("Lorry with 8 wheels...");
    }
}
class Car extends Vechile
{
    void display1(){
        System.out.println("Car with 4 wheels...");
    }
}
class HierarchicalInheritance{
    public static void main(String[] args) {
     Bike bike=new Bike();
     Lorry lorry=new Lorry();
     Car car=new Car();
     bike.display();
     bike.display1();
     car.display();
     car.display1();
     lorry.display();
     lorry.display1();
    }
}
