// class Rungta {  //parent class
//     int x = 20;
//     void welcome() {
//         System.out.println("Welcome to Java Programming");
//     }
// }
// class CSE extends Rungta {  //child class
//     void hello(){
//         System.out.println("Hello CSE Department");
//     }
// }

// class Parent{
//     void welcome() {
//         System.out.println("Hello form Parent class");
//     }
// }
// class intermediate extends Parent{
//     void morning() {
//         System.out.println("GoodMorning from intermediate class");
//     }
// }
// class child extends intermediate{
//     void afternoon() {
//         System.out.println("GoodAfternoon from child class");
//     }
// }

// public class Single {
//     public static void main(String[] args) {
//         child c = new child();
//         c.welcome();
//         c.morning();
//         c.afternoon();
//     }
// }

// class Parent1{
//     void Hello() {
//         System.out.println("Hello form Parent 1 class");
//     }
// }
// class Parent2{
//     void Hello() {
//         System.out.println("Hello from Parent 2 class");
//     }
// }
// class child extends Parent1, Parent2{  //multiple inheritance is not supported in java
//     void morning() {
//         System.out.println("GoodMorning from child class");
//     }
// }

// class Parent {
//     void hello(){
//         System.out.println("Hello from Parent class");
//     }
// }
// class child1 extends Parent  {
//     void morning() {
//         System.out.println("GoodMorning from child1 class");
//     }
// }
// class child2 extends Parent {
//     void afternoon() {
//         System.out.println("GoodAfternoon from child2 class");
//     }
// }


// public class Single {
//     public static void main(String[] args) {
//         child1 c1 = new child1();
//         c1.hello();
//         c1.morning();

//         child2 c2 = new child2();
//         c2.hello();
//         c2.afternoon();
//     }
// }


// class superParent {
//     void Hello() {
//         System.out.println("Hello from superParent class");
//     }
// }
// class Parent extends superParent {
//     void hello(){
//         System.out.println("Hello from Parent class");
//     }
// }
// class child1 extends Parent  {
//     void morning() {
//         System.out.println("GoodMorning from child1 class");
//     }
// }
// class child2 extends Parent {
//     void afternoon() {
//         System.out.println("GoodAfternoon from child2 class");
//     }
// }
// public class Single {
//     public static void main(String[] args) {
//         child1 c1 = new child1();
//         c1.hello();
//         c1.morning();

//         child2 c2 = new child2();
//         c2.hello();
//         c2.afternoon();
//     }
// }


// compile ocverloading polymorphism example
// class Add{
//     void sum(int a, double  b) {
//         System.out.println("Sum of two numbers: " + (a + b));
//     }
//     void sum(int a,double b, double c) {
//         System.out.println("Sum of three numbers: " + (a + b + c));
//     }   
//     void sum(double d, double e) {
//         System.out.println("Sum of two double numbers: " + (d + e));
//     }
//     void sum(double g,int f) {
//         System.out.println( g + f);
//     }
// }
// public class Single {
//     public static void main(String[] args) {
//         Add a = new Add();
//         a.sum(5, 10.5);
//         a.sum(5, 10.5, 15.0);
//         a.sum(10.5, 20.5);
//         a.sum(10.5, 5);
//     }
// }





// class Manager {
//     void doYourJob() {
//         System.out.println("Manager is doing his job");
//     }
//     void hello() {
//         System.out.println("Hello from Manager class");
//     }
// }
// class Developer extends Manager {
//     void doYourJob() {
//         System.out.println("Developer is doing his job");
//     }
   
// }

// public class Single {
//     public static void main(String[] args) {
//         Manager m = new Developer();
//         m.doYourJob();
//         m.hello();
//         m = new Manager();
//         m.doYourJob();
//         m.hello();
//     }
// }






 //private access modifier example



class bank{
   private double balance = 10;
}
class DBI extends bank {
    void displayBalance() {
        // System.out.println("Balance: " + balance);  //error because balance is private in bank class
    }
}
public class Single {
    public static void main(String[] args) {
        bank b = new DBI();
        // b.balance;  //error because balance is private in bank class
        // System.out.println("Balance: " + b.balance);  //error because balance is private in bank class
    }
}