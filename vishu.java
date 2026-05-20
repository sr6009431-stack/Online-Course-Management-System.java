public class vishu {
    public static void solve(int arr[]){
   arr[0]++;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[1];
        arr[0] = 10;
        solve(arr);
        System.out.println(arr[0]);
    }
    
}
