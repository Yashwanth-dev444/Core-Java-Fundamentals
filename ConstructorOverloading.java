class Demo{
    String name;
    int roll;
    String branch;
    Demo(String name,int roll,String branch){
        this.name=name;
        this.roll=roll;
        this.branch=branch;
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("Roll Number : "+roll);
    }
    Demo(String name,String branch){
        this.name=name;
        this.branch=branch;
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
    }
}
class ConstructorOverloading {
    public static void main(String[] args) {
        Demo obj=new Demo("Yashwanth",84,"IT");
    }
}
