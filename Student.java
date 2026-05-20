
import java.util.Scanner;

public class Student {

       static int count=0;
        Student(){
            count++;
            System.out.println("Student count: "+count);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Student s1=new Student();
            Student s2=new Student();
            Student s3=new Student();
        }
    
}
