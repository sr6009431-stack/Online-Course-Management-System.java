import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=21;
        if(age<18){
            System.out.println("Not Eligible");
        }else{
            System.out.println("Eligible");
        }
    }
}
