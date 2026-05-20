
import java.util.*;
class Student{
    String name;
    int erp;
Student(Scanner sc){
    name= sc.nextLine();                       
    erp= sc.nextInt();
    sc.nextLine();
}
void printInfo(){
    System.out.println(name +" " + erp);
}

}
public class classA3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student arr[]= new Student[5];
        // Arrays.fill(arr,new Student(sc));
         for (int i = 0; i < 5; i++) {
            arr[i] = new Student(sc);
        }
        for (int i=0; i<5; i++){
            arr[i].printInfo();
        }
    }
}