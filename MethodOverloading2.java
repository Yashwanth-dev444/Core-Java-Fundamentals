class Area{
    int side;
    int length;
    int breadth;
    Area()
    {
        this.side=side;
        this.length=length;
        this.breadth=breadth;
    }
    int display(int side)
    {
        return side*side;
    }
    double display(double length,double breadth)
    {
        return length*breadth;
    }
}
class MethodOverloading2{
    public static void main(String[] args) {
     Area obj=new Area();
     System.out.println("Area of square is : "+obj.display(4));
     System.out.println("Area of Rectangle is : "+obj.display(4,5));
    }
}
