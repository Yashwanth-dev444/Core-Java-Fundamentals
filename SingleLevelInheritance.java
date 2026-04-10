class Employee{
    String name;
    double salary;
    String dept;
    void edisplay()
    {
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
class Manager extends Employee
{
    void mdisplay()
    {
        System.out.println("Employee Details are : ");
        System.out.println("Department : "+dept);
        edisplay();
    }
}
class SingleLevelInheritance{
    public static void main(String[] args) {
    Manager obj=new Manager();
    obj.name="Yashwanth";
    obj.salary=50000;
    obj.dept="IT";
    obj.mdisplay();
    }
}
