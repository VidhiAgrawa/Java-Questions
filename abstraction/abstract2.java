// Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.



package abstraction;

import A;
import B;

abstract class bank{
    abstract void getBalance();
}
class A extends bank{
    void getBalance(){
        System.out.println("Deposit in bank A is $100");
    }
}
class B extends bank{
    void getBalance(){
        System.out.println("Deposit in bank B is $200");
    }
}
class C extends bank{
    void getBalance(){
        System.out.println("Deposit in bank C is $300");
    }
}

public class abstract2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
