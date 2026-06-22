import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Array ka size enter karo: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int sum = 0;
        
        System.out.println("Array elements enter karo:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }
        
        System.out.println("Array ka total sum hai: " + sum);
    }
}