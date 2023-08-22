import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Element:-");
        for(int i=0; i<5; i++){
         a[i]=sc.nextInt();
        }
        System.out.print("Array Element:-");
        for(int i=0; i<5; i++){
         System.out.print(a[i]+" ");
        }
         System.out.print("\nArray Reverse Element:-");
         for(int i=5-1; i>=0;i--){
            System.out.print(a[i]+" ");
         }
    }

            
}
    
    

