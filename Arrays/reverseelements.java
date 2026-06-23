import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
       

        System.out.println("enter your elements:");
         for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }
        System.out.println("reversed elements are");
        for(int i=n-1;i>=0;i--){
        
            System.out.println(arr[i]+"  ");
        }
         sc.close();


    }
}