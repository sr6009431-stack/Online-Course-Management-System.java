public class empid {
    int emp;
    String name;
    static String company="TCS";
    empid(int emp, String name){
        this.emp=emp;
        this.name=name;
    }   
    void display(){
        System.out.println("Employee id: "+emp + " Employee name: "+name + " Company: "+company);
        
    }

    public static void main(String[] args) {
        empid e1=new empid(101, "vidhanshu");
        empid e2=new empid(102, "Somya");
        e1.display();
        e2.display();
    }
}
