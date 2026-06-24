import java.util.Scanner;
public class linearsearch{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of elemnts:");
     int n =sc.nextInt();
     int[]arr = new int[n];
     System.out.println("Enter your elements:");
     for (int i=0;i<n;i++){
     arr[i]=sc.nextInt();
    }
    boolean found = false;
    System.out.println("Enter your target element:");
    int target =sc.nextInt();
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            found=true;
        break;
         }
          
         if(found){
            System.out.println("milgya");
         }
         else{
            System.out.println("nah mila..");
            break;
         }
        }
    }
}
