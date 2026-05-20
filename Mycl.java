import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                arr[row][col] = sc.nextInt();
            }

        }
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}