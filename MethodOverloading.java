class Payment{
    void display1()
    {
        System.out.println("Payment Processing...");
    }
}
class CreditCard extends Payment{
    void display()
    {
        System.out.println("Through via CreditCard");
    }
}
class UPI extends Payment{
    void display()
    {
        System.out.println("Through via UPI");
    }
}
class NetBanking extends Payment{
void display()
    {
        System.out.println("Through via NetBanking");
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        UPI obj=new UPI();
        obj.display1();
        obj.display();
    }
}
